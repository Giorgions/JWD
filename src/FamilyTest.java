public class FamilyTest {

    public static void main(String[] args) {
        FamilyMember dad = new FamilyMember();
        dad.name = "Tomasz";
        dad.age = 30;

        FamilyMember son = new FamilyMember();
        son.name = "Karol";
        son.age = 7;

        System.out.println("Nazwisko rodu to: " + dad.surname);
        System.out.println("Nazwisko rodu to: " + FamilyMember.surname);
        System.out.println(dad.name + " " + dad.age);

        System.out.println("------------");

        System.out.println(son.surname + " " + son.name + " " + son.age);
        dad.surname = "Kowalski";

        System.out.println(son.surname + " " + son.name + " " + son.age);
    }

}
