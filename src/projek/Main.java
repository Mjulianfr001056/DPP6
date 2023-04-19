package projek;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Merupakan kelas utama dari program yang berisi proses terkait bagaimana program akan dijalankan.
 * 
 * @author KELOMPOK 6 DPP : Rizky Rahmadani
 * @author KELOMPOK 6 DPP : Sabilla Hamda Syahputri
 */
public class Main {
    /**
     * Merupakan method untuk membersihkan Scanner setelah newline
     * @param scanner Scanner class yang digunakan
     */
    private static void ClearInputBuffer(Scanner scanner) {
        scanner.skip(".*\n");
    }
    private static ArrayList<CompanyData> sheets = new ArrayList<>();

    /**
     * Method untuk memvalidasi no urut perusahaan sebagai responden agar tidak ada duplikasi no urut..
     * akan menyimpan no urut perusahaan yang dicacah berdasarkan kombinasi kode Provinsi dan Kode kabupaten sebagai key.
     * @param kodeProvinsi              Kode Provinsi dimana perusahaan itu berada
     * @param kodeKabupaten             Kode Kabupaten/Kota dimana perusahaan itu berada.
     * @param noUrut                    No urut perusahaan itu dalam pencacahan di suatu kabupaten/kota.
     * @throws QuestionnaireException   Pesan yang dilemparkan saat ada kesalahan pengisian kuesioner.
     */
    private static void validateNoUrut(String kodeProvinsi, String kodeKabupaten, String noUrut)
            throws QuestionnaireException{
        if (sheets.size()>0)
            for (CompanyData companyData : sheets){
            String tmpKodeProvinsi = companyData.kip().getKodeProvinsi();
            String tmpKodeKabupaten = companyData.kip().getKodeKabupaten();
            String tmpNoUrut = companyData.kip().getNoUrutKabupatenKota();

            if (tmpKodeProvinsi.equalsIgnoreCase(kodeProvinsi) &&
            tmpKodeKabupaten.equalsIgnoreCase(kodeKabupaten) &&
            noUrut.equalsIgnoreCase(tmpNoUrut)) throw new QuestionnaireException("No urut sudah digunakan!");
        }
    }
    
    private static QuestionnaireHeader questionnaireHeader =
            new QuestionnaireHeader("00", "00", "00");
    private static boolean headerFlag = false;

    /**
     * Method untuk menampilkan header yang terdiri dari Kode Provinsi,Kode Kabupaten,dan Periode Kuesioner.
     * jika telah ada datanya maka akan ditampilkan ,jika belum maka akan terisi pesan "Belum disetel" 
     * header flag berfungsi menandai apakah no urut tertentu sudah di isi atau belum.
     */
    private static void tampilHeader(){
        if (headerFlag){
            System.out.println("Kode Provinsi      : \u001B[94m" + questionnaireHeader.kodeProvinsi());
            System.out.println("\u001B[0mKode Kabupaten     : \u001B[94m" + questionnaireHeader.kodeKabupaten());
            System.out.println("\u001B[0mPeriode Kuesioner  : \u001B[94m" + questionnaireHeader.tanggal() + "\u001B[0m");
        }else{
            System.out.println("Kode Provinsi      : \033[31m[Belum disetel]\033[0m");
            System.out.println("Kode Kabupaten     : \033[31m[Belum disetel]\033[0m");
            System.out.println("Periode Kuesioner  : \033[31m[Belum disetel]\033[0m");
        }
    }
    
    /**
     * Method untuk menampilkan semua data yang tersimpan dalam sistem program.
     * Muncul pesan jika tidak terdapat data yang tersimpan.
    */
    public static void printData(){
        if (sheets.size() == 0)
            System.out.println("\033[31mTidak ada data yang dapat ditampilkan, harap lakukan input data terlebih dahulu!\033[0m\n");
        else
            sheets.forEach(data-> System.out.println(data + "\n"));
    }

