package projek;
/**
 * Merupakan sebuah kelas untuk melemparkan exception jika terdapat ketidaksesuaian/kesalahan nilai/angka yang diinputkan oleh user.
 * kelas ini hanya dipanggil dipanggil ketika syarat validasi nilai tidak terpenuhi. 
 * @author KELOMPOK 6 DPP : Rizky Rahmadani
 */
public class InvalidNumberException extends Exception{
    /**
     * Merupakan method untuk membuat instance dari kelas InvalidNumberException dengan pesan tertentu.   * 
     * @param message Pesan yang akan dimunculkan. 
     */
    public InvalidNumberException(String message) {
        super(message);
    }
}
