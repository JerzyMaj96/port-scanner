import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PortScanner {

//todo potem przerobić to na wiele wątków

    private static final int TIMEOUT = 200;

    public Map<Integer, String> scan(String ipAddress) {

        Map<Integer, String> result = Collections.synchronizedMap(new HashMap<>());

        ExecutorService executor = Executors.newFixedThreadPool(50);

        for (int i = 1; i <= 1024; i++) {
            final int port = i;

            executor.submit(() ->
                    {
                        try (Socket socket = new Socket()) {
                            socket.connect(new InetSocketAddress(ipAddress, port), TIMEOUT);
                        } catch (Exception ex) {
                            result.put(port, ex.getMessage());
                        }
                    }
            );
        }

        executor.shutdown();

        try {
            if (!executor.awaitTermination(5, TimeUnit.MINUTES)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException ex) {
            executor.shutdownNow();
        }

        return result;
    }
}
