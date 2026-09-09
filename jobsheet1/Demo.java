package jobsheet1;

public class Demo {
    public static void main(String[] args) {

        Devices device = new Devices();

        device.brand = "Samsung";
        device.price = 5000000;

        System.out.println("=== DEVICE ===");
        device.turnOn();
        device.turnOff();
        device.printInfo();

        System.out.println();


        Laptop laptop = new Laptop();

        laptop.brand = "ASUS";
        laptop.price = 10000000;
        laptop.ram = 16;
        laptop.processor = "Intel Core i7";

        System.out.println("=== LAPTOP ===");
        laptop.openLaptop();
        laptop.runProgram();
        laptop.printInfo();

        System.out.println();


        Smartphone smartphone = new Smartphone();

        smartphone.brand = "Samsung";
        smartphone.price = 7000000;
        smartphone.storage = 256;
        smartphone.camera = 50;

        System.out.println("=== SMARTPHONE ===");
        smartphone.makeCall();
        smartphone.takePhoto();
        smartphone.printInfo();

        System.out.println();
        
        BotolMinum bottle = new BotolMinum();

        bottle.capacity = 750;
        bottle.material = "Stainless Steel";

        System.out.println("=== BOTTLE ===");
        bottle.openBottle();
        bottle.drink();
        bottle.printInfo();

        System.out.println();


        AC ac = new AC();

        ac.temperature = 24;
        ac.mode = "Cool";

        System.out.println("=== AC ===");
        ac.turnOnAC();
        ac.adjustTemperature();
        ac.printInfo();
    }
}
