package Session3;

import java.util.ArrayList;
import java.util.Scanner;

public class TableauDynamique {
    public static void main(String[] args) {
        ArrayList<String> mots = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisissez des mots (tapez 'stop' pour arrêter) :");
        String mot;

        while (!(mot = scanner.nextLine()).equals("stop")) {
            mots.add(mot);
        }

        System.out.println("Mots saisis :");
        for (String m : mots) {
            System.out.println(m);
        }
    }
}
