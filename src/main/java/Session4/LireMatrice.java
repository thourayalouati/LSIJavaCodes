package Session4;

import java.util.Scanner;

public class LireMatrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander les dimensions de la matrice
        System.out.print("Entrez le nombre de lignes : ");
        int lignes = scanner.nextInt();
        System.out.print("Entrez le nombre de colonnes : ");
        int colonnes = scanner.nextInt();

        // Déclarer la matrice
        int[][] matrice = new int[lignes][colonnes];

        // Lire les éléments de la matrice à partir du clavier
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                System.out.print("Entrez l'élément [" + i + "][" + j + "] : ");
                matrice[i][j] = scanner.nextInt();
            }
        }

        // Afficher les éléments de la matrice
        System.out.println("La matrice est :");
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                System.out.print(matrice[i][j] + "\t"); // "\t" pour l'alignement des colonnes
            }
            System.out.println(); // Nouvelle ligne après chaque ligne de la matrice
        }

        scanner.close();
    }
}
