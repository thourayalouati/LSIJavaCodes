package Object;

public class Personne  {
    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Méthode pour obtenir une représentation textuelle de l'objet
    @Override
    public String toString() {
        return ("Personne [nom=" + nom + ", age=" + age + "]");
    }

    // Méthode pour comparer deux objets
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Personne personne = (Personne) obj;
        return age == personne.age && nom.equals(personne.nom);
    }


}

