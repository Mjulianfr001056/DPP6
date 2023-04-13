package projek;

/**
 * Merupakan class exception yang dapat mendeteksi dan menampilkan pesan terkait exception
 */
public class CompanyException extends Exception{
    public CompanyException(String message) {
        super(message);
    }
}
