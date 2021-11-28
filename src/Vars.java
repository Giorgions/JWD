import java.text.DecimalFormat;

public class Vars {
    public static void main(String[] args) {
        int number = 10;  //definicja zmiennej lokalnej o nazwie number, typu podstawowego, liczb całkowitych int ustawiona na wartość 10

        System.out.println("Nasza liczba to " + number + ".");
        System.out.println("Liczba " + number + " jest o " + (number - 8) + " większa od liczby 8.");
        System.out.println("Jeżeli pomnożymy naszą liczbę przez 5 to otrzymany wartość " + (number * 5) + ".");

        int a = 4; //typ podstawowy

        MarsRobot robot; //typ klasy lub interfejsu
        String name = "Wojtek";

        String[] streets = {"Floriańska", "Królewska"}; //typ tablicowy (tablica)

        final double PI = 3.141592;
        System.out.println(PI);
        System.out.println(Math.PI);

        double gpa = 3.55;
        float piValue = 3.14f;


        double y = 12e2; //12 * 10 ^ 2 = 1200

        System.out.println(y);

        double x = 0.00000000234;
        System.out.println(x);
        System.out.printf("%.11f", x);

        double c = 3E-10;
        System.out.println(c);


        int b =  0b11; //binarnie
        System.out.println(b);

        int d = 010; //ósemkowo
        System.out.println(d);

        boolean choosen = true; //wartość logiczna true lub false

        char key = 'a';
        String password = "hasło123";
        String message = "raz\tdwa\ttrzy";

        System.out.println(message);

        String message2 = "raz\ndwa\ntrzy";
        System.out.println(message2);

    }
}
