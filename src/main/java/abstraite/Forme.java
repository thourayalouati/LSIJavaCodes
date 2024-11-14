package abstraite;

public abstract class Forme {
    private String nom;

    public Forme(String nom) {
        this.nom = nom;
    }

    // Méthode abstraite pour calculer l'aire de la forme
    public abstract double calculerAire();



    public String getNom() {
        return nom;
    }
}
