public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot("eksploracja", 2, -60);

        spirit.showAttributes();
        System.out.println();

        System.out.println("Zwiększenie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println();

        System.out.println("Zmiana temperatury na -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println();

        System.out.println("Sprawdzenie temperatury.");
        spirit.checkTemperature();
        spirit.showAttributes();

        System.out.println("----------------------");


        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "ekploracja";
        opportunity.speed = 5;
        opportunity.temperature = -20;

        opportunity.showAttributes();
        System.out.println();

        System.out.println("Zwiększenie prędkości do 3.");
        opportunity.speed = 7;
        opportunity.showAttributes();
        System.out.println();

        System.out.println("Zmiana temperatury na -50.");
        opportunity.temperature = -50;
        opportunity.showAttributes();
        System.out.println();

        System.out.println("Sprawdzenie temperatury.");
        opportunity.checkTemperature();
        opportunity.showAttributes();

    }
}
