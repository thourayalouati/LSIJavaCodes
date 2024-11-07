package Heritage;

public class Personnage {

    protected String nom;
    private int energie;
    private int dureeVie;

    public Personnage() {
        nom="";
        energie=0;
        dureeVie=0;
    }

    /*public Personnage(String nom, int energie, int dureeVie) {
        this.nom = nom;
        this.energie = energie;
        this.dureeVie = dureeVie;
    }*/

    void recontrer(Personnage p){
        System.out.println("Rencontrer dans la classe mère Personnage");
    }

    public String getNom() {
        return nom;
    }

    public int getEnergie() {
        return energie;
    }

    public int getDureeVie() {
        return dureeVie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
    }

    public void setDureeVie(int dureeVie) {
        this.dureeVie = dureeVie;
    }
}
