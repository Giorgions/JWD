public class MarsRobot implements Robot {
    String status;
    int speed;
    float temperature;

    MarsRobot() {}

    MarsRobot(String status, int speed, float temperature) {
        this.status = status;
        this.speed = speed;
        this.temperature = temperature;

    }

    public void checkTemperature() {
        if (temperature < -80) {
            status = "powrót do domu";
            speed = 5;
        }

    }

    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Prędkość: " + speed);
        System.out.println("Temperatura: " + temperature);
    }

    @Override
    public void checkStatus() {
        System.out.println("Status:" + status);
    }
}

