package KuisPraktikum.Tugas2;

import KuisPraktikum.Tugas1.Laptop;

public class Peminjaman {
    private Mahasiswa mahasiswa;
    private Laptop laptop;
    private boolean aktif;

    public Peminjaman(Mahasiswa m, Laptop lp) {
        this.mahasiswa = m;
        this.laptop = lp;
        this.aktif = true;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public boolean isAktif() {
        return aktif; 
    }

    public void selesai() {
        aktif = false;
    }
}
