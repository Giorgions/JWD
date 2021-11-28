import java.util.Locale;

public class StringFormatter {
    public static void main(String[] args) {
        int accountBalance = 15_005;
        System.out.println(accountBalance);
        System.out.printf("Saldo: %,d zł%n" ,accountBalance);

        // %[flags][width][.precision]conversion-character
        // s - formats strings
        // d - formats decimal integers
        // f - zmiennoprzecinkowe liczby
        // t - data czas
        // bB - boolean


        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.3f%n",pi);
        System.out.printf(new Locale("us"),"%.3f%n",pi);


    }
}
