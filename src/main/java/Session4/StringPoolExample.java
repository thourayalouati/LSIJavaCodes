package Session4;

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
    }
}

