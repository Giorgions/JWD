public class Kolok1 {
    public static void main(String[] args) {

        int number = 7824;
        int resultFirst = number / 2;
        int resultSecond = resultFirst +4;
        int resultThird = resultSecond * 3;


        //podziel liczbę przez 2
        System.out.println("Liczba " + number + " dzielona przez 2 daje wynik: " + resultFirst);

        //dodaj do otrzymanego wyniku 4
        System.out.println(resultSecond);

        //pomnóż otrzymany wynik przez 3
        System.out.println(resultThird);

    }
}
