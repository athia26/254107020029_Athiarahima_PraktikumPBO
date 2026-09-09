package jobsheet1;

public class BotolMinum {
    int capacity;
    String material;

    public void openBottle() {
        System.out.println("Bottle is opened.");
    }

    public void drink() {
        System.out.println("Drinking from the bottle.");
    }

    public void printInfo() {
        System.out.println("Capacity: " + capacity + " ml");
        System.out.println("Material: " + material);
    }
}
