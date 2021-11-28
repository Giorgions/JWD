import java.util.StringTokenizer;

public class Birthday {
    public static void main(String[] args) {

        String birthday = "29/04/2016";
        String day = birthday.substring(0,2);
        String month = birthday.substring(3,5);
        String year = birthday.substring(6,10);

        System.out.println("Urodziny: " + birthday);
        System.out.println("Dzień: " + day);
        System.out.println("Miesiąc: " + month);
        System.out.println("Rok: " + year);

        StringTokenizer st = new StringTokenizer(birthday, "/");
        System.out.println();


    }
}
