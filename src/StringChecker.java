import java.util.Locale;

public class StringChecker {
    public static void main(String[] args) {
        String str = "Lannister zawsze spłaca swoje długi.";
        System.out.println("Tekst to: " +str);
        System.out.println("Długość tekstu to: " + str.length());

        //znak na pozycji 6   // licząc od 0 1 2...
        System.out.println("Znak na pozycji 6.: " + str.charAt(5));

        //fragment od znaku 10 - 16
        System.out.println("fragment od znaku 10 - 16: " + str.substring(10,16));

        //indeks pierwszej litery t
        System.out.println("indeks pierwszej litery t: " + str.indexOf('t'));

        //indeks początku testu "długi"
        System.out.println("indeks początku testu \"długi\": " + str.indexOf("długi"));

        //tekst zapisany wielkimy literami
        System.out.println("tekst zapisany wielkimy literami: " + str.toUpperCase());


    }
}
