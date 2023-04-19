package projek;

/** 
 * Merupakan sebuah class yang berfungsi untuk menyimpan nomor faksimile
 * class ini meng-extends abstract class NomorKontak
 * @author Kelompok 6 DPP : Natalie Merry Angelina
 */
public class NomorFaksimile extends NomorKontak{
    public NomorFaksimile(String nomorKontak) throws InvalidNumberException {
        super.nomorKontak = new FaximileValidator(nomorKontak);
    }

    /**
     * Merupakan method untuk mencetak nomor faksimile
     * format nomor faksimile yang dicetak adalah (3 digit) digit yang tersisa
     * contoh (021)777643
     */
    @Override
    public void cetakNomor() {
        String nomorKontak = super.getNomorKontak();
        System.out.println("(" + nomorKontak.substring(0, 3) + ") " +
                nomorKontak.substring(3));
    }
}
