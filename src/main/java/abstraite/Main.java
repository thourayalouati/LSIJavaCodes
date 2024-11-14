package abstraite;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


       // Forme f=new Forme();

        ArrayList<Forme> formes=new ArrayList<>();

        Rectangle rectangle = new Rectangle("Mon Rectangle", 5.0, 3.0);
        Cercle cercle = new Cercle("Mon Cercle", 2.0);

        formes.add(rectangle);
        afficherAire(rectangle);
        afficherAire(cercle);
    }

    public static void afficherAire(Forme forme) {
        System.out.println("Nom de la forme : " + forme.getNom());
        System.out.println("Aire : " + forme.calculerAire());
        System.out.println();
    }
}
