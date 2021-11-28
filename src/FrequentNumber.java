public class FrequentNumber {
    public static void main(String[] args) {

        int[] arr = {3, 5, 3, 6, 6, 6, 6, 3, 3, 3, 0};
        int[] counters = new int[10]; //tablica dziesięcio-elementowa przedstawia rodzaj elementów

        for (int i = 0; i < arr.length; i++) {
            //int digit = arr[i];
            //counters[digit] = counters[digit] + 1;

            counters[arr[i]]++;
        }
        for (int stat : counters) {
            /*System.out.print(stat + "  ");*/ //pokazuje ile wyświetliło się cyfr pokolei
        }

        int mostFrequent = 0;

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > counters[mostFrequent]) { //jeśli liczba wystąpiła najczęsciej będzie wyświetlana
                mostFrequent = i;
            }
        }
        System.out.print("Najczęściej występująca cyfrą w tablicy jest cyfra " + mostFrequent);
        System.out.println(", wystąpiła " + counters[mostFrequent] + " razy.");
    }
}
