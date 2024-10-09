package Session4;

import java.util.Scanner;

public class ManipulationDeChaines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1);
        // Au lieu de créer une nouvelle chaîne, le compilateur référence la chaîne déjà présente
        // dans la pool.
        if (s1 == s2) {
            System.out.println("s1 et s2 font référence au même objet !");
        } else {
            System.out.println("s1 et s2 font référence à des objets différents !");
        }

        // Chaîne de départ
        String chaine = "Bonjour, comment ça va ?";

        // Utilisation de replace pour remplacer une sous-chaîne
        String nouvelleChaine = chaine.replace("ça va", "tu vas");

        System.out.println("Chaîne d'origine : " + chaine);
        System.out.println("Nouvelle chaîne : " + nouvelleChaine);

        // Utilisation de substring pour extraire une sous-chaîne
        String sousChaine = chaine.substring(8, 15); // Extraire "comment"
        System.out.println("Sous-chaîne : " + sousChaine);

        // Utilisation de charAt pour obtenir un caractère à une position donnée
        char caractere = chaine.charAt(0); // Le premier caractère, 'B'
        System.out.println("Premier caractère : " + caractere);

        // Lecture d'un caractère à partir du clavier
        System.out.print("Entrez un caractère : ");
        char inputChar = scanner.next().charAt(0); // Lire le premier caractère de l'entrée utilisateur
        System.out.println("Vous avez entré le caractère : " + inputChar);

        // Exemple d'utilisation du caractère lu
        if (inputChar == 'a') {
            System.out.println("Le caractère est 'a'.");
        } else {
            System.out.println("Le caractère n'est pas 'a'.");
        }

        scanner.close();
    }
}
