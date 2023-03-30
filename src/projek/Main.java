package projek;

import static java.lang.System.in;
import java.util.Scanner;

public class Main {
    private static void ClearInputBuffer(Scanner scanner) {
        scanner.skip(".*\n");
    }
    public static void tampilMenu() {

        Scanner in = new Scanner(System.in);
        boolean quit = false;
        do {
            System.out.println("Silakan Pilih Menu yang Tersedia!");
            System.out.println("Pilihan Menu: ");
            System.out.println("1. Entri Data"); 
            System.out.println("2. Lihat Data");
            System.out.println("-------------");
        
            System.out.println("Pilihan Menu: ");
            String menu = in.nextLine();

            String tmpKodeProvinsi = "";
            String tmpKodeKabupaten = "";
            String tmpPeriodeData = "";
        switch(menu) { //Menu Nomor 1 (Entri Data) -> Informasi Kuesioner, KIP, Perusahaan, Hasil
            case "1" -> {
                try {
                    System.out.println("Kode Provinsi: ");
                    tmpKodeProvinsi = in.next();

                    System.out.println("Kode Kabupaten/Kota: ");
                    tmpKodeKabupaten = in.next();
                    ClearInputBuffer(in); //Clean Scanner

                    System.out.println("Periode Data: ");
                    tmpPeriodeData = in.nextLine();
                }catch (Exception e) {

                }

                try{
//                    System.out.println("Nomor Urut Entri Data Perusahaan: ");
//                    in.next();
//
//                    System.out.println("Kode Provinsi: ");
//                    in.next();
//
//                    System.out.println("Kode Kabupaten/Kota: ");
//                    in.next();
//
//                    System.out.println("Kode Kecamatan: ");
//                    in.next();
//
//                    System.out.println("Kode KJU: ");
//                    in.next();
//
//                    System.out.println("Nomor Urut dalam Satu Kabupaten/Kota: ");
//                    in.nextLine();
//
//                    System.out.println("Nama Perusahaan Pertanian: ");
//                    in.nextLine();
//
//                    System.out.println("Alamat Perusahaan Pertanian: ");
//                    in.nextLine();
//
//                    System.out.println("Nomor Telepon: ");
//                    in.next();
//
//                    System.out.println("Nomor Faksimili: ");
//                    in.next();
//
//                    System.out.println("Bentuk Badan Hukum: ");
//                    in.nextLine();
//
//                    System.out.println("1. Sudah dikunjungi/mendapatkan informasi dari pihak lain (dinas, dll)\n"
//                            + "2. Belum dikonfirmasi keberadaannya");
//                    System.out.println("Pilih Keterangan Terkait Perusahaan: ");
//                    in.next();
//
//                    System.out.println("1. Aktif\n"
//                            + "2. Tutup Sementara/Tidak Ada Kegiatan\n"
//                            + "3. Belum Berproduksi\n"
//                            + "4. Tidak Bersedia Diwawancarai\n"
//                            + "5. Alih Usaha ke Non Pertanian\n"
//                            + "6. Tutup\n"
//                            + "7. Tidak Ditemukan\n"
//                            + "8. Baru\n"
//                            + "9. Ganda");
//                    System.out.println("Pilih Keterangan Terkait Perusahaan: ");
//                    in.next();
//
//                    System.out.println("0. Tidak Ada\n"
//                            + "1. Ada");
//                    System.out.println("Tanaman Pangan: ");
//                    in.next();
//
//                    System.out.println("0. Tidak Ada\n"
//                            + "1. Ada");
//                    System.out.println("Holtikultura: ");
//                    in.next();
//
//                    System.out.println("0. Tidak Ada\n"
//                            + "3a. Kakao/Cokelat\n"
//                            + "3b. Karet\n"
//                            + "3c. Kelapa Sawit\n"
//                            + "3d. Kopi\n"
//                            + "3e. Teh\n"
//                            + "3f. Tebu\n"
//                            + "3g. Tembakau\n"
//                            + "3h. Cengkeh\n"
//                            + "3i. Kelapa\n"
//                            + "3j. Lada\n"
//                            + "3k. Tanaman Lainnya");
//                    System.out.println("Perkebunan: ");
//                    in.next();
//
//                    System.out.println("0. Tidak Ada\n"
//                            + "1. Ternak Sapi Perah\n"
//                            + "2. Ternak Besar/Kecil\n"
//                            + "3. Unggas");
//                    System.out.println("Peternakan: ");
//                    in.next();
//
//                    System.out.println("0. Tidak Ada\n"
//                            + "1. HPH/IUPHHK-HA\n"
//                            + "2. HPHT/IUPHHK-HT/Perhutani/Kehutanan lainnya\n"
//                            + "3. Penangkaran STL");
//                    System.out.println("Kehutanan: ");
//                    in.next();
//
//                    System.out.println("0. Tidak Ada\n"
//                            + "1. Budidaya Udang\n"
//                            + "2. Budidaya Bandeng\n"
//                            + "3. Budidaya Ikan Lainnya di Tambak\n"
//                            + "4. Budidaya Ikan di Laut\n"
//                            + "5. Budidaya Ikan di Air Tawar\n"
//                            + "6. Budidaya Pembenihan\n"
//                            + "7. Penangkapan Ikan");
//                    System.out.println("Perikanan: ");
//                    in.next();
//
//                    System.out.println("1. Tanaman Pangan\n"
//                            + "2. Holtikultura\n"
//                            + "3. Perkebunan\n"
//                            + "4. Kehutanan\n"
//                            + "5. Perikanan\n"
//                            + "6. Peternakan");
//                    System.out.println("Jenis Usaha Utama: ");
//                    in.next();

                }catch(Exception e) {
                    System.out.println("Terjadi kesalahan input!");
                }
            }
            
            case "2" -> {
            System.out.println("Tampilkan Data yang Telah Di Entri");
            }
        
       //program berhenti
            default -> {
                System.out.println("Input Tidak Terdaftar, Program Dihentikan");
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