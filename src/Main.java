import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PortScanner portScanner = new PortScanner();
        String ipAddress = "";

        while (true) {
            System.out.println("Podaj adres IP (lub wpis '1' dla tego komputera, 'exit' żeby wyjść):");
            ipAddress = scanner.nextLine().trim();

            if (ipAddress.equalsIgnoreCase("exit")) {
                break;
            }

            if (ipAddress.equals("1")) {
                try {
                    ipAddress = InetAddress.getLocalHost().getHostAddress();
                } catch (UnknownHostException ex) {
                    System.out.println(ex.getMessage());
                    continue;
                }
            }

            if (PortValidator.isValid(ipAddress)) {
                Map<Integer, String> result = portScanner.scan(ipAddress);
                result.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
            } else {
                System.out.println("Niepoprawny adres ip: " + ipAddress);
            }
        }
    }
}