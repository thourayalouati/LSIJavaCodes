public class Joueur {

    private String nom;
    private String prenom;
    private int age;

    private String nationalite;


    public Joueur()
    {
        nom="";
        prenom="";
        age=0;
        nationalite="";
    }

    public Joueur(String nom, String prenom, int age, String nationalite)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
        this.nationalite=nationalite;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }
}
