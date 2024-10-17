package POO;

import java.util.Objects;

class Rectangle {
    // déclaration des attributs
    private double hauteur;
    private double largeur;
    // définition des méthodes

    public Rectangle(double hauteur, double  largeur)
    {
        this.hauteur=hauteur;
        this.largeur=largeur;
    }
    public Rectangle()
    {
      this(4,5);

    }
    //Constructeur avec paramètres
   public Rectangle(int hauteur)
    {
        this.hauteur=hauteur;
        largeur=0;
    }


    public Rectangle(Rectangle r1)
    {
        hauteur=r1.getHauteur();
        largeur=r1.getLargeur();
    }
    public double surface()
    { return hauteur * largeur; }
    public double getHauteur() { return hauteur; }
    public double getLargeur() { return largeur; }
    public void setHauteur(double h)
    { hauteur = h; }
    public void setLargeur(double l)
    { largeur = l; }

    public String toSring()
    {
        return "Rectangle" + hauteur + "x "+ largeur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.hauteur, hauteur) == 0 && Double.compare(rectangle.largeur, largeur) == 0;
    }




}