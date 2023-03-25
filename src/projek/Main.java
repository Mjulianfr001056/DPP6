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
               System.out.println("5. Keterangan Subsektor\n");         //kolom 14-20
               
               Scanner in1 = new Scanner(System.in);
               System.out.println("Pilih Menu Entri Data: ");
               String entridata = in.nextLine();  
               
               switch(entridata){ //belum dikasih do jadi belum bisa jalan, variabel belum disesuaikan
                   case "1" -> {
                       System.out.println("Provinsi: ");
                       String provinsi = in.nextLine();
                       System.out.println("Kabupaten/Kota: ");
                       String kabkota = in.nextLine();
                       System.out.println("Periode Data: ");
                       String periodedata = in.nextLine();
                   }
                   case "2" -> {
                       System.out.println("Nomor Urut Entri Perusahaan: ");
                       String no = in.nextLine();
                       System.out.println("Kode Provinsi: ");
                       String kodeprov = in.nextLine();
                       System.out.println("Kode Kabupaten: ");
                       String kodekab = in.nextLine();
                       System.out.println("Kode Kecamatan: ");
                       String kodekec = in.nextLine();
                       System.out.println("Kode KJU: ");
                       String kodekju = in.nextLine();
                       System.out.println("Nomor Urut dalam Satu Kabupaten/Kota: ");
                       String nodlmkabkot = in.nextLine();
                   }
                   case "3" -> {
                       System.out.println("Nama Perusahaan Pertanian: ");
                       String namap = in.nextLine();
                       System.out.println("Alamat Perusahaan Pertanian: ");
                       String alamat = in.nextLine();
                       System.out.println("Nomor Telepon: ");
                       String notelp = in.nextLine();
                       System.out.println("Nomor Faksimili: ");
                       String faksimili = in.nextLine();
                       System.out.println("Bentuk Badan Hukum: ");
                       String badanhukum = in.nextLine();
                   }
                   case "4" -> {
                       System.out.println("1. Sudah dikunjungi/mendapatkan informasi dari pihak lain (dinas, dll)\n"
                               + "         2. Belum dikonfirmasi keberadaannya");
                       System.out.println("Pilih Keterangan: ");
                       String keterangan = in.nextLine();
                       System.out.println("1. Aktif"
                               + "2. Tutup Sementara/Tidak Ada Kegiatan"
                               + "3. Belum Berproduksi"
                               + "4. Tidak Bersedia Diwawancarai"
                               + "5. Alih Usaha ke Non Pertanian"
                               + "6. Tutup"
                               + "7. Tidak Ditemukan"
                               + "8. Baru"
                               + "9. Ganda");
                       System.out.println("Pilih Keterangan Tambahan: ");
                       String keterangantambahan = in.nextLine();
                   }
                   case "5" -> {
                       System.out.println("0. Tidak Ada"
                               + "1. Ada");
                       System.out.println("Tanaman Pangan: ");
                       String tanamanpangan = in.nextLine();
                       System.out.println("0. Tidak Ada"
                               + "1. Ada");
                       System.out.println("Holtikultura: ");
                       String holtikultura = in.nextLine();
                       System.out.println("0. Tidak Ada"
                               + "3a. Kakao/Cokelat"
                               + "3b. Karet"
                               + "3c. Kelapa Sawit"
                               + "3d. Kopi"
                               + "3e. Teh"
                               + "3f. Tebu"
                               + "3g. Tembakau"
                               + "3h. Cengkeh"
                               + "3i. Kelapa"
                               + "3j. Lada"
                               + "3k. Tanaman Lainnya");
                       System.out.println("Perkebunan: ");
                       String perkebunan = in.nextLine();
                       System.out.println("0. Tidak Ada"
                               + "1. Ternak Sapi Perah"
                               + "2. Ternak Besar/Kecil"
                               + "3. Unggas");
                       System.out.println("Peternakan: ");
                       String peternakan = in.nextLine();
                       System.out.println("0. Tidak Ada"
                               + "1. HPH/IUPHHK-HA"
                               + "2. HPHT/IUPHHK-HT/Perhutani/Kehutanan lainnya"
                               + "3. Penangkaran STL");
                       System.out.println("Kehutanan: ");
                       String kehutanan = in.nextLine();
                       System.out.println("0. Tidak Ada"
                               + "1. Budidaya Udang"
                               + "2. Budidaya Bandeng"
                               + "3. Budidaya Ikan Lainnya di Tambak"
                               + "4. Budidaya Ikan di Laut"
                               + "5. Budidaya Ikan di Air Tawar"
                               + "6. Budidaya Pembenihan"
                               + "7. Penangkapan Ikan");
                       System.out.println("Perikanan: ");
                       String perikanan = in.nextLine();
                       System.out.println("1. Tanaman Pangan"
                               + "2. Holtikultura"
                               + "3. Perkebunan"
                               + "4. Kehutanan"
                               + "5. Perikanan"
                               + "6. Peternakan");
                       System.out.println("Jenis Usaha Utama: ");
                       String jenisusahautama = in.nextLine();
                   }
               }  
            }
            
            //Menu Nomor 2 (Lihat Data)
            case "2" -> {
                System.out.println("Data");
                //isi pake for bisa deh keknya
            }
            
       //program berhenti
       default -> {
       System.out.println("Input Salah, Program Dihentikan!");
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
        System.out.println("\n------------------------------------------------------------------------------------\n");
        tampilMenu();        
    }
}

/*
TODO
1. Buat setiap data dimasukkan 1 1 trus kalo gagal diulang lgi di field itu lagi (belum)
2. Pakai try-catch aja cukup keknya (belum, perlu do juga)
3. Semua input pakai String (sudah)
 */