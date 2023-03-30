package projek;

import static java.lang.System.in;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static void ClearInputBuffer(Scanner scanner) {
        scanner.skip(".*\n");
    }
    private static ArrayList<CompanyData> companyList = new ArrayList<>();
    public static void tampilMenu() {

        Scanner in = new Scanner(System.in);
        boolean quit = false;
        ulangAwal:
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
                KIP kip;
                try {
                    String tmpKodeProvinsi = "";
                    String tmpKodeKabupaten = "";
                    String tmpKodeKecamatan = "";
                    String tmpKodeKJU = "";
                    String tmpNoUrut = "";

                    System.out.println("Kode Provinsi: ");
                    tmpKodeProvinsi = in.next();
                    ClearInputBuffer(in);

                    System.out.println("Kode Kabupaten/Kota: ");
                    tmpKodeKabupaten = in.next();
                    ClearInputBuffer(in);

                    System.out.println("Kode Kecamatan: ");
                    tmpKodeKecamatan = in.next();
                    ClearInputBuffer(in);

                    System.out.println("Kode KJU: ");
                    tmpKodeKJU = in.next();
                    ClearInputBuffer(in);

//                    System.out.println("Nomor Urut dalam Satu Kabupaten/Kota: ");
//                    tmpNoUrut = in.next();
//                    ClearInputBuffer(in);

                    kip = new KIP(tmpKodeProvinsi, tmpKodeKabupaten, tmpKodeKecamatan, tmpKodeKJU);
                }catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue ulangAwal;
                }

                Company company = new Company();

                boolean quitFlag = false;
                do{
                    try{
                        String tmpNamaPerusahaan = "";
                        String tmpAlamatPerusahaan = "";
                        String tmpNomorTelepon = "";
                        String tmpNomorFaksimili = "";
                        String tmpBentukBadanHukum = "";

                        System.out.println("Nama Perusahaan Pertanian: ");
                        tmpNamaPerusahaan = in.nextLine();

                        System.out.println("Alamat Perusahaan Pertanian: ");
                        tmpAlamatPerusahaan = in.nextLine();

                        System.out.println("Nomor Telepon: ");
                        tmpNomorTelepon = in.next();
                        ClearInputBuffer(in);

                        System.out.println("Nomor Faksimili: ");
                        tmpNomorFaksimili = in.next();
                        ClearInputBuffer(in);

                        System.out.println("Bentuk Badan Hukum: ");
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
                        System.out.println("1. Sudah dikunjungi/mendapatkan informasi dari pihak lain (dinas, dll)\n"
                                + "2. Belum dikonfirmasi keberadaannya");
                        System.out.println("Pilih Keterangan Terkait Perusahaan: ");
                        String tmpConfirmed = in.next();

                        if(tmpConfirmed.equalsIgnoreCase("2")){
                            break;
                        }

                        String tmpKondisiPerusahaan = "";
                        String tmpTanamanPangan = "";
                        String tmpHortikultura = "";
                        String tmpPerkebunan = "";
                        String tmpPeternakan = "";
                        String tmpKehutanan = "";
                        String tmpPerikanan = "";
                        String tmpJenisUsahaUtama = "";

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
                        tmpKondisiPerusahaan = in.next();

                        System.out.println("0. Tidak Ada\n"
                                + "1. Ada");
                        System.out.println("Tanaman Pangan: ");
                        tmpTanamanPangan = in.next();

                        System.out.println("0. Tidak Ada\n"
                                + "1. Ada");
                        System.out.println("Holtikultura: ");
                        tmpHortikultura = in.next();

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
                        tmpPerkebunan = in.next();

                        System.out.println("0. Tidak Ada\n"
                                + "1. Ternak Sapi Perah\n"
                                + "2. Ternak Besar/Kecil\n"
                                + "3. Unggas");
                        System.out.println("Peternakan: ");
                        tmpPeternakan = in.next();

                        System.out.println("0. Tidak Ada\n"
                                + "1. HPH/IUPHHK-HA\n"
                                + "2. HPHT/IUPHHK-HT/Perhutani/Kehutanan lainnya\n"
                                + "3. Penangkaran STL");
                        System.out.println("Kehutanan: ");
                        tmpKehutanan = in.next();

                        System.out.println("0. Tidak Ada\n"
                                + "1. Budidaya Udang\n"
                                + "2. Budidaya Bandeng\n"
                                + "3. Budidaya Ikan Lainnya di Tambak\n"
                                + "4. Budidaya Ikan di Laut\n"
                                + "5. Budidaya Ikan di Air Tawar\n"
                                + "6. Budidaya Pembenihan\n"
                                + "7. Penangkapan Ikan");
                        System.out.println("Perikanan: ");
                        tmpPerikanan = in.next();

                        System.out.println("1. Tanaman Pangan\n"
                                + "2. Holtikultura\n"
                                + "3. Perkebunan\n"
                                + "4. Kehutanan\n"
                                + "5. Perikanan\n"
                                + "6. Peternakan");
                        System.out.println("Jenis Usaha Utama: ");
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

                companyList.add(new CompanyData(kip, company, companyResponse));
            }
            case "2" -> {
                System.out.println("Tampilkan Data yang Telah Di Entri");
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
        System.out.println("\n------------------------------------------------------------------------------------\n");
        tampilMenu();        
    }
}