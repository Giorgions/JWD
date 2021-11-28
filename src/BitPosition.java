public class BitPosition {
    public static void main(String[] args) {
        int number = 5;
        int bitPosition = 2;
        int mask = 1 << bitPosition;

        boolean result = (number & mask) > 0;

        System.out.print("Dla liczby " + number + " na " + bitPosition + " pozycji ");
        System.out.print(result ? "jest" : "nie jest");
        System.out.println(" ustawiony bit.");

        System.out.println("\n\n\n");
        System.out.println(String.format("%32s",Integer.toBinaryString(mask)).replace(' ','0'));
        System.out.println(String.format("%32s",Integer.toBinaryString(number)).replace(' ','0'));

    }
}
