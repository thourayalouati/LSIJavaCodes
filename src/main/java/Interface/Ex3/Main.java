package Interface.Ex3;

public class Main {
    public static void main(String[] args) {
        // Utilisation d'une expression lambda pour implémenter l'interface fonctionnelle
        Convertisseur<String, Integer> convertisseur = s -> Integer.parseInt(s);

        int resultat = convertisseur.convertir("123"); // Appel de la méthode convertir

        System.out.println("Résultat : " + resultat); // Affiche "Résultat : 123"
    }
}