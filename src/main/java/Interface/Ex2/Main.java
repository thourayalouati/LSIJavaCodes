package Interface.Ex2;

public class Main {
    public static void main(String[] args) {
        Calculateur calculateur = new Calculateur();

        int somme = calculateur.additionner(5, 3); // Appel de la méthode additionner
        int difference = calculateur.soustraire(8, 3); // Appel de la méthode soustraire

        System.out.println("Somme : " + somme); // Affiche "Somme : 8"
        System.out.println("Différence : " + difference); // Affiche "Différence : 5"
    }
}
