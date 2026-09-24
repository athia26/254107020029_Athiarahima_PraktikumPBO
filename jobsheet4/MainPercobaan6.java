package jobsheet4;

public class MainPercobaan6 {
    public static void main(String[] args) {
        Printer printerDefault = new Printer("Epson L300");
        Laptop2 laptop = new Laptop2("Thinkpad", printerDefault );
        laptop.cetakDoc( "Laporan.pdf");
    }
}
