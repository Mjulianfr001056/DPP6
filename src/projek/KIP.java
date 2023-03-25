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
        if (this.noUrutKabupatenKota == null) 
        {
            this.noUrutKabupatenKota = new NoUrutValidator("1");
        }
        else
        {
            this.noUrutKabupatenKota = new NoUrutValidator(String.valueOf(Integer.parseInt(noUrutKabupatenKota.getCode())+1));
        }

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


//    public String getKodeKabupaten() {
//        return this.kodeKabupaten.getCode();
//    }

    @Override
    public String toString(){
        return "Kode Provinsi : " + this.kodeProvinsi.getCode() + ", Kode Kabupaten : " + this.kodeKabupaten.getCode() + ", Kode Kecamatan : " + this.kodeKecamatan.getCode() + ", Kode KJU : " + this.kodeKJU.getCode() + ", No. Urut : " + this.noUrutKabupatenKota.getCode();
    }

    public static void main(String[] args) {
        //Testing code goes here
        /*KIP kip = new KIP();
        try{
            kip = new KIP("02", "1", "0", "0", "0");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }*/

        /*
        TODO Testdrive
        misal udh semua dibuat, coba masukin KIP yang pake kasus riil, klo berhasil bisa pull request yak
        
         */
        
        //KASUS BERHASIL
        KIP tes = new KIP();
        try{
            tes = new KIP("12", "71", "020", "07");
            System.out.println(tes.toString());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        KIP tes1 = new KIP();
        try{
            tes1 = new KIP("13", "72", "010", "01");
            System.out.println(tes1.toString());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        KIP tes6 = new KIP();
        try{
            tes6 = new KIP("14", "73", "070", "05");
            System.out.println(tes6.toString());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        
        //KODE PROVINSI GAGAL
        KIP tes2 = new KIP();
        try{
            tes2 = new KIP("42", "71", "02", "07");
            System.out.println(tes2.toString());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //System.out.println(kip.getKodeKabupaten());

        //KODE KABUPATEN GAGAL
        KIP tes3 = new KIP();
        try{
            tes3 = new KIP("12", "21", "02", "07");
            System.out.println(tes3.toString());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        //KODE KECAMATAN GAGAL
        KIP tes7 = new KIP();
        try{
            tes7 = new KIP("12", "71", "92", "07");
            System.out.println(tes7.toString());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

                KIP tes4 = new KIP();
        try{
            tes4 = new KIP("12", "71", "011", "07");
            System.out.println(tes4.toString());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        //KODE KJU GAGAL
        KIP tes5 = new KIP();
        try{
            tes5 = new KIP("12", "71", "460", "09");
            System.out.println(tes5.toString());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
