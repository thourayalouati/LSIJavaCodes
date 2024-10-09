package Session4;

import java.util.ArrayList;

public class PassageParAdresse {
    public static void main(String[] args) {
        ArrayList<Integer> nombres = new ArrayList<>();
        nombres.add(10);
        nombres.add(20);
        System.out.println("Avant la modification: " + nombres);

        modifierListe(nombres);
        System.out.println("Après la modification: " + nombres);
    }

    public static void modifierListe(ArrayList<Integer> liste) {
        liste.add(30); // Ajout d'un nouvel élément à la liste
        liste.set(0, 50); // Modification de l'élément à l'index 0
        System.out.println("Dans la méthode, liste modifiée: " + liste);
    }
}
