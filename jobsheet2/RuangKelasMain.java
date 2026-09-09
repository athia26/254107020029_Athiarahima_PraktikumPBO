package jobsheet2;

public class RuangKelasMain {
    public static void main(String[] args) {
        RuangKelas ruang = new RuangKelas();

        ruang.kodeRuang = "RT08";
        ruang.namaGedung = "Gedung Sipil";
        ruang.kapasitas = 40;
        ruang.jmlMhs = 32;

        ruang.tampilData();;
    }
}
