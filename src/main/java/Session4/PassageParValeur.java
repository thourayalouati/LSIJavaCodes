package Session4;

public class PassageParValeur {
    public static void main(String[] args) {
        int nombre = 10;
        System.out.println("Avant le passage: " + nombre);
        nombre=changerValeur(nombre);
        System.out.println("Après le passage: " + nombre);
    }

    public static int changerValeur(int n) {
        n = 20; // Cette modification n'affecte pas 'nombre'
        System.out.println("Dans la méthode, n = " + n);
        return n;
    }
}

