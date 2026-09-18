package jobsheet3;
import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        boolean selesai = false;

        while (!selesai) {
            System.out.println("\n=== MENU OPERASIONAL KONTAINER ===");
            System.out.println("1. Tambah Muatan");
            System.out.println("2. Turunkan Muatan");
            System.out.println("3. Cek Berat Muatan Saat Ini");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan berat muatan yang ingin ditambahkan (kg): ");
                    double beratTambah = scanner.nextDouble();
                    kontainerAlfa.tambahMuatan(beratTambah);
                    System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
                    break;

                case 2:
                    System.out.print("Masukkan berat muatan yang ingin diturunkan (kg): ");
                    double beratTurun = scanner.nextDouble();
                    kontainerAlfa.turunkanMuatan(beratTurun);
                    System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
                    break;

                case 3:
                    System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
                    break;

                case 4:
                    selesai = true;
                    System.out.println("Sistem operasi pergudangan selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }
}