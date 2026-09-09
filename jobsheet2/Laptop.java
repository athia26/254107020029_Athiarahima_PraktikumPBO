package jobsheet2;

public class Laptop {
    public String kodeInventaris;
    public String merk;
    public int ramGB;

    public void tampilSpesifikasi(){
        System.out.println("Kode Inventaris : " + kodeInventaris);
        System.out.println("Merk            : " + merk);
        System.out.println("RAM             : " + ramGB);
    }

    public int upgradeRam(int tambahanGB){
       ramGB += tambahanGB;
        return ramGB;
    }

    public int hitungSewa(int jumlahHari){
        return jumlahHari * 25000;
    }
}
