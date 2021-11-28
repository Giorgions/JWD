public class Matrix {
    public static void main(String[] args) {
//        int n = 2;
//        System.out.println("n = " + n);
//        System.out.println("--------------");
//        for (int i = 1; i < n + 1; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(i + j + " ");
//            }
//            System.out.println();
//
//        }
//        n = 3;
//        System.out.println("\nn = " + n);
//        System.out.println("--------------");
//        for (int i = 1; i < n + 1; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(i + j + " ");
//            }
//            System.out.println();
//        }
//        n = 4;
//        System.out.println("\nn = " + n);
//        System.out.println("--------------");
//        for (int i = 1; i < n + 1; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(i + j + " ");
//            }
//            System.out.println();
//        }
        int n = 2;

        System.out.println("n + " + n + " matrix");
        System.out.println("------------");

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%3s", i + j + " ");
            }
            System.out.println();
        }
    }
}
