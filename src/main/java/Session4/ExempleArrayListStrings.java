package Session4;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExempleArrayListStrings {
    public static void main(String[] args) {
        // Création d'une ArrayList de chaînes
        ArrayList<String> listeChaines = new ArrayList<>();

        // Ajout d'éléments à l'ArrayList
        listeChaines.add("Bonjour");
        listeChaines.add("Au revoir");
        listeChaines.add("Merci");
        listeChaines.add("À bientôt");

        // Affichage de la taille de l'ArrayList
        System.out.println("Taille de l'ArrayList : " + listeChaines.size());

        // Accès à un élément spécifique par index avec get
        String element = listeChaines.get(2);
        System.out.println("Élément à l'index 2 : " + element);

        // Modification d'un élément par index avec set
        listeChaines.set(1, "Salut");
        System.out.println("Nouvelle valeur à l'index 1 : " + listeChaines.get(1));

        // Vérification si l'ArrayList est vide avec isEmpty
        boolean estVide = listeChaines.isEmpty();
        System.out.println("L'ArrayList est vide : " + estVide);

        // Vérification si un élément est présent dans l'ArrayList
        String recherche = "Bonjour";
        boolean contient = listeChaines.contains(recherche);
        System.out.println("L'ArrayList contient '" + recherche + "' : " + contient);

        // Obtention de l'index d'un élément
        int index = listeChaines.indexOf("Salut");
        System.out.println("Index de 'Salut' : " + index);

        // Suppression d'un élément par valeur avec remove
        listeChaines.remove("Merci"); // Supprime la première occurrence de "Merci"
        System.out.println("Après suppression de 'Merci' : " + listeChaines);

        // Lecture d'une nouvelle chaîne à partir du clavier
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une nouvelle chaîne à ajouter : ");
        String nouvelleChaine = scanner.nextLine();
        listeChaines.add(nouvelleChaine);

        // Affichage de l'ArrayList après ajout
        System.out.println("ArrayList après ajout : " + listeChaines);

        // Tri de l'ArrayList
        Collections.sort(listeChaines);
        System.out.println("ArrayList triée : " + listeChaines);

        // Suppression de tous les éléments avec clear
        listeChaines.clear();
        System.out.println("Après suppression de tous les éléments : " + listeChaines);

        // Fermer le scanner
        scanner.close();
    }
}

