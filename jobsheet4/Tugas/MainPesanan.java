package jobsheet4.Tugas;

public class MainPesanan {
     public static void main(String[] args) {
        Pelanggan pelanggan = new Pelanggan("Budi","budi@gmail.com");
        Produk produk = new Produk("Keyboard",250000);

        // Aggregation: pelanggan dibuat dari luar
        Pesanan pesanan = new Pesanan("ORD001",pelanggan, produk,2);
        pesanan.info();
        
        Pembayaran pembayaran = new Pembayaran("QRIS");
        // Dependency
        pesanan.prosesPembayaran(pembayaran);
    }
}