    /**
     * Method yang berisi alur pengisian data perusahaan pada kuesioner DPP.
     * Terdapat beberapa menu pilihan seperti input data,lihat data, dan keluar.
     * Pilihan akan menentukan proses apa yang akan dijalankan menggunakan switch case.
    */
    public static void tampilMenu() {

        Scanner in = new Scanner(System.in);
        boolean quit = false;
        do {
            System.out.println("\u001B[34m\n####################################################################################\n\u001B[0m");
            tampilHeader();
            System.out.println("\u001B[34m\n------------------------------------------------------------------------------------\n\u001B[0m");
            System.out.println("Silakan Pilih Menu yang Tersedia!");
            System.out.println("Menu: ");
            System.out.println("\033[33m1. Entri data");
            System.out.println("\033[33m2. Lihat data");
            System.out.println("\033[33m3. Keluar");
            System.out.print("\033[0m");
            System.out.println("-------------");
        
            System.out.print("Pilih: ");
            String menu = in.next();
            ClearInputBuffer(in);

            switch(menu) {
                case "1" -> {
                    if(!headerFlag)
                        try {
                            System.out.println("\n\033[34m==================Bagian Header Kuesioner==================\033[0m");
                            System.out.print("\033[0m");
                            String tmpKodeProvinsi;
                            String tmpKodeKabupaten;
                            String periodeKuesioner;

                            System.out.print("Kode Provinsi        : ");
                            tmpKodeProvinsi = in.next();
                            ClearInputBuffer(in);

                            System.out.print("Kode Kabupaten/Kota  : ");
                            tmpKodeKabupaten = in.next();
                            ClearInputBuffer(in);

                            System.out.print("Periode Kuesioner    : ");
                            periodeKuesioner = in.nextLine();

                            KIPValidator kodeProvinsi = new KodeProvinsiValidator(tmpKodeProvinsi);
                            KIPValidator kodeKabupaten = new KodeKabupatenValidator(tmpKodeKabupaten);

                            questionnaireHeader = new QuestionnaireHeader(kodeProvinsi.getCode(),
                                    kodeKabupaten.getCode(),
                                    periodeKuesioner);
                            headerFlag = true;
                        }catch (Exception e) {
                            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
                            break;
                        }

                    KIP kip = new KIP();
                    boolean quitFlag = false;
                    do {
                        try{
                            System.out.println("\n\033[34m===============Bagian Informasi Perusahaan 1================\033[0m");
                            System.out.print("\033[0m");
                            String tmpKodeProvinsi;
                            String tmpKodeKabupaten;
                            String tmpKodeKecamatan;
                            String tmpKodeKJU;
                            String tmpNoUrut;

                            System.out.print("Kode Provinsi                        : ");
                            tmpKodeProvinsi = in.next();
                            ClearInputBuffer(in);

                            System.out.print("Kode Kabupaten/Kota                  : ");
                            tmpKodeKabupaten = in.next();
                            ClearInputBuffer(in);

                            System.out.print("Kode Kecamatan                       : ");
                            tmpKodeKecamatan = in.next();
                            ClearInputBuffer(in);

                            System.out.print("Kode KJU                             : ");
                            tmpKodeKJU = in.next();
                            ClearInputBuffer(in);

                            System.out.print("Nomor Urut dalam Satu Kabupaten/Kota : ");
                            tmpNoUrut = in.next();
                            ClearInputBuffer(in);

                            validateNoUrut(tmpKodeProvinsi, tmpKodeKabupaten, tmpNoUrut);

                            kip = new KIP(tmpKodeProvinsi, tmpKodeKabupaten, tmpKodeKecamatan, tmpKodeKJU, tmpNoUrut);
                            quitFlag = true;
                        }catch (Exception e) {
                            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
                        }
                    }while(!quitFlag);

                    Company company = new Company();
                    do{
                        try{
                            String tmpNamaPerusahaan;
                            String tmpAlamatPerusahaan;
                            String tmpNomorTelepon;
                            String tmpNomorFaksimili;
                            String tmpBentukBadanHukum;

                            System.out.println("\n\033[34m===============Bagian Informasi Perusahaan 2================\033[0m");
                            System.out.print("\033[0m");
                            System.out.print("Nama Perusahaan Pertanian    : ");
                            tmpNamaPerusahaan = in.nextLine();

                            System.out.print("Alamat Perusahaan Pertanian  : ");
                            tmpAlamatPerusahaan = in.nextLine();

                            System.out.print("Nomor Telepon                : ");
                            tmpNomorTelepon = in.next(); 
                            ClearInputBuffer(in);

                            System.out.print("Nomor Faksimili              : ");
                            tmpNomorFaksimili = in.next();
                            ClearInputBuffer(in);

                            System.out.print("Bentuk Badan Hukum           : ");
                            tmpBentukBadanHukum = in.nextLine();

                            company.setNama(tmpNamaPerusahaan);
                            company.setAlamat(tmpAlamatPerusahaan);
                            company.setNomorTelefon(tmpNomorTelepon);
                            company.setNomorFax(tmpNomorFaksimili);
                            company.setBentukBadanHukum(tmpBentukBadanHukum);
                            quitFlag = true;
                        }catch (Exception e) {
                            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
                            quitFlag = false;
                        }
                    }while(!quitFlag);
 
                    /*
                     * Bagian yang berisi proses pengisian data perusahaan pada kolom 12 
                     * sampai kolom 20 pada kuesioner DPP. 
                     * Kolom 12 : Pengisian Status Konfirmasi Kunjungan. Jika Belum dikunjungi/bernilai 0 maka program akan berhenti.
                     * Kolom 13 : Kondisi Perusahaan terdiri dari pilihan (1-9)
                     * Kolom 14 : Tanaman Pangan (Ya=1,Tidak=0)
                     * Kolom 15 : Hortikultura (Ya=1,Tidak=0)
                     * Kolom 16 : Perkebunan (3a-3k dan 0=Tidak)
                     * Kolom 17 : Peternakan (Jika Ya pilih antara 1-3 dan 0 = Tidak)
                     * Kolom 18 : Kehutanan (Jika Ya pilih antara 1-3 dan 0 = Tidak)
                     * Kolom 19 : Perikanan (Jika Ya pilih antara 1-7 dan 0 = Tidak)
                     * Kolom 20 : Jenis Usaha Utama (Pilih antara 1-6)
                     * 
                     */
                    QuestionnaireData questionnaireData = new QuestionnaireData();
                    CompanyResponse companyResponse = new CompanyResponse(questionnaireData);
                    do {
                        try{
                            System.out.println("\n\033[34m================Bagian Respons Perusahaan================\033[0m");
                            System.out.print("\033[0m");
                            System.out.println("\u001B[33m1. Sudah dikunjungi/mendapatkan informasi dari pihak lain (dinas, dll)\n"
                                    + "0. Belum dikonfirmasi keberadaannya\u001B[0m");
                            System.out.print("Pilih Keterangan Terkait Perusahaan: ");
                            String tmpConfirmed = in.next();

                            if(tmpConfirmed.equalsIgnoreCase("0")){
                                break;
                            }
                            if(!tmpConfirmed.equalsIgnoreCase("1")){
                                throw new QuestionnaireException("Input terdiri dari 0 atau 1 saja!");
                            }

                            String tmpKondisiPerusahaan;
                            String tmpTanamanPangan;
                            String tmpHortikultura;
                            String tmpPerkebunan;
                            String tmpPeternakan;
                            String tmpKehutanan;
                            String tmpPerikanan;
                            String tmpJenisUsahaUtama;

                            System.out.println("\u001B[94m================================\u001B[0m");
                            System.out.println("\nStatus perusahaan: ");
                            System.out.println("""
                                    \u001B[33m1. Aktif
                                    2. Tutup Sementara/Tidak Ada Kegiatan
                                    3. Belum Berproduksi
                                    4. Tidak Bersedia Diwawancarai
                                    5. Alih Usaha ke Non Pertanian
                                    6. Tutup
                                    7. Tidak Ditemukan
                                    8. Baru
                                    9. Ganda\u001B[0m""");
                            System.out.print("Pilih Keterangan Terkait Perusahaan: ");
                            tmpKondisiPerusahaan = in.next();

                            System.out.println("\u001B[94m================================\u001B[0m");
                            System.out.println("\nPerusahaan dalam subsektor tanaman pangan? ");
                            System.out.println("\u001B[33m0. Tidak\n"
                                    + "1. Ya\u001B[0m");
                            System.out.print("Jawab: ");
                            tmpTanamanPangan = in.next();

                            System.out.println("\u001B[94m================================\u001B[0m");
                            System.out.println("\nPerusahaan dalam subsektor holtikultura? ");
                            System.out.println("\u001B[33m0. Tidak\n"
                                    + "1. Ya\u001B[0m");
                            System.out.print("Jawab: ");
                            tmpHortikultura = in.next();

                            System.out.println("\u001B[94m================================\u001B[0m");
                            System.out.println("\nPerusahaan dalam subsektor perkebunan? ");
                            System.out.println("""
                                    \u001B[33m0. Tidak
                                    \u001B[0m
                                    Jika ya, spesialisasi subsektor adalah?
                                    \u001B[33m3a. Kakao/Cokelat
                                    3b. Karet
                                    3c. Kelapa Sawit
                                    3d. Kopi
                                    3e. Teh
                                    3f. Tebu
                                    3g. Tembakau
                                    3h. Cengkeh
                                    3i. Kelapa
                                    3j. Lada
                                    3k. Tanaman Lainnya\u001B[0m""");
                            System.out.print("Jawab: ");
                            tmpPerkebunan = in.next();

                            System.out.println("\u001B[94m================================\u001B[0m");
                            System.out.println("\nPerusahaan dalam subsektor peternakan? ");
                            System.out.println("""
                                    \u001B[33m0. Tidak
                                    \u001B[0m
                                    Jika ya, spesialisasi subsektor adalah?
                                    \033[33m1. Ternak Sapi Perah
                                    \033[33m2. Ternak Besar/Kecil
                                    \033[33m3. Unggas""");
                            System.out.print("\033[0mJawab: ");
                            tmpPeternakan = in.next();

                            System.out.println("\u001B[94m================================\u001B[0m");
                            System.out.println("\nPerusahaan dalam subsektor kehutanan? ");
                            System.out.println("""
                                    \u001B[33m0. Tidak
                                    \u001B[0m
                                    Jika ya, spesialisasi subsektor adalah?
                                    \033[33m1. HPH/IUPHHK-HA
                                    \033[33m2. HPHT/IUPHHK-HT/Perhutani/Kehutanan lainnya
                                    \033[33m3. Penangkaran STL""");
                            System.out.print("\033[0mJawab: ");
                            tmpKehutanan = in.next();

                            System.out.println("\u001B[94m================================\u001B[0m");
                            System.out.println("\nPerusahaan dalam subsektor perikanan? ");
                            System.out.println("""
                                    \u001B[33m0. Tidak
                                    \u001B[0m
                                    Jika ya, spesialisasi subsektor adalah?
                                    \033[33m1. Budidaya Udang
                                    \033[33m2. Budidaya Bandeng
                                    \033[33m3. Budidaya Ikan Lainnya di Tambak
                                    \033[33m4. Budidaya Ikan di Laut
                                    \033[33m5. Budidaya Ikan di Air Tawar
                                    \033[33m6. Budidaya Pembenihan
                                    \033[33m7. Penangkapan Ikan""");
                            System.out.print("\033[0mJawab: ");
                            tmpPerikanan = in.next();

                            System.out.println("\u001B[94m================================\u001B[0m");
                            System.out.println("\nJenis Usaha Utama: ");
                            System.out.println("""
                                    \033[33m1. Tanaman Pangan
                                    \033[33m2. Holtikultura
                                    \033[33m3. Perkebunan
                                    \033[33m4. Kehutanan
                                    \033[33m5. Perikanan
                                    \033[33m6. Peternakan""");
                            System.out.print("\033[0mPilih keterangan jenis usaha utama perusahaan: ");
                            tmpJenisUsahaUtama = in.next();
                            ClearInputBuffer(in);

                            questionnaireData.setConfirmed(tmpConfirmed);
                            questionnaireData.setKondisiPerusahaan(tmpKondisiPerusahaan);
                            questionnaireData.setTanamanPangan(tmpTanamanPangan);
                            questionnaireData.setHortikultura(tmpHortikultura);
                            questionnaireData.setPerkebunan(tmpPerkebunan);
                            questionnaireData.setPeternakan(tmpPeternakan);
                            questionnaireData.setKehutanan(tmpKehutanan);
                            questionnaireData.setPerikanan(tmpPerikanan);

                            companyResponse = new CompanyResponse(questionnaireData);
                            companyResponse.setJenisUsahaUtama(tmpJenisUsahaUtama);
                            quitFlag = true;
                        }catch(Exception e) {
                            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
                            quitFlag = false;
                        }
                    }while(!quitFlag);
                    System.out.println("\u001B[32m\nInput selesai\u001B[0m");
                    sheets.add(new CompanyData(kip, company, companyResponse));
                }

                case "2" -> {
                    System.out.println("\u001B[32mMenampikan data...\n\u001B[0m");
                    printData();
                }

                case "3" -> {
                    System.out.println("\u001B[31mAnda keluar, program diberhentikan.\u001B[0m");
                    quit = true;
                }

                default -> {
                    System.out.println("\u001B[31mInput Tidak Terdaftar, Program Dihentikan\u001B[0m");
                    quit = true;
                }
            }
       }
       while(!quit);
    }

    public static void main(String[] args) {
        System.out.println("\033[34m=======================================");
        System.out.println("== Program Entri Data Kuesioner DPP ==");
        System.out.println("=======================================");
        System.out.println("\033[0m");
        System.out.println("Selamat Datang di Program Entri Data Kuesioner DPP (Direktori Perusahaan Pertanian)!\n");
        System.out.println("Isilah kuesioner ini dengan jujur dan benar!");
        System.out.println("Selamat mengisi kuesioner!\n");
        tampilMenu();        
    }
}