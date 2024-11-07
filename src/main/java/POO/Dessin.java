package POO;

import org.w3c.dom.css.Rect;

public class Dessin{
        public static void main (String[] args)
        {
            Rectangle r=new Rectangle(); //4 5
            System.out.println(r);
            System.out.println("hauteur " + r.getHauteur());
            System.out.println(r.getHauteur());
            r.setHauteur(6);
            System.out.println("hauteur après modification " + r.getHauteur());
            r.setLargeur(4);
            double s=r.surface();
            System.out.println("La surface du rectangle est " + s);
            double p=r.perimetre();
            System.out.println("Le perimetre du ractangle est " + p);

            /*********************************************************/
            Rectangle r1=new Rectangle(6,8);
            Rectangle r2=new Rectangle(6,8);
            if(r1==r2)
                System.out.println("r1 == r2");
            else
                System.out.println("r1 != r2 côté mémoire");
            System.out.println("Comparasion avec equals " + r1.equals(r2));


            /****************************************************************/

            Rectangle r3=null;

            /********************************************************************/
            Rectangle r6=new Rectangle(7,8);
            System.out.println(r6);
            System.out.println(new Rectangle(8,9));
            System.out.println(r6.toSring());

        }
    }

