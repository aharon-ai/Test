import java.util.Scanner;

public class ZahlZwischen0Und10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int versuche = 0;
        int zahl;

        do {
            System.out.print("Bitte eine Zahl zwischen 0 und 10 eingeben: ");
            zahl = scanner.nextInt();
            versuche++;
        } while (zahl < 0 || zahl > 10);

        System.out.println("Danke! Sie haben " + versuche + " Versuch(e) gebraucht.");
        scanner.close();
    }
}