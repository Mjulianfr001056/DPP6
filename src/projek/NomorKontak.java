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
    protected ContactValidator nomorKontak;
    
    public String getNomorKontak(){
        return nomorKontak.getNomor();
    }
    
    abstract public void cetakNomor();
}
