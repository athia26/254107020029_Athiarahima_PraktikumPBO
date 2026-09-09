package jobsheet2;

public class TestBuku {
    public static void main(String[] args) {
        
        Buku buku1 = new Buku();
        buku1.isbn = "978-979-29-6104-2";
        buku1.judul = "Dasar Pemrograman Berbasis Objek";
        buku1.penulis = "Abdul Kadir";
        buku1.tahunTerbit = 2021;
        buku1.tampilInfoBuku();
        System.out.println();

        Buku buku2 = new Buku();
        buku2.isbn = "960-989-29-6157-3";
        buku2.judul = "Pemrograman Java";
        buku2.penulis = "Budi";
        buku2.penerbit = "Andi Offset";
        buku2.tahunTerbit = 2022;
        buku2.tampilInfoBuku();
        System.out.println();

        Buku buku3 = new Buku();
        buku3.isbn = "978-980-30-6305-4";
        buku3.judul = "Laut Bercerita";
        buku3.penulis = " Leila S. Chudori";
        buku3.penerbit = "Kepustakaan Populer Gramedia";
        buku3.tahunTerbit = 2017;
        buku3.tampilInfoBuku();
    }
}
