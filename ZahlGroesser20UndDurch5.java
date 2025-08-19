import java.util.Scanner;

public class ZahlGroesser20UndDurch5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int versuche = 0;
        int zahl;

        do {
            System.out.print("Bitte eine Zahl eingeben, die größer als 20 ist und durch 5 teilbar: ");
            zahl = scanner.nextInt();
            versuche++;
        } while (zahl <= 20 || zahl % 5 != 0);

        System.out.println("Danke! Sie haben " + versuche + " Versuch(e) gebraucht.");
        scanner.close();
    }
}

