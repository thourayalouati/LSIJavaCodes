package Exception;


import java.util.Scanner;

public class DivisionDeuxNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez le premier nombre : ");
            int nombre1 = scanner.nextInt();

            System.out.print("Entrez le deuxième nombre : ");
            int nombre2 = scanner.nextInt();

            if (nombre2 == 0) {
                throw new ArithmeticException("Division par zéro impossible !");
            }

            double resultat = (double) nombre1 / nombre2;
            System.out.println("Le résultat de la division de " + nombre1 + " par " + nombre2 + " est : " + resultat);
        }  catch (ArithmeticException e) {
            System.out.println("Erreur : " + e.getMessage());
            e.printStackTrace();
        }  catch (Exception e)
        {    System.out.println("Erreur : " + e.getMessage());}
        finally {
            scanner.close();
        }
    }
}

