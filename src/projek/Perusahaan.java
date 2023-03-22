/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek;

/**
 *
 * @author ACER
 */
public class Perusahaan{
    private String nama;
    private String alamat;
    private int bentukBadanHukum;
    
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat; 
    }
    public int getBentukBadanHukum(){
        return bentukBadanHukum;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setBentukBadanHukum(int bentukBadanHukum){
        this.bentukBadanHukum = bentukBadanHukum;
    }
}
