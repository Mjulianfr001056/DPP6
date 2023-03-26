/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek;

/**
 *
 * @author KELOMPOK 6 DPP
 */
public class KIP {
    //properties
    private KIPValidator kodeProvinsi;
    private KIPValidator kodeKabupaten;
    private KIPValidator kodeKecamatan;
    private KIPValidator kodeKJU;
    private static KIPValidator noUrutKabupatenKota;
    /*
    TODO Ubah Attribut
    Ubah atribut pakai Interface KIP Validator semua
     */
    //constructor


    public KIP() {
    }

    public KIP(String kodeProvinsi, String kodeKabupaten, String kodeKecamatan, String kodeKJU) throws KIPException{
        this.kodeProvinsi = new KodeProvinsiValidator(kodeProvinsi);
        this.kodeKabupaten = new KodeKabupatenValidator(kodeKabupaten);
        this.kodeKecamatan = new KodeKecamatanValidator(kodeKecamatan);
        this.kodeKJU = new KodeKJUValidator(kodeKJU);

        KIP.noUrutKabupatenKota = KIP.noUrutKabupatenKota == null ? new NoUrutValidator("1") :
                new NoUrutValidator(String.valueOf(Integer.parseInt(noUrutKabupatenKota.getCode())+1));

        /*
        TODO Ubah constructor
        1. Ubah semua atribut kode pakai new KodeValidator
        2. Sesuaikan nama validatornya dengan atribut tsb karena validasinya beda-beda kan
         */
    }

    public String getKodeProvinsi() {
        return kodeProvinsi.getCode();
    }

    public String getKodeKabupaten() {
        return kodeKabupaten.getCode();
    }

    public String getKodeKecamatan() {
        return kodeKecamatan.getCode();
    }

    public String getKodeKJU() {
        return kodeKJU.getCode();
    }

    public static String getNoUrutKabupatenKota() {
        return noUrutKabupatenKota.getCode();
    }

    public void setKodeProvinsi(String kodeProvinsi) {
        try {
            this.kodeProvinsi = new KodeProvinsiValidator(kodeProvinsi);
        }catch (KIPException e){
            System.out.println("Gagal melakukan penyuntingan kode provinsi");
        }
    }

    public void setKodeKabupaten(String kodeKabupaten) {
        try {
            this.kodeKabupaten = new KodeKabupatenValidator(kodeKabupaten);
        }catch (KIPException e){
            System.out.println("Gagal melakukan penyuntingan kode kabupaten");
        }

    }

    public void setKodeKecamatan(String kodeKecamatan) {
        try {
            this.kodeKecamatan = new KodeKecamatanValidator(kodeKecamatan);
        }catch (KIPException e){
            System.out.println("Gagal melakukan penyuntingan kode kecamatan");
        }

    }

    public void setKodeKJU(String kodeKJU) {
        try {
            this.kodeKJU = new KodeKJUValidator(kodeKJU);
        }catch (KIPException e){
            System.out.println("Gagal melakukan penyuntingan kode KJU");
        }

    }

    @Override
    public String toString(){
        return "Kode Provinsi : " + getKodeKabupaten() +
                ", Kode Kabupaten : " + getKodeKabupaten() +
                ", Kode Kecamatan : " + getKodeKecamatan() +
                ", Kode KJU : " + getKodeKJU() +
                ", No. Urut : " + KIP.noUrutKabupatenKota;
    }
}
