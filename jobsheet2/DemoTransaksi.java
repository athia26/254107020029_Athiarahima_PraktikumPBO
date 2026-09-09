package jobsheet2;

public class DemoTransaksi {
   public static void main(String[] args) {
    TransaksiPeminjaman transaksi1 = new TransaksiPeminjaman();
    transaksi1.idTransaksi = 1;
    transaksi1.namaPeminjam = "Budi";
    transaksi1.judulBuku = "Dasar Pemrograman Java";
    transaksi1.jmlHariTerlambat = 0;

    TransaksiPeminjaman transaksi2 = new TransaksiPeminjaman();
    transaksi2.idTransaksi = 2;
    transaksi2.namaPeminjam = "Siti";
    transaksi2.judulBuku = "Dasar Basis Data";
    transaksi2.jmlHariTerlambat = 3;

    TransaksiPeminjaman transaksi3 = new TransaksiPeminjaman();
    transaksi3.idTransaksi = 3;
    transaksi3.namaPeminjam = "Andi";
    transaksi3.judulBuku = "PBO";
    transaksi3.jmlHariTerlambat = 10;

    System.out.println("Transaksi 1: ");
    transaksi1.tampilkanData();

    System.out.println("Transaksi 2: ");
    transaksi2.tampilkanData();

    System.out.println("Transaksi 3: ");
    transaksi3.tampilkanData();
   }
}


