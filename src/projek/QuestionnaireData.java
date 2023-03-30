
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
    
    public HashMap<Integer,String> ketint = new HashMap<>();
    public HashMap<String,String>  ketstr = new HashMap<>();
    public HashMap<Boolean,String> ketbool = new HashMap<>();
    
    public QuestionnaireData()
    {
        //Kondisi Perusahaan
        ketint.put(1, "Aktif");
        ketint.put(2, "Tutup Sementara/Tidak Ada Kegiatan");
        ketint.put(3, "Belum Berproduksi");
        ketint.put(4, "Tidak Bersedia Diwawancarai");
        ketint.put(5, "Alih Usaha ke Non Pertanian");
        ketint.put(6, "Tutup");
        ketint.put(7, "Tidak Ditemukan");
        ketint.put(8, "Baru");
        ketint.put(9, "Ganda");
        
        //Subsektor Perkebunan
        ketstr.put("3a","Kakao/Cokelat");
        ketstr.put("3b", "Karet");
        ketstr.put("3c", "Kelapa Sawit");
        ketstr.put("3d", "Kopi");
        ketstr.put("3e", "Teh");
        ketstr.put("3f", "Tebu");
        ketstr.put("3g", "Tembakau");
        ketstr.put("3h", "Cengkih");
        ketstr.put("3i", "Kelapa");
        ketstr.put("3j", "Lada");
        ketstr.put("3k", "Tanaman Lainnya");
        ketstr.put("0", "Tidak Ada");
        
        //Field Boolean
        ketbool.put(true, "Ada");
        ketbool.put(false, "Tidak Ada");
    }
    
    
    public boolean getConfirmed() {
        return confirmed.getAttribute().booleanValue();
    }

    public void setConfirmed(String confirmed) throws QuestionnaireException{
        try {
        this.confirmed = new BooleanField(confirmed);
        } catch (QuestionnaireException e) {System.out.println("Isian Salah");}
    }

    public int getKondisiPerusahaan() {    
       return kondisiPerusahaan.getAttribute().intValue();
    }

    public void setKondisiPerusahaan(String kondisiPerusahaan1) throws QuestionnaireException {
       try {
        this.kondisiPerusahaan = new IntegerField(kondisiPerusahaan1);
       } catch(QuestionnaireException e) {System.out.println("Isian Salah");}
    }

    public boolean getTanamanPangan() {
        return tanamanPangan.getAttribute().booleanValue();
    }

    public void setTanamanPangan(String tanamanPangan1) throws QuestionnaireException {
        try {
        this.tanamanPangan = new BooleanField(tanamanPangan1);
        } catch(QuestionnaireException e) {System.out.println("Isian Salah");}
    }

    public boolean getHortikultura() {
        return hortikultura.getAttribute().booleanValue();
    }

    public void setHortikultura(String hortikultura1) throws QuestionnaireException {
        try {  
        this.hortikultura = new BooleanField(hortikultura1);
        } catch(QuestionnaireException e) {System.out.println("Isian Salah");}
    }

    public String getPerkebunan() {
        return perkebunan.getAttribute().toString();
    }

    public void setPerkebunan(String perkebunan1) throws QuestionnaireException {
        try {
        this.perkebunan = new StringField(perkebunan1);
        } catch(QuestionnaireException e) {System.out.println("Isian Salah");}
    }

    public boolean getPeternakan() {
        return peternakan.getAttribute().booleanValue();
    }

    public void setPeternakan(String peternakan1) throws QuestionnaireException {
       try {
        this.peternakan = new BooleanField(peternakan1);
       } catch(QuestionnaireException e) {System.out.println("Isian Salah");}
    }

    public boolean getKehutanan() {
        return kehutanan.getAttribute().booleanValue();
    }

    public void setKehutanan(String kehutanan1) throws QuestionnaireException {
       try{
        this.kehutanan = new BooleanField(kehutanan1);
       } catch (QuestionnaireException e) {System.out.println("Isian Salah");}
    }

    public boolean getPerikanan() {
        return perikanan.getAttribute().booleanValue();
    }

    public void setPerikanan(String perikanan1) throws QuestionnaireException {
       try{
        this.perikanan = new BooleanField(perikanan1);
       } catch (QuestionnaireException e) {System.out.println("Isian Salah");}
    }

    
    @Override
    public String toString()
    {
        return "Informasi Kunjungan : "+getConfirmed()+
                "\nKondisi Perusahaan : "+getKondisiPerusahaan()+
                "\nTanaman Pangan : "+getTanamanPangan()+
                "\nHortikultura : "+getHortikultura()+
                "\nPerkebunan : "+getPerkebunan()+
                "\nPeternakan : "+getPeternakan()+
                "\nKehutanan : "+getKehutanan()+
                "\nPerikanan : "+getPerikanan();
    }
}



