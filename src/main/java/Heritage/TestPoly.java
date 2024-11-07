package Heritage;

import java.util.ArrayList;

public class TestPoly {


    public static void main(String[] args) {
        // Créez une ArrayList pour stocker des objets de type FigureGeometrique
        ArrayList<FigureGeometrique> figures = new ArrayList<>();

        // Ajoutez des objets de différentes classes à la liste
        figures.add(new Rectangle(5.0, 3.0, new Position(0, 0)));
        figures.add(new Rectangle(4.0, 2.0, new Position(1, 1)));
        figures.add(new Cercle("Cercle", new Position(2, 2)));
        figures.add(new Rectangle(6.0, 4.0, new Position(3, 3)));

        // Parcourez la liste et appelez les méthodes polymorphiques
        for (FigureGeometrique figure : figures) {
            System.out.println("Nom de la figure : " + figure.getNom());
            System.out.println("Position : " + figure.getPosition().toString());
            System.out.println("Aire : " + figure.aire());
            System.out.println("Périmètre : " + figure.perimetre());
            System.out.println("Surface : " + figure.surface());
            System.out.println();
        }
    }
}
