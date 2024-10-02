package Session1;

public class ExempleConstante {
    // Déclaration d'une constante avec le mot-clé final
    public static final double PI = 3.14159265359;

    public static void main(String[] args) {
        // Utilisation de la constante PI
        double rayon = 5.0;
        double circonférence = 2 * PI * rayon;
        double aire = PI * rayon * rayon;

        System.out.println("Circonférence : " + circonférence);
        System.out.println("Aire : " + aire);

        // Tentative de modification de la constante (ceci provoquera une erreur de compilation)
        // PI = 3.0; // Cette ligne générera une erreur de compilation
    }
}
