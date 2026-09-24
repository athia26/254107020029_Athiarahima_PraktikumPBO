package jobsheet4;

public class Laptop2 {
    private String merk;
    private Printer printerDefault;

    public Laptop2(String merk, Printer printerDefault){
        this.merk = merk;
        this.printerDefault = printerDefault;
    }

    public void cetakDoc(String namaFile){
        System.out.println(merk + " mengirim dokumen ke printer...");
        printerDefault.cetak(namaFile);
    }
}
