package Heritage;

public class Test2 {
    public static void main(String[] args) {


        Position p=new Position(1,1);
        FigureGeometrique f=new FigureGeometrique("xxx",p);
        Rectangle r=new Rectangle(2,3,p);
        f=r;


        System.out.println(r.surface());




    }
}