package projek;
import java.util.HashMap;

public class KeteranganKuesioner {
    private HashMap<String,String> hash = new java.util.HashMap<>();
        
    public String getKeteranganKuesioner(String pilihan)
    {
       hash.put("1","Aktif");
       hash.put("2","Tutup Sementara/Tidak Ada Kegiatan");
       hash.put("3","Belum Berproduksi");
       hash.put("4","Tidak Bersedia diwawancara");
       hash.put("5","Alih Usaha ke Non Pertanian");
       hash.put("6","Tutup");
       hash.put("7","Tidak Ditemukan");
       hash.put("8","Baru");
       hash.put("9","Ganda");
   
       hash.put("3a", "Kakao/cokelat");
       hash.put("3b", "Karet");
       hash.put("3c", "Kelapa Sawit");
       hash.put("3d", "Kopi");
       hash.put("3e", "Teh");
       hash.put("3f", "Tebu");
       hash.put("3g", "Tembakau");
       hash.put("3h", "Cengkeh");
       hash.put("3i", "Kelapa");
       hash.put("3j", "Lada");
       hash.put("3k", "Tanaman Lainnya");
       hash.put("0", "Tidak Ada");
        
       return hash.get(pilihan);
    }
     
}