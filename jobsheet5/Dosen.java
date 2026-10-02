package jobsheet5;

public class Dosen extends Pegawai {
    public int jumlahSKS;
    public int TARIF_SKS = 10000;

    public Dosen(String nip, String nama, String alamat){
        super(nip, nama, alamat);
    }

    public void setSKS(int jumlahSKS){
        this.jumlahSKS = jumlahSKS;
    }

    @Override 
    public int getGaji(){
        return jumlahSKS * TARIF_SKS;
    }
}
