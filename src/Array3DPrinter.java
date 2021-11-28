public class Array3DPrinter {
    public static void main(String[] args) {

        int [][][] arr = {{{1,2,3},{5}},{{1}},{{6},{7}}};
        /*int [][] arr2 = {{1},{2,3,4}};
        int [] arr3 = {1,2,3,4,5};*/ //przykładowe tablice 2 i 1 wymiarowe

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print("arr[" + i + "][" + j + "][" + k + "] = ");
                    System.out.println(arr[i][j][k]);

                }

            }

        }

    }
}
