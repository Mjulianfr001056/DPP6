package projek;
import java.util.Scanner;

public class KeteranganKuesioner {
    
       public String Kondisi_Perusahaan(int num)
      {
         
        boolean again = false;
        do {  
        switch (num) 
        {
            case 1 -> {
                return "Kondisi Perusahaan Aktif";
            }
            case 2 -> {
                return "Tutup Sementara/Tidak Ada Kegiatan";
            }
            case 3 -> {
                return "Belum Berproduksi";
            }
            case 4 -> {
                return "Tidak Bersedia diwawancara";
            }
            case 5 -> {
                return "Alih Usaha ke Non Pertanian";
            }
            case 6 -> {
                return "Tutup";
            }
            case 7 -> {
                return "Tidak Ditemukan";
            }
            case 8 -> {
                return "Baru";
            }
            case 9 -> {
                return "Ganda";
                
            }
            default -> {
                System.out.println("Salah Input");
                again = true;
            }  
         }
               
     }  while(again==true); 
      return "";  
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
    
    public String SubsektorPerkebunan(String pilihan1)
    {
       boolean again = false;
        do {
            switch (pilihan1) 
            {
            case "3a" -> {
                return "Kakao/cokelat";
            }
            case "3b" -> {
                return "Karet";
            }
            case "3c" -> {
                return "Kelapa Sawit";
            }
            case "3d" -> {
                return "Kopi";
            }
            case "3e" -> {
                return "Teh";
            }
            case "3f" -> {
                return "Tebu";
            }
            case "3g" -> {
                return "Tembakau";
            }
            case "3h" -> {
                return "Cengkeh";
            }
            case "3i" -> {
                return "Kelapa";      
            }
            case "3j" -> {
                return "Lada";              
            }
            case "3k" -> {
                return "Tanaman Lainnya";    
            }
            case "0" -> {
                break;
            }
            default -> {
                System.out.println("Salah Input");
                again = true;
            }  
         }
               
       }  while(again==true); 
      
        return "";  
            
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