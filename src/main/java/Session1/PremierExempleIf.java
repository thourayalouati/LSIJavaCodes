package Session1;

import java.util.Scanner;

public class PremierExempleIf {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String [] args)
    {
     System.out.print("Entrer votre nombre :");
     int n=scanner.nextInt();

     if (n<5){
         System.out.println("Votre nombre est plus petit que 5");
     }
     else  {
         System.out.println("Votre nombre est plus grand que 5");
     }
      System.out.println("fin du programme");
    }
}
