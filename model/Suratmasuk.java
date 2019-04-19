package model;

public class Suratmasuk {

    private String nomor;
    private String hal;
    private String tanggal_masuk;
    private String alamat;

    public Suratmasuk() {}

    public Suratmasuk(String nomor, String hal, String tanggal_masuk, String alamat) {
        this.nomor = nomor;
        this.hal = hal;
        this.tanggal_masuk = tanggal_masuk;
        this.alamat = alamat;
    }

    @Override
    public boolean equals(Object obj) {
        Suratmasuk sm = (Suratmasuk) obj;
        if(this.nomor.equals(sm.getNomor())) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "[ " + nomor + ", " + hal + ", " + tanggal_masuk + ", " + alamat + " ];";
    }



    public void setNomor(String nomor) { this.nomor = nomor; }

    public String getNomor() { return nomor; }

    public void setHal(String hal) { this.hal = hal; }

    public String getHal() { return hal; }

    public void setTanggal_masuk(String tanggal_masuk) { this.tanggal_masuk = tanggal_masuk; }

    public String getTanggal_masuk() { return tanggal_masuk; }

    public void setAlamat(String alamat) { this.alamat = alamat; }

    public String getAlamat() { return alamat; }

}