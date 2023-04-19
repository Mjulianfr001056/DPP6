package projek;

/** 
 * Merupakan sebuah class yang berfungsi untuk menyimpan nomor telepon
 * class ini meng-extends abstract class NomorKontak
 * @author Kelompok 6 DPP : Natalie Merry Angelina
 */
public class NomorTelepon extends NomorKontak{
    public NomorTelepon(String nomor) throws InvalidNumberException {
        super.nomorKontak = new TelephoneValidator(nomor);
    }
    
     /**
     * Merupakan method untuk mencetak nomor telepon
     * format nomor telepon yang dicetak adalah (4 digit) digit yang tersisa
     * contoh (0215)77764312
     */
    @Override
    public void cetakNomor() {
        String nomor = super.getNomorKontak();
        System.out.println("(" + nomor.substring(0, 4) + ") " +
                nomor.substring(4));
    }
}

