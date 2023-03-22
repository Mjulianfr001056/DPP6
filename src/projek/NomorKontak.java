/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek;

/**
 *
 * @author ACER
 */
abstract class NomorKontak {
    protected String nomor;
    
    public String getNomor(){
        return nomor;
    }
    public void setNomor(String nomor){
        this.nomor = nomor;
    }
    
    abstract public void cetakNomor();
}
