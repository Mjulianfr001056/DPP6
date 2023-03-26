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

    //Tambahan di company bisa punya nomor kontak yekan
    private NomorKontak nomorFax;
    private NomorKontak nomorTelefon;

    
    public String getNama(){
        return nama.getAttribute();
    }
    public String getAlamat(){
        return alamat.getAttribute();
    }
    public String getBentukBadanHukum(){
        return bentukBadanHukum.getAttribute();
    }
    
    public void setNama(String nama) throws CompanyException{
        this.nama = new CompanyName(nama);
    }

    public void setNomorFax(String nomorFax) throws InvalidNumberException{
        this.nomorFax = new NomorFaksimile(nomorFax);
    }
    
    public void setNomorTelefon(String nomorTelefon) throws InvalidNumberException{
        this.nomorTelefon = new NomorTelepon(nomorTelefon);
    }
    
    public void setAlamat(String alamat) throws CompanyException{
        this.alamat = new CompanyAddress(alamat);
    }
    
   public void setBentukBadanHukum(String bentukBadanHukum) throws CompanyException{
        this.bentukBadanHukum = new CompanyBentukBadanHukum(bentukBadanHukum);
    }
}
