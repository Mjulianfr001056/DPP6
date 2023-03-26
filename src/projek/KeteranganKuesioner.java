package projek;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class KeteranganKuesioner {
    
    private static final Map<Integer, String> Kondisi_Perusahaan_Map = new HashMap<>();

    static {
        Kondisi_Perusahaan_Map.put(1, "Kondisi Perusahaan Aktif");
        Kondisi_Perusahaan_Map.put(2, "Tutup Sementara/Tidak Ada Kegiatan");
        Kondisi_Perusahaan_Map.put(3, "Belum Berproduksi");
        Kondisi_Perusahaan_Map.put(4, "Tidak Bersedia diwawancara");
        Kondisi_Perusahaan_Map.put(5, "Alih Usaha ke Non Pertanian");
        Kondisi_Perusahaan_Map.put(6, "Tutup");
        Kondisi_Perusahaan_Map.put(7, "Tidak Ditemukan");
        Kondisi_Perusahaan_Map.put(8, "Baru");
        Kondisi_Perusahaan_Map.put(9, "Ganda");   
    }
    
    public String kondisiPerusahaan(int kondisiPerusahaan1) {
        String result = Kondisi_Perusahaan_Map.get(kondisiPerusahaan1);
        if (result == null) {
            System.out.println("Salah Input");
            return "";
        }
        return result;
    }
    
    
    public boolean SubsektorTanamanPangan(int pilihan1)
    {
        if (pilihan1 == 1)
            return true;
         
        return false;
    }
    
    public boolean SubsektorHortikultura(int pilihan1)
    {
        if (pilihan1 == 1)
            return true;
             
        return false;
    }
    
    private static final Map<String, String> SubsektorPerkebunan_Map = new HashMap<>();
    
    static {
        SubsektorPerkebunan_Map.put("3a", "Kakao/Cokelat");
        SubsektorPerkebunan_Map.put("3b", "Karet");
        SubsektorPerkebunan_Map.put("3c", "Kelapa Sawit");
        SubsektorPerkebunan_Map.put("3d", "Kopi");
        SubsektorPerkebunan_Map.put("3e", "Teh");
        SubsektorPerkebunan_Map.put("3e", "Teh");
        SubsektorPerkebunan_Map.put("3f", "Tebu");
        SubsektorPerkebunan_Map.put("3g", "Tembakau");
        SubsektorPerkebunan_Map.put("3h", "Cengkeh");
        SubsektorPerkebunan_Map.put("3i", "Kelapa");
        SubsektorPerkebunan_Map.put("3j", "Lada");
        SubsektorPerkebunan_Map.put("3k", "Teh");
    }
       
    public String subsektorPerkebunan(String perkebunan1) {
        String result = Kondisi_Perusahaan_Map.get(perkebunan1);
        if (result == null) {
            System.out.println("Salah Input");
            return "";
        }
        return result;
    }
    
    
    public boolean SubsektorPeternakan(int pilihan1)
    {
        if (pilihan1 == 1)
            return true;
             
        return false;
    }
    
    public boolean SubsektorKehutanan(int pilihan1)
    {
        if (pilihan1 == 1)
            return true;
             
        return false;
    }
    
    public boolean SubsektorPerikanan(int pilihan1)
    {
        if (pilihan1 == 1)
            return true;
             
        return false;
    }
    
    
    
    
}