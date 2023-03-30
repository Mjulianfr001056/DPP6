
package projek;

import java.util.HashMap;

public class QuestionnaireData {
   
    private QuestionnaireValidator<Boolean> confirmed;           // kolom 12
    private QuestionnaireValidator<Integer> kondisiPerusahaan;   // kolom 13
    private QuestionnaireValidator<Boolean> tanamanPangan;       // kolom 14
    private QuestionnaireValidator<Boolean> hortikultura;        // kolom 15
    private QuestionnaireValidator<String>  perkebunan;           // kolom 16
    private QuestionnaireValidator<Boolean> peternakan;          // kolom 17
    private QuestionnaireValidator<Boolean> kehutanan;           // kolom 18
    private QuestionnaireValidator<Boolean> perikanan;           // kolom 19
    
    public boolean getConfirmed() {
        return confirmed.getAttribute().booleanValue();
    }

    public void setConfirmed(String confirmed){
        try {
            this.confirmed = new BooleanField(confirmed);
        } catch (QuestionnaireException e) {
            System.out.println("Isian Salah");
        }
    }

    public int getKondisiPerusahaan() {    
       return kondisiPerusahaan.getAttribute().intValue();
    }

    public void setKondisiPerusahaan(String kondisiPerusahaan){
       try {
           this.kondisiPerusahaan = new IntegerField(kondisiPerusahaan);
       } catch(QuestionnaireException e) {
           System.out.println("Isian Salah");
       }
    }

    public boolean getTanamanPangan() {
        return tanamanPangan.getAttribute().booleanValue();
    }

    public void setTanamanPangan(String tanamanPangan){
        try {
            this.tanamanPangan = new BooleanField(tanamanPangan);
        } catch(QuestionnaireException e) {
            System.out.println("Isian Salah");
        }
    }

    public boolean getHortikultura() {
        return hortikultura.getAttribute().booleanValue();
    }

    public void setHortikultura(String hortikultura){
        try {
            this.hortikultura = new BooleanField(hortikultura);
        } catch(QuestionnaireException e) {
            System.out.println("Isian Salah");
        }
    }

    public String getPerkebunan() {
        //return perkebunan.getAttribute().toString();
        return perkebunan.getAttribute();
    }

    public void setPerkebunan(String perkebunan){
        try {
            this.perkebunan = new StringField(perkebunan);
        } catch(QuestionnaireException e) {
            System.out.println("Isian Salah");
        }
    }

    public boolean getPeternakan() {
        return peternakan.getAttribute().booleanValue();
    }

    public void setPeternakan(String peternakan){
       try {
        this.peternakan = new BooleanField(peternakan);
       } catch(QuestionnaireException e) {System.out.println("Isian Salah");}
    }

    public boolean getKehutanan() {
        return kehutanan.getAttribute().booleanValue();
    }

    public void setKehutanan(String kehutanan){
       try{
           this.kehutanan = new BooleanField(kehutanan);
       } catch (QuestionnaireException e) {
           System.out.println("Isian Salah");
       }
    }

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

    public static String map(Integer mapped){
        return KondisiPerusahaanMap.getInstance().getValue(mapped.intValue());
    }

    public static String map(String mapped){
        return PerkebunanMap.getInstance().getValue(mapped);
    }
    
    @Override
    public String toString()
    {
        return "Informasi Kunjungan : "+ map(getConfirmed())+
                "\nKondisi Perusahaan : "+map(getKondisiPerusahaan())+
                "\nTanaman Pangan : "+map(getTanamanPangan())+
                "\nHortikultura : "+map(getHortikultura())+
                "\nPerkebunan : "+map(getPerkebunan())+
                "\nPeternakan : "+map(getPeternakan())+
                "\nKehutanan : "+map(getKehutanan())+
                "\nPerikanan : "+map(getPerikanan());
    }
}

final class KondisiPerusahaanMap {
    private static final KondisiPerusahaanMap INSTANCE = new KondisiPerusahaanMap();
    private final HashMap<Integer, String> map = new HashMap<>();

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
    }

    public static KondisiPerusahaanMap getInstance() {
        return INSTANCE;
    }

    public String getValue(int key) {
        return map.get(key);
    }
}

final class PerkebunanMap {
    private static final PerkebunanMap INSTANCE = new PerkebunanMap();
    private final HashMap<String, String> map = new HashMap<>();

    private PerkebunanMap() {
        map.put("3a","Kakao/Cokelat");
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
        map.put("0", "Tidak Ada");
    }

    public static PerkebunanMap getInstance() {
        return INSTANCE;
    }

    public String getValue(String key) {
        return map.get(key);
    }
}


