package Object;

public class Main {

    public static void main(String[] args) {
        Personne personne1 = new Personne("Alice", 25);
        Personne personne2 = new Personne("Bob", 30);
        Personne personne3 = new Personne("Alice", 25);

        // Utilisation de toString() pour obtenir la représentation textuelle de l'objet
        System.out.println("Personne 1 : " + personne1.toString());

        // Utilisation de equals() pour comparer deux objets
        System.out.println("personne1 equals personne2 : " + personne1.equals(personne2)); // Renvoie false
        System.out.println("personne1 equals personne3 : " + personne1.equals(personne3)); // Renvoie true

        // Utilisation de hashCode() pour obtenir le code de hachage de l'objet
        System.out.println("HashCode personne1 : " + personne1.hashCode());
        System.out.println("HashCode personne2 : " + personne2.hashCode());
        System.out.println("HashCode personne3 : " + personne3.hashCode());
    }
}
