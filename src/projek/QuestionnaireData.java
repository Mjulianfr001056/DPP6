package projek;

import java.util.HashMap;
/**
 * Merupakan sebuah class untuk menyimpan pilihan pada kondisi perusahaan dan subsektor, terdiri dari :
 * Konfirmasi Keberadaan Perusahaan,
 * Kondisi Perusahaan,
 * 6 subsektor yang terdiri atas :
 * Tanaman Pangan,
 * Hortikultura,
 * Perkebunan,
 * Peternakan,
 * Kehutanan, dan
 * Perikanan.
 *@author Kelompok 6 DPP : Rifky Maulana Putra
 *@author Kelompok 6 DPP : Rizky Rahmadani
 * 
 */
public class QuestionnaireData {
   
    private QuestionnaireValidator<Boolean> confirmed;           // kolom 12
    private QuestionnaireValidator<Integer> kondisiPerusahaan;   // kolom 13
    private QuestionnaireValidator<Boolean> tanamanPangan;       // kolom 14
    private QuestionnaireValidator<Boolean> hortikultura;        // kolom 15
    private QuestionnaireValidator<String>  perkebunan;           // kolom 16
    private QuestionnaireValidator<Boolean> peternakan;          // kolom 17
    private QuestionnaireValidator<Boolean> kehutanan;           // kolom 18
    private QuestionnaireValidator<Boolean> perikanan;           // kolom 19

    public QuestionnaireData() {
        try{
            confirmed = new BooleanField("0");
            kondisiPerusahaan = new IntegerField("0");
            tanamanPangan = new BooleanField("0");
            hortikultura = new BooleanField("0");
            perkebunan = new StringField("0");
            peternakan = new BooleanField("0");
            kehutanan = new BooleanField("0");
            perikanan = new BooleanField("0");
        }catch (QuestionnaireException e){
            System.out.println(e.getMessage());
        }
    }

    public boolean getConfirmed() {
        return confirmed.getAttribute().booleanValue();
    }

    /**
     * Merupakan method untuk menyunting status Konfirmasi Keberadaan Perusahaan di database.
     * @param confirmed Merupakan nilai yang akan diinput ke Konfirmasi Keberadaan Perusahaan.
     */
    public void setConfirmed(String confirmed){
        try {
            this.confirmed = new BooleanField(confirmed);
        } catch (QuestionnaireException e) {
            System.out.println("Isian Salah");
        }
    }

    /**
     * Merupakan method untuk mengambil konfirmasi keberadaan perusahaan di database.
     * @return {@code int} Kondisi perusahaan.
     */
    public int getKondisiPerusahaan() {    
       return kondisiPerusahaan.getAttribute().intValue();
    }

     /**
     * Merupakan method untuk menyunting Kondisi Perusahaan di database
     * @param kondisiPerusahaan Merupakan nilai yang akan diinput ke Kondisi Perusahaan.
     */
    public void setKondisiPerusahaan(String kondisiPerusahaan){
       try {
           this.kondisiPerusahaan = new IntegerField(kondisiPerusahaan);
       } catch(QuestionnaireException e) {
           System.out.println("Isian Salah");
       }
    }

    /**
     * Merupakan method untuk mengambil status Tanaman Pangan perusahaan di databse.
     * @return {@code boolean} Status Tanaman Pangan Perusahaan.
     */
    public boolean getTanamanPangan() {
        return tanamanPangan.getAttribute().booleanValue();
    }

    /**
     * Merupakan method untuk menyunting status Tanaman Pangan perusahaan di database.
     * @param tanamanPangan Merupakan nilai yang akan diinput ke Tanaman Pangan.
     */
    public void setTanamanPangan(String tanamanPangan){
        try {
            this.tanamanPangan = new BooleanField(tanamanPangan);
        } catch(QuestionnaireException e) {
            System.out.println("Isian Salah");
        }
    }

    /**
     * Merupakan method untuk mengambil status Hortikultura perusahaan di database.
     * @return {@code boolean} Status Hortikultura perusahaan.
     */
    public boolean getHortikultura() {
        return hortikultura.getAttribute().booleanValue();
    }

