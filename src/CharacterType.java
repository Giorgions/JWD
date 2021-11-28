public class CharacterType {
    public static void main(String[] args) {
        showInfo('a');
        showInfo('B');
        showInfo('ą');
        showInfo(261);
    }

    public static void showInfo(char c) {
        System.out.println("Kod znaku '" + c + "' to: " + (int) c);

    }

    public static void showInfo(int i) {
        System.out.println("Znak o kodzie '" + i + "' to: " + (char) i);


    }


}