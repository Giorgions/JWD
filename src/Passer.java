public class Passer {

    void toUpperCase(String[] text) {
        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].toUpperCase();
        }

    }

    void showArgs(String[] text) {
        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i] + " ");

        }

    }

    public static void main(String[] args) {
        Passer passer = new Passer();
        passer.toUpperCase(args);
        passer.showArgs(args);
    }
}
