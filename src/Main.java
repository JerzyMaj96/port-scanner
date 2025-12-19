import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PortScanner portScanner = new PortScanner();
        String ipAddress = "";

        while (true) {
            System.out.println("Podaj adres IP:");
            ipAddress = scanner.nextLine();
            ipAddress = ipAddress.trim();

            if (ipAddress.equalsIgnoreCase("exit")) {
                break;
            }

            if (PortValidator.isValid(ipAddress)) {
                Map<Integer, String> result = portScanner.scan(ipAddress);
                result.forEach((port, message) -> System.out.println(port + ": " + message));
            } else {
                System.out.println("Niepoprawny adres ip: " + ipAddress);
            }
        }
    }
}