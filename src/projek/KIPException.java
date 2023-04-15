package projek;
/**
 * Sebuah kelas untuk melemparkan Exception apabila terjadi error pada pengisian KIP.
 * Error terjadi saat nilai inputan KIP tidak memenuhi validasi KIP.
 * @author Kelompok 6 DPP : Rizky Rahmadani
 */
public class KIPException extends Exception{
    /**
     * Merupakan sebuah method untuk membuat instance baru dari KIPException ketika
     * terjadi error saat validasi KIP.Lalu,method akan mengembalikan pesan terkait kesalahan tersebut.
     * @param message Pesan yang dimunculkan
     */
    public KIPException(String message) {
        super(message);
    }
}
