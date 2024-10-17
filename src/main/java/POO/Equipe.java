package POO;

public class Equipe {

    public static void main(String[] args)

    {
        Joueur j = new Joueur();
        Joueur j2 = new Joueur("Ali","Ali",25,"Tunisienne");

        System.out.println(j.getNom());
        System.out.println(j2.getNom());
    }
}
