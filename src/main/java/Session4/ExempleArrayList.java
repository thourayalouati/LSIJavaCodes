package Session4;
import java.util.ArrayList;
public class ExempleArrayList {
    public static void main(String[] args) {
        // Création d'une ArrayList d'entiers
        ArrayList<Integer> listeEntiers = new ArrayList<>();
        // Ajout d'éléments à l'ArrayList
        listeEntiers.add(10);
        listeEntiers.add(20);
        listeEntiers.add(30);
        listeEntiers.add(40);
        // Affichage de la taille de l'ArrayList
        System.out.println("Taille de l'ArrayList : " + listeEntiers.size());
        // Accès à un élément spécifique par index avec get
        int element = listeEntiers.get(2);
        System.out.println("Élément à l'index 2 : " + element);
        // Modification d'un élément par index avec set
        listeEntiers.set(1, 25);
        System.out.println("Nouvelle valeur à l'index 1 : " + listeEntiers.get(1));

        // Vérification si l'ArrayList est vide avec isEmpty
        boolean estVide = listeEntiers.isEmpty();
        System.out.println("L'ArrayList est vide : " + estVide);

        // Suppression d'un élément par valeur avec remove
        listeEntiers.remove(Integer.valueOf(30)); // Supprime la première occurrence de 30
        System.out.println("Après suppression de 30 : " + listeEntiers);

        // Suppression de tous les éléments avec clear
        listeEntiers.clear();
        System.out.println("Après suppression de tous les éléments : " + listeEntiers);



    }
}
