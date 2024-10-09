package Session4;

public class TableauComparaison {

    public static void main(String[] args) {
        // Exemple de tableaux à comparer
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        // Comparaison des tableaux
        if (a == null || b == null || a.length != b.length) {
            System.out.println("contenus différents ou nuls");
        } else {
            int i = 0;
            while (i < a.length && (a[i] == b[i])) {
                ++i;
            }
            if (i >= a.length) {
                System.out.println("contenus identiques");
            } else {
                System.out.println("contenus différents");
            }
        }
    }
}

