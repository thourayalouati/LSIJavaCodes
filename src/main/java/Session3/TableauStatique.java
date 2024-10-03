package Session3;

public class TableauStatique {
    public static void main(String[] args) {
        int[] tableau = new int[5];

        for (int i = 0; i < 5; i++) {
            tableau[i] = i + 1;
        }

        System.out.println(tableau);
        System.out.println("Contenu du tableau : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(tableau[i]);

        }
    }
}
