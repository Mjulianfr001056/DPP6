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
    private String kodeKecamatan;
    private String kodeKJU;
    private String noUrutKabupatenKota;
    /*
    TODO Ubah Attribut
    Ubah atribut pakai Interface KIP Validator semua
     */
    //constructor

    public KIP(String kodeProvinsi, String kodeKabupaten, String kodeKecamatan, String kodeKJU, String noUrutKabupatenKota) throws KIPException{
        this.kodeProvinsi = new KodeProvinsiValidator(kodeProvinsi);
        this.kodeKabupaten = new KodeKabupatenValidator(kodeKabupaten);
        this.kodeKecamatan = kodeKecamatan;
        this.kodeKJU = kodeKJU;
        this.noUrutKabupatenKota = noUrutKabupatenKota;

        /*
        TODO Ubah constructor
        1. Ubah semua atribut kode pakai new KodeValidator
        2. Sesuaikan nama validatornya dengan atribut tsb karena validasinya beda-beda kan
         */
    }

    //method
//    public String getKodeProvinsi(){
//        return this.kodeProvinsi;
//    }
//
//    public void setKodeProvinsi(String kode){
//        this.kodeProvinsi = kode;
//    }
//
//    public String getKodeKabupaten(){
//        return this.kodeKabupaten;
//    }
//
//    public void setKodeKabupaten(String kode){
//        this.kodeKabupaten = kode;
//    }
//
//        public String getKodeKecamatan(){
//        return this.kodeKecamatan;
//    }
//
//    public void setKodeKecamatan(String kode){
//        this.kodeKecamatan = kode;
//    }
//
//        public String getKodeKJU(){
//        return this.kodeKJU;
//    }
//
//    public void setKodeKJU(String kode){
//        this.kodeKJU = kode;
//    }
    
    @Override
    public String toString(){
        return "Kode Provinsi : "+this.kodeProvinsi +", Kode Kabupaten : 0"+this.kodeKabupaten +", Kode Kecamatan : "+this.kodeKecamatan +", Kode KJU : "+this.kodeKJU+", No. Urut : "+this.noUrutKabupatenKota;
    }
    
}
