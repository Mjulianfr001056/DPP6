package projek;

/**
 * Merupakan sebuah class untuk melemparkan exception ketika terjadi error saat pengisian kuesioner.
 * Kelas ini dipanggil jika saat pengisian kuesioner tidak mengandung jawaban yang telah ditentukan.
 * 
 */
public class QuestionnaireException extends Exception{

    /**
     * Merupakan method yang membuat instance baru dari QuestionnaireException dengan pesan detail yang diberikan.
     * @param message pesan detail yang akan disampaikan
     */
    public QuestionnaireException(String message) {
        super(message);
    }
}
