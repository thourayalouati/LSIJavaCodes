package Exception;

public class GestionExceptions {

    public static void main(String[] args) {

        // Exemple d'exception ArithmeticException
        int dividend = 10;
        int diviseur = 0;
        try {
            int resultat = dividend / diviseur; // Déclenche ArithmeticException
            System.out.println(resultat);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException attrapée : " + e.getMessage());
        }

        // Exemple d'exception NullPointerException
        String str = null;
        try {
            System.out.println(str.length()); // Déclenche NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException attrapée : " + e.getMessage());
        }

        // Exemple d'exception ArrayIndexOutOfBoundsException
        int[] tableau = { 1, 2, 3 };
        try {
            System.out.println(tableau[3]); // Déclenche ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException attrapée : " + e.getMessage());
        }

        // Exemple d'exception NumberFormatException
        String texte = "abc";
        try {
            int nombre = Integer.parseInt(texte); // Déclenche NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException attrapée : " + e.getMessage());
        }



        // Exemple d'exception générique Exception
        int[] tableau2 = null;
        try {
            if (tableau2 == null) {
                throw new Exception("Le tableau est null"); // Déclenche Exception personnalisée
            }
        } catch (Exception e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
    }
}
