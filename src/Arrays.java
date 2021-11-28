import java.awt.*;

public class Arrays {
    public static void main(String[] args) {
        /*String[] requests;
        Point[] points;

        String targets[];*/ // zapis prawidłowy deklaracji tablicy

        /*int[] temps = new int[99];
        temps[0] = 23;
        temps[45] = 78;
        System.out.println(temps[45]);*/

        /*Integer[] series = new Integer[3];
        series[0] = 1;
        series[1] = 12;
        series[2] = 156;*/

        /*Integer[] series = {1, 12, 125}; // kompaktowy zapis tablicy series
        System.out.println(series[2]);
*/

        /*Point[] points = {new Point(1,1), new Point(2,2), new Point(0,0)};

        System.out.println(points[0]);

        Point p = new Point(5,5);
        points[0] = p;

        System.out.println(points[0]);

        points[0].y = 9;

        System.out.println(points[0]);*/

       /* int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;

        int [][] arr2 = {{1/2},{3,4}};*/ // kompaktowy zapis tablicy arr


        //iterowanie po tablicach jednowymiarowych
        int[] arr = {3,4,7,23,6,789};

        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " - " + arr[i]);
        }*/

        /*for (int e : arr) { //przejście po każdym elemencie tablicy
            System.out.println(e);*/

        String[] dogs = {"Burek", "Pluto", "Lajka"};
        String[] people = {"Ania", "Wojtek", "Dorota"};
        String[][] names = {people, dogs};

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }


    }
}
