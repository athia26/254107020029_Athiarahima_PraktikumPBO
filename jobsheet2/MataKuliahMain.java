package jobsheet2;

public class MataKuliahMain {
    public static void main(String[] args) {
         MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "MK001";
        mk1.namaMk = "Pemrograman Berorientasi Objek";
        mk1.sks = 3;
        mk1.nilaiAngka = 3.5;

        MataKuliah mk2 = new MataKuliah();
        mk2.kodeMK = "MK002";
        mk2.namaMk = "Basis Data";
        mk2.sks = 3;
        mk2.nilaiAngka = 3.7;

        MataKuliah mk3 = new MataKuliah();
        mk3.kodeMK = "MK003";
        mk3.namaMk = "Sistem Informasi";
        mk3.sks = 2;
        mk3.nilaiAngka = 3.8;

        System.out.println("=== MATA KULIAH 1 ===");
        mk1.tampilData();

        System.out.println("\n=== MATA KULIAH 2 ===");
        mk2.tampilData();

        System.out.println("\n=== MATA KULIAH 3 ===");
        mk3.tampilData();

        double totalBobot = mk1.hitungBobotNilai()
                + mk2.hitungBobotNilai()
                + mk3.hitungBobotNilai();

        System.out.printf("Total Bobot Nilai = %.1f%n", totalBobot);
    }
}
