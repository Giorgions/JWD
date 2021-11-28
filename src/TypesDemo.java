public class TypesDemo {
    public static void main(String[] args) {

        //liczby całkowite
        //byte - 1          00000000
        //short - 2         00000000 00000000
        //int - 4           00000000 00000000 00000000 00000000
        //long - 8          00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000

        byte b = 120;
        short s = 1203;
        int i = 12_034;
        long l = 123_135_456_123_154L;

        //typy zmiennoprzecinkowwe
        double a = 34.54;
        float f = 1.4F;

        //typy znakowe
        char c = 'a';

        //typy logiczne
        boolean choosen = true;
        boolean isBigger = b > 7;

        //-------------------------------
        //ciągi znaków
        String name = "Ala";
        System.out.println("Cześć, jestem " + name); //konkatenacja
        System.out.println("tekst " + (1 + 2));


        String first_name = "Jan";
        String last_name = "Kowalski";
        int age = 35;
        char gender = 'm';
        long personalIdNumber = 8306112507L;

        System.out.println("Imię i nazwisko: " + first_name + " " + last_name);
        System.out.println("Wiek: " + age + " lat.");
        System.out.println("Płeć: " + gender);
        System.out.println("Personal ID Number: " + personalIdNumber);
    }
}
