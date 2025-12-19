import java.util.HashMap;
import java.util.Map;

public class PortScanner {

//todo potem przerobić to na wiele wątków

    public Map<Integer, String> scan(String ipAddress) {

        Map<Integer, String> result = new HashMap<>();


        for (int i = 1; i <= 1024; i++) {

            //nawiąż połączenie

            //jak się uda, to zamknij

            //jak nie, to to:
            result.put(i, "powód nie udania się");
        }

        return result;
    }




}
