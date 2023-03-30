package projek;

import java.util.HashMap;

public class CompanyResponse {
    QuestionnaireData questionnaireData;
    String jenisUsahaUtama;

    public CompanyResponse(QuestionnaireData questionnaireData) {
        this.questionnaireData = questionnaireData;
    }

    public void setJenisUsahaUtama(String jenisUsahaUtama) throws QuestionnaireException {
        if(!jenisUsahaUtama.matches("[1-9]|1[0-1]")){
            throw new QuestionnaireException("Jenis usaha utama harus berada di rentang 1-11");
        }
        if (jenisUsahaUtama.equals("1") && !questionnaireData.getTanamanPangan()) {
            throw new QuestionnaireException("Jenis usaha utama tidak berpasangan!");
        }
        if (jenisUsahaUtama.equals("2") && !questionnaireData.getHortikultura()) {
            throw new QuestionnaireException("Jenis usaha utama tidak berpasangan!");
        }
        if (jenisUsahaUtama.equals("3") && questionnaireData.getPerkebunan().equals("0")) {
            throw new QuestionnaireException("Jenis usaha utama tidak berpasangan!");
        }
        if (jenisUsahaUtama.matches("[4-6]") && !questionnaireData.getKehutanan()) {
            throw new QuestionnaireException("Jenis usaha utama tidak berpasangan!");
        }
        if (jenisUsahaUtama.matches("[7-8]") && !questionnaireData.getPerikanan()) {
            throw new QuestionnaireException("Jenis usaha utama tidak berpasangan!");
        }
        if (jenisUsahaUtama.matches("9|10|11") && !questionnaireData.getPeternakan()) {
            throw new QuestionnaireException("Jenis usaha utama tidak berpasangan!");
        }

        this.jenisUsahaUtama = jenisUsahaUtama;
    }

    public static String map(int mapped){
        return JenisUsahaUtamaMap.getInstance().getValue(mapped);
    }
}

final class JenisUsahaUtamaMap {
    private static final JenisUsahaUtamaMap INSTANCE = new JenisUsahaUtamaMap();
    private final HashMap<Integer, String> map = new HashMap<>();

    private JenisUsahaUtamaMap() {
        map.put(1, "Tanaman Pangan");
        map.put(2, "Hortikultura");
        map.put(3, "Perkebunan");
        map.put(4, "Kehutanan");
        map.put(5, "Kehutanan");
        map.put(6, "Kehutanan");
        map.put(7, "Perikanan");
        map.put(8, "Perikanan");
        map.put(9, "Peternakan");
        map.put(10, "Peternakan");
        map.put(11, "Peternakan");
    }

    public static JenisUsahaUtamaMap getInstance() {
        return INSTANCE;
    }

    public String getValue(int key) {
        return map.get(key);
    }
}
