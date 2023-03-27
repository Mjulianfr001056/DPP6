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
    
    public void setNama(String nama){
        try{
            this.nama = new CompanyName(nama);
        } catch(CompanyException e){
            System.out.println("Gagal Menginput Nama Perusahaan");
        }
    }

    public void setAlamat(String alamat){
        try{
            this.alamat = new CompanyAddress(alamat);
        } catch(CompanyException e){
            System.out.println("Gagal Menginput Alamat Perusahaan");
        }    
    }
    
   public void setBentukBadanHukum(String bentukBadanHukum){
       try{
           this.bentukBadanHukum = new CompanyBentukBadanHukum(bentukBadanHukum);
       } catch(CompanyException e){
            System.out.println("Gagal Menginput Alamat Perusahaan");
        }       
    }
   
    public void setNomorFax(String nomorFax){
        try{
            this.nomorFax = new NomorFaksimile(nomorFax);
        } catch(InvalidNumberException e){
            System.out.println("Gagal Menginput Nomor Faksimili");
        }  
    }
    
    public void setNomorTelefon(String nomorTelefon){
        try{
            this.nomorTelefon = new NomorTelepon(nomorTelefon);
        }catch(InvalidNumberException e){
            System.out.println("Gagal Menginput Nomor Telepon");
        }      
    }
    
}
