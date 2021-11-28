public class OperatorsDemo {
    public static void main(String[] args) {

//        int x = 5;
//        x = x +2; // krócej x +=2
//
//        int c = 7;
//        int d = 2;


//        System.out.println(c + d);

//        System.out.println(5 / 3.);

//        System.out.println(5 % 3); reszta z dzielenie

//        int a = 5;
//        int b = -a;

//        System.out.println(b);

//        inkrementacja, dekrementacja
//        int x, y, z;
//        x = 42;

//        x += 1; zwiększenie o 1
//        x++; to samo co wyżej

//        System.out.println(x);

//        int a = 0;
//        int b;

        //b = a++ + a++; // (1 + 0) = 1

        //b = ++a + ++a; // 2

//        int a = 5;
//        int b = 5;
//
//        boolean equal = a >= b;
//
//        System.out.println(equal);

        //operatory relacji
        // >
        // <
        // >=
        // <=
        // ==
        // !=

        //operatory logiczne

        //negacja !
        //koniunkcja &&
        //alternatywa ||
        //równoważność
        //alternatywa rozłączna (XOR) !=

//        int x = 0;
//        int y = 5;
////        boolean test = (x < 0) && (y > 3); // false AND true - zawsze będzie false
////        boolean test = (x < 0) || (y > 3); // false OR true - będzie true
//        boolean test = (x < 0) & (y++ > 3); // false and 6
//
//        System.out.println(test);
//        System.out.println(y);

       /* int age = 33;
//        boolean test = (age < 25); /false
        boolean test = !(age < 25);

        System.out.println(false);*/


        //operatory bitowe

        // & - iloczyn bitowy
        // | - suma bitowa
        // ^ - XOR (eXclusive OR)
        // ~ - negacja bitowa
        // << - przesunięcie w lewo
        // >> - przesunięcie w prawo

        /*int a = 1; // 00001
        int b = 5; // 00101*/

        //iloczyn
        /*System.out.println(a & b);
        System.out.println();

        System.out.println(String.format("%32s",Integer.toBinaryString(a)).replace(' ','0'));
        System.out.println(String.format("%32s",Integer.toBinaryString(b)).replace(' ','0'));
        System.out.println("----------------------");
        System.out.println(String.format("%32s",Integer.toBinaryString(a & b)).replace(' ','0'));*/

        //suma
        /*System.out.println(a | b);
        System.out.println();

        System.out.println(String.format("%8s",Integer.toBinaryString(a)).replace(' ','0'));
        System.out.println(String.format("%8s",Integer.toBinaryString(b)).replace(' ','0'));
        System.out.println("----------------------");
        System.out.println(String.format("%8s",Integer.toBinaryString(a | b)).replace(' ','0'));*/

        //^ - XOR
        //1 1 -> 0
        //1 0 -> 1
        //0 1 -> 1
        //0 0 -> 0
        /*System.out.println(a ^ b);
        System.out.println();

        System.out.println(String.format("%8s",Integer.toBinaryString(a)).replace(' ','0'));
        System.out.println(String.format("%8s",Integer.toBinaryString(b)).replace(' ','0'));
        System.out.println("----------------------");
        System.out.println(String.format("%8s",Integer.toBinaryString(a ^ b)).replace(' ','0'));*/

        //negacja
        /*System.out.println(~a);
        System.out.println();

        System.out.println(String.format("%32s",Integer.toBinaryString(a)).replace(' ','0'));
        //System.out.println(String.format("%8s",Integer.toBinaryString(b)).replace(' ','0'));
        System.out.println("----------------------");
        System.out.println(String.format("%32s",Integer.toBinaryString(~a)).replace(' ','0'));*/


        //przesunięcie
        /*System.out.println(a << 5);
        System.out.println();

        System.out.println(String.format("%32s",Integer.toBinaryString(a)).replace(' ','0'));
        System.out.println(String.format("%32s",Integer.toBinaryString(b)).replace(' ','0'));
        System.out.println("----------------------");
        System.out.println(String.format("%32s",Integer.toBinaryString(a << b)).replace(' ','0'));*/

        //ad.1

        int x = 14_000;

        System.out.println("Pierwszy rok:");
        System.out.println(x * 1.4);
        System.out.println("Drugi rok:");
        System.out.println((x * 1.4) - 1500);
        System.out.println("Trzeci rok:");
        System.out.println(((x * 1.4) - 1500) * 1.12);

        System.out.println("----------------------------");

        float total = 14_000F;
        System.out.println("Inwestycja początkowa: "+ total +"zł");

        total = total + (total * 0.4F);
        System.out.println("Po pierwszym roku: "+ total + "zł");

        total = total - 1_500F;
        System.out.println("Po dwóch latach: "+ total + "zł");

        total = total + (total * 0.12F);
        System.out.println("Po trzech latach: "+ total + "zł");

        System.out.println("----------------------------");

        //ad.2

        int i = 35;
        boolean result = (i % 5) == 0 && (i % 7) == 0;

        System.out.println("Czy liczba " + i + " dzieli się bez reszty przez 5 i 7 jednocześnie?");
        System.out.println(result ? "TAK" : "NIE");








    }
}
