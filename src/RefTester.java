import java.awt.*;

public class RefTester {
    public static void main(String[] args) {
        Point pt1, pt2; //deklaracja zmiennych pt1 i pt2
        pt1 = new Point(100,100);
        pt2 = pt1;

        pt1.x = 200;
        pt2.y = 200;

        System.out.println(pt1);
        System.out.println(pt2);

    }
}
