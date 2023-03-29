package projek;

import static java.lang.System.in;
import java.util.Scanner;

public class Main {
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
        
        switch(menu) { //Menu Nomor 1 (Entri Data) -> Informasi Kuesioner, KIP, Perusahaan, Hasil
            case "1" -> {
                    try { 
                        do {
                            System.out.println("Kode Provinsi: ");
                            in.next();
                        do {
                            System.out.println("Kode Kabupaten/Kota: ");
                            in.next();
                        do {
                            System.out.println("Periode Data: ");
                            in.nextLine();
                        do {
                            System.out.println("Nomor Urut Entri Data Perusahaan: ");
                            in.next();
                        do {
                            System.out.println("Kode Provinsi: ");
                            in.next();
                        do {
                            System.out.println("Kode Kabupaten/Kota: ");
                            in.next();
                        do {
                            System.out.println("Kode Kecamatan: ");
                            in.next();
                        do {
                            System.out.println("Kode KJU: ");
                            in.next();
                        do {
                            System.out.println("Nomor Urut dalam Satu Kabupaten/Kota: ");
                            in.nextLine();
                        do {
                            System.out.println("Nama Perusahaan Pertanian: ");
                            in.nextLine();
                        do {
                            System.out.println("Alamat Perusahaan Pertanian: ");
                            in.nextLine();
                        do {
                            System.out.println("Nomor Telepon: ");
                            in.next();
                        do {
                            System.out.println("Nomor Faksimili: ");
                            in.next();
                        do {
                            System.out.println("Bentuk Badan Hukum: ");
                            in.nextLine();
                        do {
                            System.out.println("1. Sudah dikunjungi/mendapatkan informasi dari pihak lain (dinas, dll)\n"
                                    + "2. Belum dikonfirmasi keberadaannya");
                            System.out.println("Pilih Keterangan Terkait Perusahaan: ");
                            in.next();
                        do {
                            System.out.println("1. Aktif\n"
                                    + "2. Tutup Sementara/Tidak Ada Kegiatan\n"
                                    + "3. Belum Berproduksi\n"
                                    + "4. Tidak Bersedia Diwawancarai\n"
                                    + "5. Alih Usaha ke Non Pertanian\n"
                                    + "6. Tutup\n"
                                    + "7. Tidak Ditemukan\n"
                                    + "8. Baru\n"
                                    + "9. Ganda");
                            System.out.println("Pilih Keterangan Terkait Perusahaan: ");
                            in.next();
                        do {
                            System.out.println("0. Tidak Ada\n"
                                    + "1. Ada");
                            System.out.println("Tanaman Pangan: ");
                            in.next();
                        do {
                            System.out.println("0. Tidak Ada\n"
                                    + "1. Ada");
                            System.out.println("Holtikultura: ");
                            in.next();
                        do {
                            System.out.println("0. Tidak Ada\n"
                                    + "3a. Kakao/Cokelat\n"
                                    + "3b. Karet\n"
                                    + "3c. Kelapa Sawit\n"
                                    + "3d. Kopi\n"
                                    + "3e. Teh\n"
                                    + "3f. Tebu\n"
                                    + "3g. Tembakau\n"
                                    + "3h. Cengkeh\n"
                                    + "3i. Kelapa\n"
                                    + "3j. Lada\n"
                                    + "3k. Tanaman Lainnya");
                            System.out.println("Perkebunan: ");
                            in.next();
                        do {
                            System.out.println("0. Tidak Ada\n"
                                    + "1. Ternak Sapi Perah\n"
                                    + "2. Ternak Besar/Kecil\n"
                                    + "3. Unggas");
                            System.out.println("Peternakan: ");
                            in.next();
                        do {
                            System.out.println("0. Tidak Ada\n"
                                    + "1. HPH/IUPHHK-HA\n"
                                    + "2. HPHT/IUPHHK-HT/Perhutani/Kehutanan lainnya\n"
                                    + "3. Penangkaran STL");
                            System.out.println("Kehutanan: ");
                            in.next();
                        do {
                            System.out.println("0. Tidak Ada\n"
                                    + "1. Budidaya Udang\n"
                                    + "2. Budidaya Bandeng\n"
                                    + "3. Budidaya Ikan Lainnya di Tambak\n"
                                    + "4. Budidaya Ikan di Laut\n"
                                    + "5. Budidaya Ikan di Air Tawar\n"
                                    + "6. Budidaya Pembenihan\n"
                                    + "7. Penangkapan Ikan");
                            System.out.println("Perikanan: ");
                            in.next();
                        do {
                            System.out.println("1. Tanaman Pangan\n"
                                    + "2. Holtikultura\n"
                                    + "3. Perkebunan\n"
                                    + "4. Kehutanan\n"
                                    + "5. Perikanan\n"
                                    + "6. Peternakan");
                            System.out.println("Jenis Usaha Utama: ");
                            in.next();

                        }while(true);
                        }while(true); // while nya dibawah langsung karena kalo ditaruh setelah do nya pas jadi error
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        }while(true);
                        
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

/*
TODO
1. Buat setiap data dimasukkan 1 1 trus kalo gagal diulang lgi di field itu lagi 
2. Pakai try-catch aja cukup keknya 
3. Semua input pakai String 
 */