    /**
     * Merupakan method untuk menyunting status Hortikultura perusahaan di database.
     * @param hortikultura Merupakan nilai yang akan diinput ke Hortikultura.
     */
    public void setHortikultura(String hortikultura){
        try {
            this.hortikultura = new BooleanField(hortikultura);
        } catch(QuestionnaireException e) {
            System.out.println("Isian Salah");
        }
    }

     /**
     * Merupakan method untuk mengambil status Perkebunan perusahaan di database.
     * @return {@code String} Status Perkebunan Perusahaan.
     */
    public String getPerkebunan() {
        //return perkebunan.getAttribute().toString();
        return perkebunan.getAttribute();
    }

    /**
     * Merupakan method untuk menyunting status Perkebunan perusahaan di database.
     * @param perkebunan Merupakan nilai yang akan diinput ke dalam Perkebunan.
     */
    public void setPerkebunan(String perkebunan){
        try {
            this.perkebunan = new StringField(perkebunan);
        } catch(QuestionnaireException e) {
            System.out.println("Isian Salah");
        }
    }

    /**
     * Merupakan method untuk mengambil status Peternakan perusahaan di database.
     * @return {@code boolean} Status Peternakan Perusahaan
     */
    public boolean getPeternakan() {
        return peternakan.getAttribute().booleanValue();
    }

    /**
     * Merupakan method untuk menyunting status Peternakan perusahaan di database.
     * @param peternakan Merupakan nilai yang akan diinput ke dalam Peternakan.
     */
    public void setPeternakan(String peternakan){
        try {
            this.peternakan = new BooleanField(peternakan);
        } catch(QuestionnaireException e) {
            System.out.println("Isian Salah");
        }
    }

    /**
     * Merupakan method untuk mengambil status Kehutanan perusahaan di database.
     * @return {@code boolean} Status Kehutanan Perusahaan.
     */
    public boolean getKehutanan() {
        return kehutanan.getAttribute().booleanValue();
    }

    /**
     * Merupakan method untuk menyunting status Kehutanan perusahaan di database.
     * @param kehutanan Merupakan nilai yang akan diinput ke dalam Kehutanan.
     */
    public void setKehutanan(String kehutanan){
       try{
           this.kehutanan = new BooleanField(kehutanan);
       } catch (QuestionnaireException e) {
           System.out.println("Isian Salah");
       }
    }

     /**
     * Merupakan method untuk mengambil status Perikanan perusahaan di database.
     * @return {@code boolean} Status Perikanan Perusahaan.
     */
    public boolean getPerikanan() {
        return perikanan.getAttribute().booleanValue();
    }

    public void setPerikanan(String perikanan){
       try{
           this.perikanan = new BooleanField(perikanan);
       } catch (QuestionnaireException e) {
           System.out.println("Isian Salah");
       }
    }

    public static String map(Boolean mapped){
        return mapped ? "Ya" : "Tidak";
    }

    /**
     * Melakukan mapping untuk nilai integer pada kondisi dan status subsektor perusahaan.
     * @param mapped Nilai inputan integer yang akan di mapping.
     * @return Nilai kondisi perusahaan yang sesuai pada class KondisiPerusahaanMap.
     */
    public static String map(Integer mapped){
        return KondisiPerusahaanMap.getInstance().getValue(mapped.intValue());
    }

    /**
     * Melakukan mapping untuk nilai String pada status subsektor Perkebunan perusahaan.
     * @param mapped Nilai inputan String yang akan di mapping
     * @return Nilai kondisi perusahaan yang sesuai pada class KondisiPerusahaanMap.
     */
    public static String map(String mapped){
        return PerkebunanMap.getInstance().getValue(mapped);
    }
    
