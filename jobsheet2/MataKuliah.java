package jobsheet2;

public class MataKuliah {
    public String kodeMK;
    public String namaMk;
    public int sks;
    public double nilaiAngka;

    public double hitungBobotNilai(){
        return sks * nilaiAngka;
    }

    public void tampilData() {
    System.out.println("Kode MK         : " + kodeMK);
    System.out.println("Nama MK         : " + namaMk);
    System.out.println("SKS             : " + sks);
    System.out.println("Nilai Angka     : " + nilaiAngka);
    System.out.printf("Bobot nilai     : %.1f%n", hitungBobotNilai());
}
}
