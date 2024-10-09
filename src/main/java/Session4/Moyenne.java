package Session4;

import java.util.Scanner;

class Moyenne {
    public double moyenne(double x, double y) {
        return (x + y) / 2.0;
    }

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez la première note: ");
        double note1 = clavier.nextDouble();

        System.out.print("Entrez la deuxième note: ");
        double note2 = clavier.nextDouble();

        Moyenne calculateur = new Moyenne();
        double result = calculateur.moyenne(note1, note2);

        System.out.println("La moyenne des deux notes est: " + result);

        clavier.close();
    }
}
