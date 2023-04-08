/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek;

/**
 * Merupakan class yang menyimpan Kode Identitas Perusahaaan (KIP), terdiri dari :
 * Kode Provinsi,
 * Kode Kabupaten,
 * Kode Kecamatan,
 * Kode KJU,
 * Nomor Urut dalam 1 Kabupaten / Kota.
 * @author KELOMPOK 6 DPP (Muhammad Restu Ilahi)
 */
public class KIP {
    //properties
    /**
     * Kode Provinsi dimana perusahaan itu berada.
     */
    private KIPValidator kodeProvinsi;
    /**
     * Kode Kabupaten/Kota dimana perusahaan itu berada.
     */    
    private KIPValidator kodeKabupaten;
    /**
     * Kode Kecamatan dimana perusahaan itu berada.
     */    
    private KIPValidator kodeKecamatan;
    /**
     * Kode KJU di sektor apa perusahaan itu bergerak.
     * Terdiri dari 01-07.
     */    
    private KIPValidator kodeKJU;
    /**
     * No urut perusahaan itu dalam pencacahan di suatu kabupaten/kota.
     */
    private KIPValidator noUrutKabupatenKota;

    //constructor
    public KIP() {
    }

    public KIP(String kodeProvinsi, String kodeKabupaten, String kodeKecamatan, String kodeKJU) throws KIPException{
        this.kodeProvinsi = new KodeProvinsiValidator(kodeProvinsi);
        this.kodeKabupaten = new KodeKabupatenValidator(kodeKabupaten);
        this.kodeKecamatan = new KodeKecamatanValidator(kodeKecamatan);
        this.kodeKJU = new KodeKJUValidator(kodeKJU);
    }

    public KIP(String kodeProvinsi, String kodeKabupaten, String kodeKecamatan, String kodeKJU, String noUrutKabupatenKota) throws KIPException{
        this.kodeProvinsi = new KodeProvinsiValidator(kodeProvinsi);
        this.kodeKabupaten = new KodeKabupatenValidator(kodeKabupaten);
        this.kodeKecamatan = new KodeKecamatanValidator(kodeKecamatan);
        this.kodeKJU = new KodeKJUValidator(kodeKJU);
        this.noUrutKabupatenKota = new NoUrutValidator(noUrutKabupatenKota);
    }

    /**
     * Method untuk mengambil kode provinsi dari suatu perusahaan di database.
     * @return {@code String}   kode provinsi dari perusahaan.
     */
    public String getKodeProvinsi() {
        return kodeProvinsi.getCode();
    }

    /**
     * Method untuk mengambil kode kabupaten dari suatu perusahaan di database.
     * @return {@code String}   kode kabupaten dari perusahaan.
     */
    public String getKodeKabupaten() {
        return kodeKabupaten.getCode();
    }

    /**
     * Method untuk mengambil kode kecamatan dari suatu perusahaan di database.
     * @return {@code String}   kode kecamatan dari perusahaan.
     */
    public String getKodeKecamatan() {
        return kodeKecamatan.getCode();
    }

    /**
     * Method untuk mengambil kode KJU dari suatu perusahaan di database.
     * @return {@code String}   kode KJU dari perusahaan.
     */    
    public String getKodeKJU() {
        return kodeKJU.getCode();
    }

    /**
     * Method untuk mengambil no urut dari suatu perusahaan di database.
     * @return {@code String}   no urut dari perusahaan.
     */
    public String getNoUrutKabupatenKota() {
        return noUrutKabupatenKota.getCode();
    }

    /**
     * Merupakan method untuk menyunting kode provinsi suatu perusahaan di database.
     * @param kodeProvinsi      Merupakan nilai yang akan diinput ke kode provinsi.
     */
    public void setKodeProvinsi(String kodeProvinsi) {
        try {
            this.kodeProvinsi = new KodeProvinsiValidator(kodeProvinsi);
        }catch (KIPException e){
            System.out.println("Gagal melakukan penyuntingan kode provinsi");
        }
    }

    /**
     * Merupakan method untuk menyunting kode kabupaten suatu perusahaan di database.
     * @param kodeKabupaten      Merupakan nilai yang akan diinput ke kode kabupaten.
     */
    public void setKodeKabupaten(String kodeKabupaten) {
        try {
            this.kodeKabupaten = new KodeKabupatenValidator(kodeKabupaten);
        }catch (KIPException e){
            System.out.println("Gagal melakukan penyuntingan kode kabupaten");
        }

    }

    /**
     * Merupakan method untuk menyunting kode kecamatan suatu perusahaan di database.
     * @param kodeKecamatan      merupakan nilai yang akan diinput ke kode kecamatan.
     */    
    public void setKodeKecamatan(String kodeKecamatan) {
        try {
            this.kodeKecamatan = new KodeKecamatanValidator(kodeKecamatan);
        }catch (KIPException e){
            System.out.println("Gagal melakukan penyuntingan kode kecamatan");
        }

    }

    /**
     * Merupakan method untuk menyunting kode KJU suatu perusahaan di database.
     * @param kodeKJU      merupakan nilai yang akan diinput ke kode KJU.
     */
    public void setKodeKJU(String kodeKJU) {
        try {
            this.kodeKJU = new KodeKJUValidator(kodeKJU);
        }catch (KIPException e){
            System.out.println("Gagal melakukan penyuntingan kode KJU");
        }

    }

    /**
     * Merupakan method untuk menampilkan seluruh informasi terkait Kode Identitas Perusahaan (KIP)
     * @return  {@code String}  Merupakan informasi terkait kode provinsi, kode kabupaten, kode kecamatan,
     *                          kode KJU, dan nomor urut suatu perusahaan di dalam 1 kabupaten/kota di database.
     */
    @Override
    public String toString(){
        return "Kode Provinsi: " + getKodeProvinsi() +
                "\nKode Kabupaten: " + getKodeKabupaten() +
                "\nKode Kecamatan: " + getKodeKecamatan() +
                "\nKode KJU: " + getKodeKJU() +
                "\nNo. Urut: " + getNoUrutKabupatenKota();
    }
}
