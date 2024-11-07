package Heritage;

public class  FigureGeometrique {

    protected String nom;
    private Position position;

    public FigureGeometrique(String nom, Position position) {
        this.nom = nom;
        this.position = position;
    }

    public double aire() {
        System.out.println(nom);
        return 0.0;
    }

    public double perimetre() {
        return 0.0;
    }

    public double surface(){
        System.out.println("surface de la classe mere");
        return 0.0;
    }

    public String getNom() {
        return nom;
    }

    public Position getPosition() {
        return position;
    }
}
