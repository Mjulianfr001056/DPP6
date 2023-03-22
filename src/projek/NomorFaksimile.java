/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek;

/**
 *
 * @author ACER
 */
public class NomorFaksimile extends NomorKontak{
    @Override
    public void cetakNomor() {
       System.out.println("(" + nomor.substring(0, 2) + ")" + nomor.substring(3,nomor.length()) + ")"); 
    }
}
