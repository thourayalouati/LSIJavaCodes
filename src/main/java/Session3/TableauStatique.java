package Session3;

public class TableauStatique {
    public static void main(String[] args) {
        int[] tableau = new int[5];
        int [] scores={100,200,300,400};
        for (int i = 0; i < 5; i++) {
            tableau[i] = i + 1;
        }

        System.out.println(tableau);
        System.out.println("Contenu du tableau : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(tableau[i]);

        }
        System.out.println("Contenu du tableau des scores : ");
        for (int i = 0; i < 3; i++) {
            System.out.println(scores[i]);

        }
    }
}
