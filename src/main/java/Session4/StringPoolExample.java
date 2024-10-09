package Session4;

import java.util.Scanner;

public class StringPoolExample {
    public static void main(String[] args) {
        // Utilisation de littéraux de chaînes
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println("Littéraux :");
        System.out.println("s1 == s2: " + (s1 == s2)); // true

        // Utilisation de new String()
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println("\nAvec new String():");
        System.out.println("str1 == str2: " + (str1 == str2)); // false

        // Utilisation de intern()
        String internedStr1 = str1.intern();
        String internedStr2 = str2.intern();

        System.out.println("\nAprès intern():");
        System.out.println("internedStr1 == internedStr2: " + (internedStr1 == internedStr2)); // true

        // Lecture d'une chaîne à partir du clavier
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEntrez une chaîne : ");
        String userInput = scanner.nextLine(); // Lire la chaîne

        // Intern la chaîne entrée
        String internedInput = userInput.intern(); // Ajout à la pool de chaînes

        // Comparaison avec le littéral
        System.out.println("\nComparaison avec le littéral 'Hello' :");
        System.out.println("s1 == internedInput: " + (s1 == internedInput)); // true ou false selon l'entrée

        // Afficher le résultat
        if (s1 == internedInput) {
            System.out.println("La chaîne entrée est identique au littéral 'Hello' !");
        } else {
            System.out.println("La chaîne entrée est différente de 'Hello'.");
        }

        // Fermer le scanner
        scanner.close();
    }
}
