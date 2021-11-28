public class RangeLister {
    public static void main(String[] args) {
        RangeLister rl = new RangeLister(); //stworzono konkretny obiekt
        int[] range = rl.makeRange(2,5);
        rl.showRange(range);
    }

    //od 2 do 5 -> 5 - 2 + 1 = 4 (2,3,4,5)
    int[] makeRange(int lower, int upper) { //metoda będzie zwracać tablicę typu int
        int[] range = new int[(upper - lower) + 1];
        for (int i = 0; i < range.length; i++) {
            range[i] = lower++; //Uwaga na post inkrementację! (++ powiększono o 1)

        }
        return range;
    }
    void showRange(int[] range) { //wyświetlenie na ekranie metody
        System.out.print("Tablica: [ ");
        for (int i = 0; i < range.length; i++) {
            System.out.print(range[i] + " ");
        }
        System.out.println("]");
    }
}
