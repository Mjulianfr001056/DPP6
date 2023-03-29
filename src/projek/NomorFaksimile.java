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
    public NomorFaksimile(String nomorKontak){
        try{
            super.nomorKontak = new FaximileValidator(nomorKontak);
        }catch (InvalidNumberException e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void cetakNomor() {
        String nomorKontak = super.getNomorKontak();
        System.out.println("(" + nomorKontak.substring(0, 2) + ")" +
                nomorKontak.substring(3, nomorKontak.length()) + ")");
    }
}
