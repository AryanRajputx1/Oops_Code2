package properties.inheritance;

public class main {
    public static void main(String[] args) {
        box box1= new box();
        System.out.println(box1.l +""+box1.w+""+box1.h );
        box box2= new box(1.2,2.2,3.0);
        System.out.println(box2.l +" "+box2.w+" "+box2.h );

        System.out.println("Extends keyword in play from below");
        boxweight box3 = new boxweight();
        boxweight box4 = new boxweight(12,2.3,3,8);
        System.out.println(box3.h +" "+box3.weight);
    }
}
