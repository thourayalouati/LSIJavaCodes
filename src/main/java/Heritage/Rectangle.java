package Heritage;

public class Rectangle extends FigureGeometrique {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur, Position position) {
        super("Rectangle", position);
        this.longueur = longueur;
        this.largeur = largeur;

    }

    @Override
    public double aire() {
        System.out.println(nom);
        nom="Ali2";
        return longueur * largeur;

    }

    @Override
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double surface(){
        super.surface();
        System.out.println("surface de la classe rectangle");
        return longueur*largeur;
    }
}

