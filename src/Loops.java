public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + j + " ");
                if (i==5 && j==5) {
                    break;
                }
            }
            System.out.println(i);
            System.out.println(" ");
        }
    }
}
//        int x = 0;
//
//        if (x > 5) {
//            System.out.println("Większe!");
//        } else {
//            System.out.println("Mniejsze!");
//        }

//        if (x > 0) {
//            System.out.println("Większe!");
//        } else if(x < 0) {
//            System.out.println("Mniejsze od zera!");
//        } else {
//            System.out.println("Równe zero!");
//        }
//        char grade = 'C';
//
//        switch (grade) {
//            case 'A':
//                System.out.println("Wspaniale!");
//                break;
//            case 'B':
//                System.out.println("Dobrze!");
//                break;
//            case 'C':
//                System.out.println("Mogło być lepiej.");
//                break;
//            case 'D':
//                System.out.println("Rozważ oszukiwanie!");
//                break;
//            default:
//                System.out.println("Błąd - coś poszło nie tak!");

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//
//        for (;;) {
//            System.out.println("Pętla nieskończona");
//        }
//        boolean cond = true;
//
//        while (cond) {
//            System.out.println("Działa pętla");
//            if ((int)(Math.random() * 50 + 1) == 20) {
//                cond = false;
//
//            }
