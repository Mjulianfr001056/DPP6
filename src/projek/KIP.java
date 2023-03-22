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
    private String kodeProv;
    private String kodeKab;
    private String kodeKec;
    private String kodeKJU;
    private String noUrutKabKot;
    
    //constructor
    public KIP (){
  
    }
    
    //method
    public String getKodeProv(){
        return this.kodeProv;
    }
    
    public void setKodeProv(String kode){
        this.kodeProv = kode;
    }
    
    public String getKodeKab(){
        return this.kodeKab;
    }
    
    public void setKodeKab(String kode){
        this.kodeKab = kode;
    }
    
        public String getKodeKec(){
        return this.kodeKec;
    }
    
    public void setKodeKec(String kode){
        this.kodeKec = kode;
    }
    
        public String getKodeKJU(){
        return this.kodeKJU;
    }
    
    public void setKodeKJU(String kode){
        this.kodeKJU = kode;
    }
    
    @Override
    public String toString(){
        return "Kode Provinsi : "+this.kodeProv+", Kode Kabupaten : 0"+this.kodeKab+", Kode Kecamatan : "+this.kodeKec+", Kode KJU : "+this.kodeKJU+", No. Urut : "+this.noUrutKabKot;
    }
    
}
