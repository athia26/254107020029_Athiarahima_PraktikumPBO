package jobsheet1;

public class Laptop extends Devices{
    int ram;
    String processor;

    public void openLaptop() {
        System.out.println("Laptop is opened.");
    }

    public void runProgram() {
        System.out.println("Laptop is running a program.");
    }

    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: Rp" + price);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Processor: " + processor);
    }
}
