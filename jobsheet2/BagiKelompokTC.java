package jobsheet2;

public class BagiKelompokTC {
    public static void main(String[] args) {
        System.out.println("awal program");

        int jmlMahasiswa= 32;
        int jmlKelompok = 4;
        int anggotaPerKelompok = 0;

        try {
            anggotaPerKelompok = jmlMahasiswa/jmlKelompok;
        } catch (ArithmeticException e) {
            System.out.println("Jumlah kelompok tidak boleh nol");
        }

        System.out.println(anggotaPerKelompok);
        System.out.println("Akhir program");
    }
}
