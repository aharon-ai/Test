import java.util.*;
 
public class Bmi 
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte Größe in cm eingeben");
	    Double groesse = input.nextDouble();    
        System.out.println("Bitte Gewicht in ganzen kg eingeben");
	    double gewicht = input.nextDouble();
        input.close();
        double bmi = gewicht/(groesse/100*groesse/100);    
        System.out.println("Ihr BMI beträgt " + bmi);
        if (bmi <= 18.5) {
            System.out.println("Sie haben Untergewicht");
            }
        else {
            if (bmi < 25){
                System.out.println("Sie haben Normalgewicht");
            }
            else {
                if (bmi < 30) {
                    System.out.println("Sie haben Uebergewicht");
                }
                else {
                    System.out.println("Sie haben Adipositas");
                     }
                }   
            }   
    }
}