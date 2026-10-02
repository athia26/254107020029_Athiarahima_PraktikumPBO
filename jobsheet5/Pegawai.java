package jobsheet5;

public class Pegawai {
    public String nip;
    public String nama; 
    public String alamat;

    protected Pegawai(String nip, String nama, String alamat){
        this.nip=nip;
        this.nama=nama;
        this.alamat=alamat;
    }

    public String getNama(){
        return nama;
    }

    public int getGaji(){
        return 0;
    }
}

