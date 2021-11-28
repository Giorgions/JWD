import java.awt.*;

public class Passing {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Przed zmianą " + i);
        changeIt(i);
        System.out.println("Po zmianie " + i);

        System.out.println("-------------");

        Point p = new Point(1,1);
        System.out.println("Przed zmianą " + p);
        changeIt(p);
        System.out.println("Po zmianie " + p);

    }

    static void changeIt(int i) { //powstaje zmienna lokalna, która nie ma odnośnika do i "po zmianie"
        System.out.println("Zmieniam i");
        i++;
    }

    static void changeIt (Point p) {
        System.out.println("Zmieniam to na co wskazuje obecnie zmienna p"); //czyli referencja pkt
        p.x++;
    }
}
