package Exception;

public class Division {
    
   
    public static void main(String[]args)
    {
      int x=1;
      int y=0;
      int res;
      res=x/y;
      System.out.println("Le resultat" + res);
      System.out.println("à la fin de la méthode");

      String str = null;
      System.out.println(str.length()); // Déclenche NullPointerException


        int[] tableau = { 1, 2, 3 };
        System.out.println(tableau[3]); // Déclenche ArrayIndexOutOfBoundsException


        String texte = "abc";
        int nombre = Integer.parseInt(texte); // Déclenche NumberFormatException


    }
}
