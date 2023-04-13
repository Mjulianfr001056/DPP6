package projek;

import java.util.HashMap;

/**
 * Merupakan class yang menyimpan informasi perusahaan berupa atribut questionnaireData dan jenisUsahaUtama
 */
public class CompanyResponse {
    QuestionnaireData questionnaireData;
    String jenisUsahaUtama;
    
    public CompanyResponse(QuestionnaireData questionnaireData) {
        this.questionnaireData = questionnaireData;
        jenisUsahaUtama = "0";
    }
    
    
    /**
     * Method untuk validasi jenis usaha utama dari sebuah perusahaan
     * @param jenisUsahaUtama         merupakan value yang diinput pada jenis usaha utama perusahaan
     * @throws QuestionnaireException terdapat beberapa kondisi, yaitu:
     *                                1. Jika value yang diinput pada jenis usaha utama berada diluar rentang nilai 1 s/d 11
     *                                2. Jika value yang diinput pada jenis usaha utama bernilai 1 (Tanaman Pangan), namun value yang diinput pada questionnaireData bukan merupakan usaha di bidang tanaman pangan
     *                                3. Jika value yang diinput pada jenis usaha utama bernilai 2 (Holtikultura), namun value yang diinput pada questionnaireData bukan merupakan usaha di bidang holtikultura
     *                                4. Jika value yang diinput pada jenis usaha utama bernilai 3 (Perkebunan), namun value yang diinput pada questionnaireData di bidang perkebunan ialah 0
     *                                5. Jika value yang diinput pada jenis usaha utama bernilai 4 s/d 6 (Kehutanan), namun value yang diinput pada questionnaireData bukan merupakan usaha di bidang kehutanan
     *                                6. Jika value yang diinput pada jenis usaha utama bernilai 7 s/d 8 (Perikanan), namun value yang diinput pada questionnaireData bukan merupakan usaha di bidang perikanan
     *                                7. Jika value yang diinput pada jenis usaha utama bernilai 9/10/11 (Peternakan), namun value yang diinput pada questionnaireData bukan merupakan usaha di bidang peternakan
     */
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
    
    /**
     * Method untuk mendapatkan kategori jenis usaha utama sesuai dengan value yang tersimpan pada atribut jenisUsahaUtama
     * Contoh: Jika value jenisUsahaUtama=1, maka method akan mengembalikan String berupa "Tanaman Pangan"
     * @param mapped merupakan value dari atribut jenisUsahaUtama yang dimiliki objek  
     * @return       merupakan kategori dari jenis usaha utama perusahaan yang berupa String
     */
    public static String map(int mapped){
        return JenisUsahaUtamaMap.getInstance().getValue(mapped);
    }
    
    /**
     * Method untuk menampilkan informasi pada class questionnaireData dan informasi terkait jenis usaha utama sebuah perusahaan
     * @return merupakan informasi terkait atribut jenisUsahaUtama dan questionnaireData
     */
    @Override
    public String toString() {
        return questionnaireData.toString() +
                "\u001B[0m\nJenis usaha utama: \u001B[33m" + map(Integer.parseInt(jenisUsahaUtama)) + "\u001B[0m";
    }
}

/**
 * Merupakan class yang menyimpan database terkait jenis usaha utama sebuah perusahaan dengan klasifikasi sebagai berikut:
 * 0        = Tidak diketahui
 * 1        = Tanaman Pangan
 * 2        = Holtikultura
 * 3        = Perkebunan 
 * 4 s/d 6  = Kehutanan
 * 7 s/d 8  = Perikanan
 * 9 s.d 11 = Peternakan
 */
final class JenisUsahaUtamaMap {
    /**
     * Merupakan jenis usaha utama sebuah perusahaan dengan rentang nilai 1 s/d 11
     */
    private static final JenisUsahaUtamaMap INSTANCE = new JenisUsahaUtamaMap();
    /**
     * Merupakan hash map yang menghubungkan value jenisUsahaUtama (1 s/d 11) dengan klasifikasi jenis usaha utama perusahaan
     */
    private final HashMap<Integer, String> map = new HashMap<>();

    private JenisUsahaUtamaMap() {
        map.put(0, "Tidak diketahui");
        map.put(1, "Tanaman Pangan");
        map.put(2, "Holtikultura");
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
    
    /**
     * Method untuk mendapatkan jenis usaha utama sebuah perusahaan berupa nilai atau angka 1 s/d 11
     * @return objek dengan class JenisUsahaUtamaMap
     */
    public static JenisUsahaUtamaMap getInstance() {
        return INSTANCE;
    }

    /**
     * Method untuk mendapatkan kategori klasifikasi jenis usaha utama dalam bentuk value berupa nilai atau angka 1 s/d 11
     * @param key berupa nilai atau angka 1 ss/d 11 yang merupakan kode yang tersimpan dalam atribut jenisUsahaUtama
     * @return    berupa kategori klasifikasi jenis usaha utama sebuah perusahaan 
     */
    public String getValue(int key) {
        return map.get(key);
    }
}
