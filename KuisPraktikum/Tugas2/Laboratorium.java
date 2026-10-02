package KuisPraktikum.Tugas2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import KuisPraktikum.Tugas1.Laptop;

public class Laboratorium {
     public static final int MAKS_PINJAM = 2;   // batas pinjaman aktif per mahasiswa

    private final String nama;
    private final List<Laptop> daftarLaptop = new ArrayList<>();
    private final List<Peminjaman> riwayat = new ArrayList<>();

    public Laboratorium(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public boolean tambahLaptop(Laptop lp) {
        if(lp==null || cariLaptop(lp.getKodeAset()) != null){
            return false;
        }

        daftarLaptop.add(lp);
        return true;
        
    }

    public Laptop cariLaptop(String kodeAset) {
       if (kodeAset == null){
        return null;
       } 

       for (Laptop lp : daftarLaptop) {
            if (kodeAset.equals(lp.getKodeAset())) {
                return lp;
            }
       }

       return null;
        
    }

    public int jumlahPinjamanAktif(Mahasiswa m) {
        if (m == null){
            return 0;
        }

        int jumlah = 0;
        for (Peminjaman p : riwayat) {
            if (p.isAktif() && p.getMahasiswa().getNim().equals(m.getNim())){
                jumlah++;
            }
        }
        return jumlah;
        
    }

    public Peminjaman pinjamkan(Mahasiswa m, String kodeAset) {
        if (m ==null){
            return null;
        }

        Laptop lp = cariLaptop(kodeAset);
        if (lp == null){
            return null;
        }

        if (!lp.isTersedia()){
            return null;
        }

        if (jumlahPinjamanAktif(m)>= MAKS_PINJAM){
            return null;
        }

        if (!lp.pinjam()){
            return null;
        }

        Peminjaman p = new Peminjaman(m, lp);
        riwayat.add(p);
        return p;
        
    }

    public boolean kembalikan(String kodeAset) {
        Laptop lp = cariLaptop(kodeAset);
        if (lp == null){
            return false;
        }

        for (Peminjaman p : riwayat) {
            if (p.isAktif() && p.getLaptop() == lp){
                p.selesai();
                lp.kembalikan();
                return true;
            }
        }
        return false;
    }

    public List<Laptop> getDaftarLaptop() {
        return Collections.unmodifiableList(daftarLaptop);
    }
}
