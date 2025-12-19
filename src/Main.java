import java.util.Scanner;

public class Main {





    public static void main(String[] args) {
        System.out.println("Podaj adres IP:");
        Scanner scanner = new Scanner(System.in);
        PortScanner portScanner = new PortScanner();

        String ipAddress = "";


        while (ipAddress.toLowerCase().trim().equals("exit") ) {
            ipAddress = scanner.nextLine();
            ipAddress = ipAddress.trim();

            if (PortValidator.isValid(ipAddress)) {
                System.out.println(portScanner.scan(ipAddress).toString());
                ipAddress = "";
            } else {
                System.out.println("Niepoprawny adres ip: " + ipAddress);
            }
            System.out.println("Podaj adres IP:");
        }

    }
}