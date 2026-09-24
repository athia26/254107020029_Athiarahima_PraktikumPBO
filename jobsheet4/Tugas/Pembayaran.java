package jobsheet4.Tugas;

public class Pembayaran {
     private String metode;

    public Pembayaran(String metode) {
        this.metode = metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public String getMetode() {
        return metode;
    }

    public void bayar(int jumlah) {
        System.out.println("Metode pembayaran: " + metode);
        System.out.println("Total pembayaran: Rp" + jumlah);
        System.out.println("Pembayaran berhasil.");
    }
}
