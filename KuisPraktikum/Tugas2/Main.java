package KuisPraktikum.Tugas2;

import KuisPraktikum.Tugas1.Laptop;

public class Main {
    public static void main(String[] args) {

        // =========================
        // 1. Buat laboratorium
        // =========================
        Laboratorium lab = new Laboratorium("Lab Pemrograman 1");

        System.out.println("Nama Lab: " + lab.getNama());
        System.out.println();


        // =========================
        // 2. Tambahkan laptop
        // =========================
        Laptop lp1 = new Laptop("LP-01", "Asus", 8);
        Laptop lp2 = new Laptop("LP-02", "Lenovo", 16);
        Laptop lp3 = new Laptop("LP-03", "Acer", 4);

        System.out.println("Tambah LP-01: " + lab.tambahLaptop(lp1));
        System.out.println("Tambah LP-02: " + lab.tambahLaptop(lp2));
        System.out.println("Tambah LP-03: " + lab.tambahLaptop(lp3));

        System.out.println();


        // =========================
        // 3. Buat mahasiswa
        // =========================
        Mahasiswa andi = new Mahasiswa("2341720001", "Andi");
        Mahasiswa budi = new Mahasiswa("2341720002", "Budi");


        // =========================
        // 4. Cari laptop
        // =========================
        System.out.println("Cari LP-01:");

        Laptop hasil = lab.cariLaptop("LP-01");

        if (hasil != null) {
            System.out.println(hasil.info());
        } else {
            System.out.println("Laptop tidak ditemukan");
        }

        System.out.println();


        // =========================
        // 5. Andi meminjam LP-01
        // =========================
        Peminjaman p1 = lab.pinjamkan(andi, "LP-01");

        System.out.println("Andi pinjam LP-01: " + (p1 != null));

        if (p1 != null) {
            System.out.println("Mahasiswa: "
                    + p1.getMahasiswa().getNama());

            System.out.println("Laptop: "
                    + p1.getLaptop().info());

            System.out.println("Aktif: "
                    + p1.isAktif());
        }

        System.out.println();


        // =========================
        // 6. Coba pinjam LP-01 lagi
        // =========================
        Peminjaman p2 = lab.pinjamkan(andi, "LP-01");

        System.out.println("Andi pinjam LP-01 lagi: " + (p2 != null));

        System.out.println();


        // =========================
        // 7. Cek jumlah pinjaman Andi
        // =========================
        System.out.println(
            "Jumlah pinjaman aktif Andi: "
            + lab.jumlahPinjamanAktif(andi)
        );

        System.out.println();


        // =========================
        // 8. Andi pinjam LP-02
        // =========================
        Peminjaman p3 = lab.pinjamkan(andi, "LP-02");

        System.out.println("Andi pinjam LP-02: " + (p3 != null));

        System.out.println(
            "Jumlah pinjaman aktif Andi: "
            + lab.jumlahPinjamanAktif(andi)
        );

        System.out.println();


        // =========================
        // 9. Coba pinjam LP-03
        // Maksimal hanya 2
        // =========================
        Peminjaman p4 = lab.pinjamkan(andi, "LP-03");

        System.out.println(
            "Andi pinjam LP-03 (seharusnya false): "
            + (p4 != null)
        );

        System.out.println();


        // =========================
        // 10. Kembalikan LP-01
        // =========================
        boolean kembali = lab.kembalikan("LP-01");

        System.out.println("Kembalikan LP-01: " + kembali);

        System.out.println(
            "Jumlah pinjaman aktif Andi: "
            + lab.jumlahPinjamanAktif(andi)
        );

        System.out.println();


        // =========================
        // 11. Setelah LP-01 kembali,
        // Andi boleh pinjam LP-03
        // =========================
        Peminjaman p5 = lab.pinjamkan(andi, "LP-03");

        System.out.println(
            "Andi pinjam LP-03 setelah LP-01 dikembalikan: "
            + (p5 != null)
        );

        System.out.println();


        // =========================
        // 12. Cek daftar laptop
        // =========================
        System.out.println("Daftar laptop:");

        for (Laptop lp : lab.getDaftarLaptop()) {
            System.out.println(lp.info());
        }
    }
}