    /**
     * Merupakan method untuk menampilkan seluruh informasi terkait status perusahaan dan subsektor perusahaan tersebut.
     * @return {@code String} Merupakan informasi terkait informasi kunjungan, kondisi, status subsektor tanaman pangan, 
     *                        hortikultura, perkebunan, peternakan, kehutanan, dan perikanan suatu perusahaan di database.
     */
    @Override
    public String toString()
    {
        return "Informasi Kunjungan: \u001B[33m"+ map(getConfirmed())+
                "\u001B[0m\nKondisi Perusahaan: \u001B[33m"+map(getKondisiPerusahaan())+
                "\u001B[0m\nTanaman Pangan: \u001B[33m"+map(getTanamanPangan())+
                "\u001B[0m\nHortikultura: \u001B[33m"+map(getHortikultura())+
                "\u001B[0m\nPerkebunan: \u001B[33m"+map(getPerkebunan())+
                "\u001B[0m\nPeternakan: \u001B[33m"+map(getPeternakan())+
                "\u001B[0m\nKehutanan: \u001B[33m"+map(getKehutanan())+
                "\u001B[0m\nPerikanan: \u001B[33m"+map(getPerikanan()) + "\u001B[0m";
    }
}

/**
 * Merupakan kelas untuk membuat hashmap yang akan digunakan dalam validasi Kondisi Perusahaan.
 * @author Kelompok 6 DPP: Muhammad Julian Firdaus
 */
final class KondisiPerusahaanMap {
    private static final KondisiPerusahaanMap INSTANCE = new KondisiPerusahaanMap();
    private final HashMap<Integer, String> map = new HashMap<>();
    
    /**
     * Merupakan berbagai inputan yang valid dalam pengisian kolom Kondisi Perusahaan.
     */
    private KondisiPerusahaanMap() {
        map.put(1, "Aktif");
        map.put(2, "Tutup Sementara/Tidak Ada Kegiatan");
        map.put(3, "Belum Berproduksi");
        map.put(4, "Tidak Bersedia Diwawancarai");
        map.put(5, "Alih Usaha ke Non Pertanian");
        map.put(6, "Tutup");
        map.put(7, "Tidak Ditemukan");
        map.put(8, "Baru");
        map.put(9, "Ganda");
        map.put(0, "N/A");
    }

    /**
     * Merupakan method untuk mengambil instance dari Kondisi Perusahaan yang diinput di dalam database.
     * @return Instance hashmap KondisiPerusahaan.
     */
    public static KondisiPerusahaanMap getInstance() {
        return INSTANCE;
    }

    /**
     * Merupakan method untuk mengambil nilai dari Kondisi Perusahaan di dalam database.
     * @param key Nilai inputan yang akan di mapping.
     * @return Hasil mapping dari parameter yang diberikan.
     */
    public String getValue(int key) {
        return map.get(key);
    }
}

/**
 * Merupakan class untuk membuat hashmap yang akan digunakan untuk memvalidasi subsektor Perkebunan.
 * @author Kelompok 6 DPP: Muhammad Julian Firdaus
 */
final class PerkebunanMap {
    private static final PerkebunanMap INSTANCE = new PerkebunanMap();
    private final HashMap<String, String> map = new HashMap<>();

    /**
     * Merupakan berbagai inputan bertipe String yang akan dimapping menjadi value yang sesuai.
     */
    private PerkebunanMap() {
        map.put("3a", "Kakao/Cokelat");
        map.put("3b", "Karet");
        map.put("3c", "Kelapa Sawit");
        map.put("3d", "Kopi");
        map.put("3e", "Teh");
        map.put("3f", "Tebu");
        map.put("3g", "Tembakau");
        map.put("3h", "Cengkih");
        map.put("3i", "Kelapa");
        map.put("3j", "Lada");
        map.put("3k", "Tanaman Lainnya");
        map.put("0",  "Tidak");
    }

    /**
     * Merupakan method untuk mengambil instance dari status Perkebunan yang diinput di dalam database.
     * @return Instance hashmap perkebunan.
     */
    public static PerkebunanMap getInstance() {
        return INSTANCE;
    }

    /**
     * Merupakan method untuk mengambil nilai dari status Perkebunan di dalam database.
     * @param key Nilai inputan yang akan di mapping.
     * @return Hasil mapping dari parameter yang diberikan.
     */
    public String getValue(String key) {
        return map.get(key);
    }
}