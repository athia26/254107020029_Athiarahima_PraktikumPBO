package jobsheet4.Tugas;

public class Pesanan {
    private String nomor;
    private Pelanggan pelanggan;// AGGREGATION
    private DetailPesanan detail;// COMPOSITION

    public Pesanan(String nomor, Pelanggan pelanggan, Produk produk, int jumlah) {
        this.nomor = nomor;
        this.pelanggan = pelanggan; // AGGREGATION
        this.detail = new DetailPesanan(produk.getNama(), produk.getHarga(),jumlah);// COMPOSITION
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public int hitungTotal() {
        return detail.hitungSubtotal();
    }

    // DEPENDENCY
    public void prosesPembayaran(Pembayaran pembayaran) {
        pembayaran.bayar(hitungTotal());
    }

    public void info() {
        System.out.println("=== INFORMASI PESANAN ===");
        System.out.println("Nomor Pesanan: " + nomor);
        System.out.println("Pelanggan: " + pelanggan.getNama());
        System.out.println(detail.info());
    }
}
