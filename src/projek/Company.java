/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek;

/**
 *
 * @author ACER
 */
public class Company {
    private CompanyValidator nama;
    private CompanyValidator alamat;
    private CompanyValidator bentukBadanHukum;
    private NomorKontak nomorFax;
    private NomorKontak nomorTelefon;

    public Company() {
    }

    public String getNama(){
        return nama.getAttribute();
    }
    public String getAlamat(){
        return alamat.getAttribute();
    }
    public String getBentukBadanHukum(){
        return bentukBadanHukum.getAttribute();
    }

    public String getNomorFax() {
        return nomorFax.getNomorKontak();
    }
    public String getNomorTelefon() {
        return nomorTelefon.getNomorKontak();
    }

    public void setNama(String nama){
        this.nama = new CompanyName(nama);
    }

    public void setAlamat(String alamat){
        this.alamat = new CompanyAddress(alamat);
    }
    
   public void setBentukBadanHukum(String bentukBadanHukum){
       this.bentukBadanHukum = new CompanyBentukBadanHukum(bentukBadanHukum);
    }
   
    public void setNomorFax(String nomorFax){
        this.nomorFax = new NomorFaksimile(nomorFax);
    }
    
    public void setNomorTelefon(String nomorTelefon){
        this.nomorTelefon = new NomorTelepon(nomorTelefon);
    }
    
}
