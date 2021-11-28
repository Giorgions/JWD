public class ClassTester {

    int i; //zmienna egzemplarza (pole klasy)
    static int j = 2; //zmienna klasowa (pole statyczne) (z ustawioną wartością 2)

    public int change() {
        int k = 7; //zmienna lokalna (utworzona w bloku metody) (zmienne lokalne muszą mieć przypisaną wartość)
        return i + (k * j);
    }

    public static void main(String[] a) {
        int i = 77;
        /*System.out.println(i);*/ //w metodzie main obowiązuje przypisana wartość, w metodzie static nie można odnieść się do danego obiektu np. this.i

        ClassTester classTester = new ClassTester(); //obiekt class, na którym można wykonać metodę change (utworzenie obiektu)

        System.out.println("Wyświetlam zmienną egzemplarza i dla classTester: " + classTester.i);
        System.out.println("Wyświetlam zmienną lokalną i: " + i);
        System.out.println("Wyświetlam zmienną klasową (statyczną) j: " + j);

    }
}
