package POO;

import java.util.Scanner;

class Geometrie
{
    private final static Scanner CLAVIER = new Scanner(System.in);
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle();
        double lu;
        System.out.print("Quelle hauteur ? ");
        lu = CLAVIER.nextDouble();
        rect.setHauteur(lu);
        System.out.print("Quelle largeur ? ");
        lu = CLAVIER.nextDouble();
        rect.setLargeur(lu);
        System.out.println("surface = " + rect.surface());
    }
}
