package Session1;

import java.util.Scanner;

public class Hello {

    public static void main (String[]args)
    {
        Scanner keyb=new Scanner(System.in);
        System.out.println("Entrer une valeur pour n");
        int n= keyb.nextInt();
        int nCarre=n*n;
        System.out.println("La variable n contient " + n);
    }
}
