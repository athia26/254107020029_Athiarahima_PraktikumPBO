package jobsheet1;

public class Smartphone extends Devices{
    int storage;
    int camera;

    public void makeCall() {
        System.out.println("Smartphone is making a call.");
    }

    public void takePhoto() {
        System.out.println("Smartphone is taking a photo.");
    }

    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: Rp" + price);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Camera: " + camera + " MP");
    }
}