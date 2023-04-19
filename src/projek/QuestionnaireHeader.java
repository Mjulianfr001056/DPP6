package projek;

/**
 * Merupakan sebuah record sebagai header dari kuesioner DPP.
 * Kelas ini langsung membuat constructor, getter, setter, dan method lainnya dari:
 * 1. kodeProvinsi bertipe String
 * 2. kodeKabupaten bertipe String, dan 
 * 3. tanggal bertipe String.
 */
public record QuestionnaireHeader(String kodeProvinsi, String kodeKabupaten, String tanggal) {
    
}
