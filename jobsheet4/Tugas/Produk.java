package jobsheet4.Tugas;

public class Produk {
     private String nama;
    private int harga;

    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public String info() {
        String info = "";
        info += "Nama Produk: " + nama + "\n";
        info += "Harga: Rp" + harga + "\n";
        return info;
    }
}
