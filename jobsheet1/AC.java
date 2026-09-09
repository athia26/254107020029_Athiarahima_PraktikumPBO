package jobsheet1;

public class AC {
    int temperature;
    String mode;

    public void turnOnAC() {
        System.out.println("AC is turned on.");
    }

    public void adjustTemperature() {
        System.out.println("AC temperature is set to " + temperature + "°C.");
    }

    public void printInfo() {
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Mode: " + mode);
    }
}
