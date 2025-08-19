import java.util.*;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie bitte ihren Namen ein");
        String name = input.nextLine();
        System.out.println("Geben sie bitte ire Alter ein");
        int alter = input.nextInt();
        System.out.println("Geben Sie ihre Körpergröße ein");
        double groesse = input.nextDouble();
        System.out.println("Sie heißen " + name + ", sind " + alter + " Jahre alt und sind " + groesse + "gross.");
        input.close();
    }
}
