package Session4;

public class PassageParValeur {
    public static void main(String[] args) {
        int nombre = 10;
        System.out.println("Avant le passage: " + nombre);
        changerValeur(nombre);
        System.out.println("Après le passage: " + nombre);
    }

    public static void changerValeur(int n) {
        n = 20; // Cette modification n'affecte pas 'nombre'
        System.out.println("Dans la méthode, n = " + n);
    }
}

