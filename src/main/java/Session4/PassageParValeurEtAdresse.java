package Session4;

import java.util.ArrayList;

public class PassageParValeurEtAdresse {
    public static void main(String[] args) {
        // Exemple de passage par valeur pour un type primitif (int)
        int a = 10;
        System.out.println("Avant méthode : a = " + a);
        a = modifierValeur(a); // Renvoie la nouvelle valeur
        System.out.println("Après méthode : a = " + a);

        // Exemple de passage par adresse pour un objet (ArrayList)
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        System.out.println("Avant méthode : liste = " + liste);
        modifierListe(liste); // Modifie la liste d'origine
        System.out.println("Après méthode : liste = " + liste);
    }

    public static void modifierListe(ArrayList<Integer> liste) {
        liste.add(3); // Modification de l'objet référé par la copie de la référence
        System.out.println("À l'intérieur de la méthode : liste = " + liste);
    }

    public static int modifierValeur(int x) {
        x = 20; // Modification de la copie locale
        System.out.println("À l'intérieur de la méthode : x = " + x);
        return x; // Retourne la nouvelle valeur
    }
}
