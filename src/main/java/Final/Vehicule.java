package Final;

// Classe finale
class Vehicule {
    private String modele;

    public Vehicule(String modele) {
        this.modele = modele;
    }

    public String getModele() {
        return modele;
    }

    // Méthode finale
    final public void afficherDetails() {
        System.out.println("Modèle du véhicule : " + modele);
        afficherAutresDetails(); // Appel à la méthode interne
    }

    // Méthode interne que l'on peut appeler depuis la méthode finale
    private void afficherAutresDetails() {
        System.out.println("Autres détails du véhicule...");
    }
}