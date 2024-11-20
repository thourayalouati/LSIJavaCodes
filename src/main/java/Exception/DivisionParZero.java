package Exception;

public class DivisionParZero {
    public static void main(String[] args) {
        int numerateur = 10;
        int denominateur = 2;
        int resultat;

        try {
            resultat = effectuerDivision(numerateur, denominateur);
            System.out.println("Le résultat de la division est : " + resultat);
        } catch (ArithmeticException e) {
            System.out.println("Erreur : Division par zéro impossible."+e.getMessage());
        } finally {
            System.out.println("Bloc finally : Ce code est exécuté même après l'exception.");
        }


        // Suite du programme après le bloc try-catch-finally
        System.out.println("Suite du programme...");
    }

    public static int effectuerDivision(int numerateur, int denominateur) {
        if (denominateur == 0) {
            throw new ArithmeticException("Tentative de division par zéro");
        }
        return numerateur / denominateur;
    }
}

