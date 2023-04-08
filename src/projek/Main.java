package projek;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static void ClearInputBuffer(Scanner scanner) {
        scanner.skip(".*\n");
    }
    private static ArrayList<CompanyData> sheets = new ArrayList<>();

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

    private static void tampilHeader(){
        if (headerFlag){
            System.out.println("Kode Provinsi: " + questionnaireHeader.kodeProvinsi());
            System.out.println("Kode Kabupaten: " + questionnaireHeader.kodeKabupaten());
            System.out.println("Periode Kuesioner: " + questionnaireHeader.tanggal());
        }else{
            System.out.println("Kode Provinsi: [Belum disetel]");
            System.out.println("Kode Kabupaten: [Belum disetel]");
            System.out.println("Periode Kuesioner: [Belum disetel]");
        }
    }

    public static void printData(){
        if (sheets.size() == 0)
            System.out.println("Tidak ada data yang dapat ditampilkan, harap lakukan input data terlebih dahulu!\n");
        else
            sheets.stream().forEach(data-> System.out.println(data + "\n"));
    }

    public static void tampilMenu() {

        Scanner in = new Scanner(System.in);
        boolean quit = false;
        do {
            System.out.println("\n####################################################################################\n");
            tampilHeader();
            System.out.println("\n------------------------------------------------------------------------------------\n");
            System.out.println("Silakan Pilih Menu yang Tersedia!");
            System.out.println("Pilihan Menu: ");
            System.out.println("1. Entri data");
            System.out.println("2. Lihat data");
            System.out.println("3. Keluar");
            System.out.println("-------------");
        
            System.out.print("Pilihan Menu: ");
            String menu = in.next();
            ClearInputBuffer(in);

            switch(menu) {
                case "1" -> {
                    if(!headerFlag)
                    try {
                        System.out.println("\n==================Bagian Header Kuesioner==================");
                        String tmpKodeProvinsi = "";
                        String tmpKodeKabupaten = "";
                        String periodeKuesioner = "";

                        System.out.print("Kode Provinsi: ");
                        tmpKodeProvinsi = in.next();
                        ClearInputBuffer(in);

                        System.out.print("Kode Kabupaten/Kota: ");
                        tmpKodeKabupaten = in.next();
                        ClearInputBuffer(in);

                        System.out.print("Periode Kuesioner: ");
                        periodeKuesioner = in.nextLine();

                        KIPValidator kodeProvinsi = new KodeProvinsiValidator(tmpKodeProvinsi);
                        KIPValidator kodeKabupaten = new KodeKabupatenValidator(tmpKodeKabupaten);

                        questionnaireHeader = new QuestionnaireHeader(kodeProvinsi.getCode(),
                                kodeKabupaten.getCode(),
                                periodeKuesioner);
                        headerFlag = true;
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                        break;
                    }

                    KIP kip = new KIP();
                    boolean quitFlag = false;
                    do {
                        try{
                            System.out.println("\n===============Bagian Informasi Perusahaan 1================");
                            String tmpKodeProvinsi = "";
                            String tmpKodeKabupaten = "";
                            String tmpKodeKecamatan = "";
                            String tmpKodeKJU = "";
                            String tmpNoUrut = "";

                            System.out.print("Kode Provinsi: ");
                            tmpKodeProvinsi = in.next();
                            ClearInputBuffer(in);

                            System.out.print("Kode Kabupaten/Kota: ");
                            tmpKodeKabupaten = in.next();
                            ClearInputBuffer(in);

                            System.out.print("Kode Kecamatan: ");
                            tmpKodeKecamatan = in.next();
                            ClearInputBuffer(in);

                            System.out.print("Kode KJU: ");
                            tmpKodeKJU = in.next();
                            ClearInputBuffer(in);

                            System.out.print("Nomor Urut dalam Satu Kabupaten/Kota: ");
                            tmpNoUrut = in.next();
                            ClearInputBuffer(in);

                            validateNoUrut(tmpKodeProvinsi, tmpKodeKabupaten, tmpNoUrut);

                            kip = new KIP(tmpKodeProvinsi, tmpKodeKabupaten, tmpKodeKecamatan, tmpKodeKJU, tmpNoUrut);
                            quitFlag = true;
                        }catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }while(!quitFlag);

                    Company company = new Company();
                    do{
                        try{
                            String tmpNamaPerusahaan = "";
                            String tmpAlamatPerusahaan = "";
                            String tmpNomorTelepon = "";
                            String tmpNomorFaksimili = "";
                            String tmpBentukBadanHukum = "";

                            System.out.println("\n===============Bagian Informasi Perusahaan 2================");
                            System.out.print("Nama Perusahaan Pertanian: ");
                            tmpNamaPerusahaan = in.nextLine();

                            System.out.print("Alamat Perusahaan Pertanian: ");
                            tmpAlamatPerusahaan = in.nextLine();

                            System.out.print("Nomor Telepon: ");
                            tmpNomorTelepon = in.next();
                            ClearInputBuffer(in);

                            System.out.print("Nomor Faksimili: ");
                            tmpNomorFaksimili = in.next();
                            ClearInputBuffer(in);

                            System.out.print("Bentuk Badan Hukum: ");
                            tmpBentukBadanHukum = in.nextLine();

                            company.setNama(tmpNamaPerusahaan);
                            company.setAlamat(tmpAlamatPerusahaan);
                            company.setNomorTelefon(tmpNomorTelepon);
                            company.setNomorFax(tmpNomorFaksimili);
                            company.setBentukBadanHukum(tmpBentukBadanHukum);
                            quitFlag = true;
                        }catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }while(!quitFlag);

                    QuestionnaireData questionnaireData = new QuestionnaireData();
                    CompanyResponse companyResponse = new CompanyResponse(questionnaireData);
                    quitFlag = false;
                    do {
                        try{
                            System.out.println("\n================Bagian Respons Perusahaan================");
                            System.out.println("1. Sudah dikunjungi/mendapatkan informasi dari pihak lain (dinas, dll)\n"
                                    + "0. Belum dikonfirmasi keberadaannya");
                            System.out.print("Pilih Keterangan Terkait Perusahaan: ");
                            String tmpConfirmed = in.next();

                            if(tmpConfirmed.equalsIgnoreCase("0")){
                                break;
                            }
                            if(!tmpConfirmed.equalsIgnoreCase("1")){
                                throw new QuestionnaireException("Input terdiri dari 0 atau 1 saja!");
                            }

                            String tmpKondisiPerusahaan = "";
                            String tmpTanamanPangan = "";
                            String tmpHortikultura = "";
                            String tmpPerkebunan = "";
                            String tmpPeternakan = "";
                            String tmpKehutanan = "";
                            String tmpPerikanan = "";
                            String tmpJenisUsahaUtama = "";

                            System.out.println("\nStatus perusahaan: ");
                            System.out.println("1. Aktif\n"
                                    + "2. Tutup Sementara/Tidak Ada Kegiatan\n"
                                    + "3. Belum Berproduksi\n"
                                    + "4. Tidak Bersedia Diwawancarai\n"
                                    + "5. Alih Usaha ke Non Pertanian\n"
                                    + "6. Tutup\n"
                                    + "7. Tidak Ditemukan\n"
                                    + "8. Baru\n"
                                    + "9. Ganda");
                            System.out.print("Pilih Keterangan Terkait Perusahaan: ");
                            tmpKondisiPerusahaan = in.next();

                            System.out.println("\nPerusahaan dalam subsektor tanaman pangan? ");
                            System.out.println("0. Tidak\n"
                                    + "1. Ya");
                            System.out.print("Jawab: ");
                            tmpTanamanPangan = in.next();

                            System.out.println("\nPerusahaan dalam subsektor holtikultura? ");
                            System.out.println("0. Tidak\n"
                                    + "1. Ya");
                            System.out.print("Jawab: ");
                            tmpHortikultura = in.next();

                            System.out.println("\nPerusahaan dalam subsektor perkebunan? ");
                            System.out.println("0. Tidak\n"
                                    + "\nJika ya, spesialisasi subsektor adalah?\n"
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
                            System.out.print("Jawab: ");
                            tmpPerkebunan = in.next();

                            System.out.println("\nPerusahaan dalam subsektor peternakan? ");
                            System.out.println("0. Tidak\n"
                                    + "\nJika ya, spesialisasi subsektor adalah?\n"
                                    + "1. Ternak Sapi Perah\n"
                                    + "2. Ternak Besar/Kecil\n"
                                    + "3. Unggas");
                            System.out.print("Jawab: ");
                            tmpPeternakan = in.next();

                            System.out.println("\nPerusahaan dalam subsektor kehutanan? ");
                            System.out.println("0. Tidak\n"
                                    + "\nJika ya, spesialisasi subsektor adalah?\n"
                                    + "1. HPH/IUPHHK-HA\n"
                                    + "2. HPHT/IUPHHK-HT/Perhutani/Kehutanan lainnya\n"
                                    + "3. Penangkaran STL");
                            System.out.print("Jawab: ");
                            tmpKehutanan = in.next();

                            System.out.println("\nPerusahaan dalam subsektor perikanan? ");
                            System.out.println("0. Tidak Ada\n"
                                    + "\nJika ya, spesialisasi subsektor adalah?\n"
                                    + "1. Budidaya Udang\n"
                                    + "2. Budidaya Bandeng\n"
                                    + "3. Budidaya Ikan Lainnya di Tambak\n"
                                    + "4. Budidaya Ikan di Laut\n"
                                    + "5. Budidaya Ikan di Air Tawar\n"
                                    + "6. Budidaya Pembenihan\n"
                                    + "7. Penangkapan Ikan");
                            System.out.print("Jawab: ");
                            tmpPerikanan = in.next();

                            System.out.println("\nJenis Usaha Utama: ");
                            System.out.println("1. Tanaman Pangan\n"
                                    + "2. Holtikultura\n"
                                    + "3. Perkebunan\n"
                                    + "4. Kehutanan\n"
                                    + "5. Perikanan\n"
                                    + "6. Peternakan");
                            System.out.print("Pilih keterangan jenis usaha utama perusahaan: ");
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
                            System.out.println("Terjadi kesalahan input!");
                            System.out.println(e.getMessage());
                        }
                    }while(!quitFlag);
                    System.out.println("\nInput selesai");
                    sheets.add(new CompanyData(kip, company, companyResponse));
                }

                case "2" -> {
                    System.out.println("Menampikan data...\n");
                    printData();
                }

                case "3" -> {
                    System.out.println("Anda keluar, program diberhentikan.");
                    quit = true;
                }

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
        tampilMenu();        
    }
}