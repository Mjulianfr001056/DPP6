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
                            in.nextLine();
                        do {
                            System.out.println("Kode Kabupaten/Kota: ");
                            in.nextLine();
                        do {
                            System.out.println("Periode Data: ");
                            in.nextLine();
                        do {
                            System.out.println("Nomor Urut Entri Data Perusahaan: ");
                            in.nextLine();
                        do {
                            System.out.println("Kode Provinsi: ");
                            in.nextLine();
                        do {
                            System.out.println("Kode Kabupaten/Kota: ");
                            in.nextLine();
                        do {
                            System.out.println("Kode Kecamatan: ");
                            in.nextLine();
                        do {
                            System.out.println("Kode KJU: ");
                            in.nextLine();
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
                            System.out.println("NNomor Telepon: ");
                            in.nextLine();
                        do {
                            System.out.println("Nomor Faksimili: ");
                            in.nextLine();
                        do {
                            System.out.println("Bentuk Badan Hukum: ");
                            in.nextLine();
                        do {
                            System.out.println("1. Sudah dikunjungi/mendapatkan informasi dari pihak lain (dinas, dll)"
                                    + " 2. Belum dikonfirmasi keberadaannya");
                            System.out.println("Pilih Keterangan Terkait Perusahaan: ");
                            in.nextLine();
                        do {
                            System.out.println("1. Sudah dikunjungi/mendapatkan informasi dari pihak lain (dinas, dll)"
                                    + "2. Belum dikonfirmasi keberadaannya");
                            System.out.println("Pilih Keterangan Terkait Perusahaan: ");
                            in.nextLine();
                        do {
                            System.out.println("1. Aktif"
                                    + "2. Tutup Sementara/Tidak Ada Kegiatan"
                                    + "3. Belum Berproduksi"
                                    + "4. Tidak Bersedia Diwawancarai"
                                    + "5. Alih Usaha ke Non Pertanian"
                                    + "6. Tutup"
                                    + "7. Tidak Ditemukan"
                                    + "8. Baru"
                                    + "9. Ganda");
                            System.out.println("Pilih Keterangan Terkait Perusahaan: ");
                            in.nextLine();
                        do {
                            System.out.println("0. Tidak Ada"
                                    + "1. Ada");
                            System.out.println("Tanaman Pangan: ");
                            in.nextLine();
                        do {
                            System.out.println("0. Tidak Ada"
                                    + "1. Ada");
                            System.out.println("Holtikultura: ");
                            in.nextLine();
                        do {
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
                            in.nextLine();
                        do {
                            System.out.println("0. Tidak Ada"
                                    + "1. Ternak Sapi Perah"
                                    + "2. Ternak Besar/Kecil"
                                    + "3. Unggas");
                            System.out.println("Peternakan: ");
                            in.nextLine();
                        do {
                            System.out.println("0. Tidak Ada"
                                    + "1. HPH/IUPHHK-HA"
                                    + "2. HPHT/IUPHHK-HT/Perhutani/Kehutanan lainnya"
                                    + "3. Penangkaran STL\");
                            System.out.println("Kehutanan: ");
                            in.nextLine();
                        do {
                            System.out.println("0. Tidak Ada"
                                    + "1. Budidaya Udang"
                                    + "2. Budidaya Bandeng"
                                    + "3. Budidaya Ikan Lainnya di Tambak"
                                    + "4. Budidaya Ikan di Laut"
                                    + "5. Budidaya Ikan di Air Tawar"
                                    + "6. Budidaya Pembenihan"
                                    + "7. Penangkapan Ikan");
                            System.out.println("Perikanan: ");
                            in.nextLine();
                        do {
                            System.out.println("1. Tanaman Pangan"
                                    + "2. Holtikultura"
                                    + "3. Perkebunan"
                                    + "4. Kehutanan"
                                    + "5. Perikanan"
                                    + "6. Peternakan");
                            System.out.println("Jenis Usaha Utama: ");
                            in.nextLine();

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