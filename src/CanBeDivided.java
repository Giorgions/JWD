public class CanBeDivided {
    public static void main(String[] args) {
        int i = 35;
        boolean result = (i % 5) == 0 && (i % 7) == 0;

        System.out.println("Czy liczba " + i + " dzieli się bez reszty przez 5 i 7 jednocześnie?");
        System.out.println(result ? "TAK" : "NIE");

    }
}
