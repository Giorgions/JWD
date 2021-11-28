public class Lab8 {
    public static void main(String[] args) {

        //ad. 1
        int[] tablica = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        int n = 4;
        for (int i = n; i <= n; i++ ){
            int suma = 0;
            for (int j = 0; j < tablica.length; j++){
                if (i == tablica[j]) suma++;
            }
            System.out.println("Liczba " + i + " pojawia się razy: " + suma);
        }
        System.out.println("-------------");
        System.out.println();

        //ad.2
        int [] tab1 = {1, 2, 3, 5, 1, 6, 7};


    }
}
