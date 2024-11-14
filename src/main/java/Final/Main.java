package Final;

public class Main {
    public static void main(String[] args) {
        //Une variable final
        final int AGE=30;
        Vehicule vehicule = new Vehicule("Berline");
        vehicule.afficherDetails(); // Appel à la méthode finale

        // Tentative d'overriding (redéfinition) d'une méthode finale (ceci générera une erreur)

    }
}
