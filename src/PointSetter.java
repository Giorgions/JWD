import java.awt.*;

public class PointSetter {
    public static void main(String[] args) {

        Point location = new Point(4,13);
        Point location2 = location; //obiekt location2 wskazuje na to samo co location

        System.out.println("Położenie początkowe:");
        System.out.println("x = " + location.x);
        System.out.println("y = " + location.y);

        System.out.println("Przejście do (7,6)");
        location.x = 7;
        location.y = 6;

        System.out.println("Położenie końcowe:");
        System.out.println("x = " + location.x);
        System.out.println("y = " + location.y);

    }
}
