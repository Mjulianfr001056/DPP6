package projek;

/**
 * Merupakan sebuah abstract  class yang mengandung abstract method untuk mencetak nomor (nomor telepon dan faksimile)
 * abstract class ini akan diterapkan dalam 2 class yaitu class NomorTelepon dan NomorFaksimile
 * @author Kelompok 6 DPP : Natalie Merry Angelina
 */
abstract class NomorKontak {
    protected ContactValidator nomorKontak;
    
    /**
     * Merupakan method untuk mengambil nomor (nomor telepon/nomor faksimile)
     * @return {@code String}   Berupa nomor yang ingin diambil.
     */
    public String getNomorKontak(){
        return nomorKontak.getNomor();
    }
    
    /**
     * Merupakan method untuk mencetak nomor (nomor telepon/nomor faksimile)
     * @return {@code String}   Berupa nomor yang ingin dicetak.
     */
    abstract public void cetakNomor();
}
