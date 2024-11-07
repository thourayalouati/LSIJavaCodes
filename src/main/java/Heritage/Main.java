package Heritage;

public class Main {
    public static void main(String[] args) {
        Position position = new Position(2.0, 3.0); // Créez une position avec des coordonnées x et y
        Rectangle monRectangle = new Rectangle(5, 3, position); // Créez un rectangle avec une position spécifiée
        System.out.println("Nom de la figure : " + monRectangle.getNom());
        System.out.println("Position de la figure (x, y) : (" + monRectangle.getPosition().getX() + ", " + monRectangle.getPosition().getY() + ")");
        System.out.println("Aire du rectangle : " + monRectangle.aire());
        System.out.println("Périmètre du rectangle : " + monRectangle.perimetre());


        FigureGeometrique f=new FigureGeometrique("a",position);
        System.out.println(f.nom);
    }
}
