import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {





    public static void main(String[] args) {


        System.out.println("Podaj port");
        Scanner scanner = new Scanner(System.in);
        String ipAddress = scanner.nextLine();

        //funkcja, która sprawdza, czy adress ip jest poprawny - jak tak, nic nie robi, jak nie, przerywa program i wypisuje błąd

        Map<String, String> result = new HashMap<>();

        //todo potem przerobić to na wiele wątków
        for (int i = 1; i <= 1024; i++) {
            //nawiąż połączenie
            //jak się udało, to nic nie rób i zamknij połączenie
            //jak się nie udało, to dodaj do mapy:
            result.get(i, powód nie udania się);
        }


        System.out.println("Wynik:");
        System.out.println(result.toString());
    }
}