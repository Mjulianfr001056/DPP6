package projek;

import java.util.Scanner;

public class Main {
    static void tampilMenu() {
       boolean quit = false;
       do {
        System.out.println("Silakan Pilih Menu yang Tersedia!");
        System.out.println("Pilihan Menu yang Tersedia:");
        System.out.println("1. Entri Data"); 
        System.out.println("2. Lihat Data");
        System.out.println("-------------");
        
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih Menu Kuesioner: ");
        String menu = in.nextLine();
        
        switch(menu) {
            //Menu Nomor 1 (Entri Data) -> KIP, Perusahaan, Hasil
            case "1" -> {
               System.out.println("\nSilakan Pilih Data yang Ingin Diinput: ");
               System.out.println("1. Keterangan Kuesioner");           //bagian atas kues
               System.out.println("2. Kode Identitas Perusahaan (KIP)");//kolom 1-6
               System.out.println("3. Informasi Perusahaan");           //kolom 7-11
               System.out.println("4. Keterangan Pencacahan");          //kolom 12-13
               System.out.println("5. Keterangan Subsektor\n");  
               
               Scanner in1 = new Scanner(System.in);
               System.out.println("Pilih Menu Entri Data: ");
               String entridata = in.nextLine();  
               
               switch(entridata){
                   case "1" -> {
                       
                   }
                   case "2" -> {
                       
                   }
                   case "3" -> {
                       
                   }
                   case "4" -> {
                       
                   }
                   case "5" -> {
                       
                   }
               }  
            }
            
            //Menu Nomor 2 (Lihat Data)
            case "2" -> {
                System.out.println("Data");
            }
            
       //program berhenti
       default -> {
       System.out.println("Inputan Tidak Terdaftar, Program Dihentikan!");
       quit = true;
       }
       }
       }
        while(!quit);
       }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("== Program Entri Data Kuesioner DPP ==");
        System.out.println("======================================\n");
        System.out.println("Selamat Datang di Program Entri Data Kuesioner DPP (Direktori Perusahaan Pertanian)!\n");
        System.out.println("Responden diharapkan dapat mengisi kuesioner ini dengan jujur dan benar.");
        System.out.println("Selamat mengisi kuesioner!\n");
        tampilMenu();        
    }
}