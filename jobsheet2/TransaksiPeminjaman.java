package jobsheet2;

public class TransaksiPeminjaman {
    public int idTransaksi;
    public String namaPeminjam;
    public String judulBuku;
    public int jmlHariTerlambat;
    public double denda;

    public double hitungDenda(){
        denda = jmlHariTerlambat * 1000;
        return denda;
    }

    public void tampilkanData(){
        System.out.println("ID Transaksi    : "+idTransaksi);
        System.out.println("Nama Peminjam   : "+namaPeminjam);
        System.out.println("Judul Buku      : "+judulBuku);
        System.out.println("Keterlamnbatan  : "+jmlHariTerlambat);
        System.out.println("Denda           : "+hitungDenda());

    }
}
