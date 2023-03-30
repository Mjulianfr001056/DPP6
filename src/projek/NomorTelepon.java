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
    public NomorTelepon() {
    }

    public NomorTelepon(String nomor){
        try{
            super.nomorKontak = new TelephoneValidator(nomor);
        }catch (InvalidNumberException e){
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public void cetakNomor() {
        String nomor = super.getNomorKontak();
        System.out.println("(" + nomor.substring(0, 4) + ") " +
                nomor.substring(4));
    }

}

