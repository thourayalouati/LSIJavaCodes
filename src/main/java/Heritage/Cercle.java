package Heritage;

class Cercle extends FigureGeometrique {

    private double rayon;


    public Cercle(String nom, Position position) {
        super(nom, position);
        rayon=0.0;
    }
    public double surface(){
        return rayon*rayon*3.14;
    }
}
