/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek;

/**
 *
 * @author ACER
 */
public class NomorTelepon extends NomorKontak{
    public NomorTelepon(String nomorKontak) throws InvalidNumberException{
        super.nomorKontak = new TelephoneValidator(nomorKontak);
    }
    
    @Override
    public void cetakNomor() {
        String nomorKontak = super.getNomorKontak();
        System.out.println("(" + nomorKontak.substring(0, 3) + ")" + nomorKontak.substring(4, nomorKontak.length()) + ")");
    }

}

/*
    TODO Implementasi NomorTelepon
    Ini tinggal nyamakan dengan yang di Nomor Faksimile
 */
