package jobsheet1;

public class Devices {
    String brand;
    double price;

    public void turnOn() {
        System.out.println(brand + " is turned on.");
    }

    public void turnOff() {
        System.out.println(brand + " is turned off.");
    }

    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: Rp" + price);
    }
}
