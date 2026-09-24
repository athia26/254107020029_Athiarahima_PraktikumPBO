package jobsheet4.Tugas;

public class DetailPesanan {
    private String namaProduk;
    private int harga;
    private int jumlah;

    public DetailPesanan(String namaProduk, int harga, int jumlah) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int hitungSubtotal() {
        return harga * jumlah;
    }

    public String info() {
        String info = "";
        info += "Produk: " + namaProduk + "\n";
        info += "Harga: Rp" + harga + "\n";
        info += "Jumlah: " + jumlah + "\n";
        info += "Subtotal: Rp" + hitungSubtotal() + "\n";
        return info;
    }
}
