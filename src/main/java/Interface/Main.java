package Interface;

public class Main {
    public static void main(String[] args) {
        Forme forme1 = new Cercle();
        Forme forme2 = new Carre();

        forme1.dessiner(); // Appel de la méthode dessiner pour un cercle
        forme2.dessiner(); // Appel de la méthode dessiner pour un carré
    }
}