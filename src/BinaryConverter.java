public class BinaryConverter {
    public static void main(String[] args) {

        String binary = "11";
        Long result = 0L; //przypisujemy wartość początkową z racji zmiennej lokalnej

        // 1 1 0 1 - liczba binarna
        // 0 1 2 3 - indeks (i)
        // 3 2 1 0 - indeks odwrócony (długość - 1 - i)

        // 1 * 2^3 + 1 * 2^2 + 0 * 2^1 + 1 * 2^0
        // (1 * 2^3) + (1 * 2^2) + (0 * 2^1) + (1 * 2^0) - propozycja liczenia

        /*int i = 2;
        char c = binary.charAt(i);
        int bit = Character.getNumericValue(c);
        System.out.println(bit);*/

        for (int i = 0; i < binary.length(); i++) {
            int reversIndex = binary.length() - 1 - i;
            char c = binary.charAt(reversIndex);
            int bit = Character.getNumericValue(c);

            result += bit * (int)Math.pow(2,i); //(bit * 2^0)


            /*char c = binary.charAt(i);
            int bit = Character.getNumericValue(c);
            System.out.println(bit);*/
        }
        System.out.println("Binarnie " + binary + " to " + result + " dziesiętnie");
    }
}
