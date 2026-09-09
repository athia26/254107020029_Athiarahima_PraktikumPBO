package jobsheet2;

public class RuangKelas {
    public String kodeRuang;
    public String namaGedung;
    public int kapasitas;
    public int jmlMhs; 

    public int hitungSisaKursi(){
        return kapasitas - jmlMhs;
    }

    public void tampilData(){
        System.out.println("Kode Ruang      : "+kodeRuang);
        System.out.println("Nama Gedung     : "+namaGedung);
        System.out.println("Kapasitas       : "+kapasitas);
        System.out.println("Jumlah Mahasiswa: "+jmlMhs);
        System.out.println("Sisa Kursi      : "+hitungSisaKursi());
    }
}
