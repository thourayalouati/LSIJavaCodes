package Session4;

import java.util.Scanner;

public class LireTableau {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Déclarer le tableau
        double[] tab = new double[taille];

        // Lire les éléments du tableau à partir du clavier
        for (int i = 0; i < tab.length; ++i) {
            System.out.print("Entrez l'élément " + i + " : ");
            tab[i] = scanner.nextDouble();
        }

        // Afficher les éléments du tableau
        System.out.println("Les éléments du tableau sont :");
        for (double element : tab) {
            System.out.println(element);
        }

        scanner.close();
    }
}

