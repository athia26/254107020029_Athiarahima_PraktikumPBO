package KuisPraktikum.Tugas1;

public class Laptop {
    private String kodeAset;
    private String merk;
    private int ramGB;
    private boolean tersedia;

    public Laptop(String kodeAset, String merk, int ramGB){
        if (kodeAset == null || !kodeAset.startsWith("LP-")) {
            throw new IllegalArgumentException("Kode aset harus diawali LP-");
        }

        if (merk==null || merk.isBlank()){
            throw new IllegalArgumentException("Merk tidak boleh kosong");
        }

        if (!ramValid(ramGB)){
            throw new IllegalArgumentException("RAM harus 4, 6, 8, 16 atau 32GB");
        }

        this.kodeAset = kodeAset;
        this.merk = merk;
        this.ramGB = ramGB;
        this.tersedia = true;
        
    }

    public String getKodeAset(){
        return kodeAset;
        
    }

    public String getMerk(){
        return merk;
    }

    public int getRamGB(){
        return ramGB;
    }

    public boolean isTersedia(){
        return tersedia;
    }

    public boolean pinjam(){
        if(tersedia){
            tersedia = false;
            return true;
        }

        return false;
    }

    public void kembalikan(){
        if (!tersedia){
            tersedia = true;
        } else{
            throw new IllegalStateException("Laptop sedang tersedia");
        }
    }

    public void upgradeRam(int ramBaru){
        if (!ramValid(ramBaru) || ramBaru <= ramGB){
            throw new IllegalArgumentException("RAM baru harus valid dan lebih besar dari RAM sekarang");
        }

        ramGB = ramBaru;
    }

    public String info(){
        return kodeAset + " | " + merk + " | " + ramGB + " GB | "+ (tersedia ? "tersedia" : "dipinjam");
    }

    private static boolean ramValid(int ram) {
        return ram == 4
                || ram == 8
                || ram == 16
                || ram == 32;
    }
}
