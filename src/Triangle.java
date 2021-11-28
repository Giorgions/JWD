public class Triangle {
    public static void main(String[] args) {
        char c = 169;
        String space = " ";

        String row1 = space + space + space + c;
        String row2 = space + space + c + space + c;
        String row3 = space + c + space + space + space + c;
        String row4 = "" + c + space + c + space + c + space + c;

        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
    }
}
