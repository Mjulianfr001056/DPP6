package projek;

import java.util.HashMap;

/**
 * Merupakan class yang menyimpan informasi umum perusahaan, terdiri dari :
 * Nama,
 * Alamat,
 * Bentuk Badan Hukum,
 * Nomor Faximile,
 * Nomor Telefon
 * @author KELOMPOK 6 DPP (Muhammad Restu Ilahi)
 */
public class Company {
    /**
     * Nama dari sebuah perusahaan.
     */
    private CompanyName nama;
    /**
     * Alamat dimana sebuah perusahaan berada.
     */
    private CompanyAddress alamat;
    /**
     * Kategori bentuk badan hukum perusahaan tersebut (1 s/d 10).
     */
    private CompanyBentukBadanHukum bentukBadanHukum;
    /**
     * Nomor faksimile dari sebuah perusahaan.
     */
    private NomorKontak nomorFax;
    /**
     * Nomor telefon kabel dari sebuah perusahaa.
     */
    private NomorKontak nomorTelefon;

    public Company() {
    }

    /**
     * Method untuk mendapatkan nama dari sebuah perusahaan
     * @return {@code String}   Nama dari perusahaan
     */
    public String getNama(){
        return nama.getAttribute();
    }
    
    /**
     * Method untuk mendapatkan alamat dari sebuah perusahaan
     * @return {@code String}   Alamat dari perusahaan
     */
    public String getAlamat(){
        return alamat.getAttribute();
    }
    
    /**
     * Method untuk mendapatkan bentuk badan hukum dari sebuah perusahaan
     * @return {@code String}   Bentuk badan hukum dari perusahaan
     */
    public String getBentukBadanHukum(){
        return bentukBadanHukum.getAttribute();
    }

    /**
     * Method untuk mendapatkan Nomor faksimile dari sebuah perusahaan
     * @return {@code String}   Nomor faksimile dari perusahaan
     */    
    public String getNomorFax() {
        return nomorFax.getNomorKontak();
    }
    
    /**
     * Method untuk mendapatkan Nomor telefon dari sebuah perusahaan
     * @return {@code String}   Nomor telefon dari perusahaan
     */
    public String getNomorTelefon() {
        return nomorTelefon.getNomorKontak();
    }

    /**
     * Method untuk menyunting nama dari perusahaan
     * @param nama                  Merupakan value yang akan diinput ke nama perusahaan
     * @throws CompanyException     Jika value kurang dari 3 karakter atau melebihi 30 karakter, atau mengandung karakter selain huruf dan spasi.
     */
    public void setNama(String nama) throws CompanyException{
        this.nama = new CompanyName(nama);
    }

    /**
     * Method untuk menyunting alamat dari perusahaan
     * @param alamat                Merupakan value yang akan diinput ke alamat perusahaan
     * @throws CompanyException     Jika value melebihi 250 karakter, atau mengandung karakter selain huruf, angka dan spasi.
     */
    public void setAlamat(String alamat) throws CompanyException {
        this.alamat = new CompanyAddress(alamat);
    }

    /**
     * Method untuk menyunting bentuk badan hukum dari perusahaan
     * @param bentukBadanHukum      Merupakan value yang akan diinput ke bentuk badan hukum perusahaan
     * @throws CompanyException     Jika value tidak berada dalam rentang 1 s/d 10.
     */
    public void setBentukBadanHukum(String bentukBadanHukum) throws CompanyException {
        this.bentukBadanHukum = new CompanyBentukBadanHukum(bentukBadanHukum);
    }

    /**
     * Method untuk menyunting nomor faksimile dari perusahaan
     * @param nomorFax                  Merupakan value yang akan diinput ke nomor faksimile perusahaan
     * @throws InvalidNumberException   Jika value berjumlah lebih dari 15 karakter atau kurang dari 8 karakter atau tidak diawali angka "0" dan atau
     *                                  memiliki karakter selain angka
     */
    public void setNomorFax(String nomorFax) throws InvalidNumberException {
        this.nomorFax = new NomorFaksimile(nomorFax);
    }

    /**
     * Method untuk menyunting nomor telefon dari perusahaan
     * @param nomorTelefon              Merupakan value yang akan diinput ke nomor telefon perusahaan     
     * @throws InvalidNumberException   Jika value berjumlah lebih dari 15 karakter atau kurang dari 8 karakter atau tidak diawali angka "0" dan atau
     *                                  memiliki karakter selain angka
     */
    public void setNomorTelefon(String nomorTelefon) throws InvalidNumberException {
        this.nomorTelefon = new NomorTelepon(nomorTelefon);
    }

    /**
     * Method untuk mendapatkan kategori bentuk badan hukum yang sesuai dengan value yang tersimpan
     * pada atribut bentukBadanHukum. Contoh : Jika value bentukBadanHukum = '2', maka method ini akan
     * mengembalikan String "Perusahaan Daerah (PD)"
     * @param mapped        Merupakan value dari atribut bentukBadanHukum yang dimiliki objek dengan class Company
     * @return              Kategori dari bentuk badan hukum perusahaan yang berupa String. Contoh : "Perusahaan Daerah(PD)"
     */
    public static String map(String mapped){
        return BentukBadanHukumMap.getInstance().getValue(Integer.parseInt(mapped));
    }

    /**
     * Method untuk menampilkan seluruh informasi umum dari perusahaan
     * @return  {@code String}  Merupakan informasi terkait nama perusahaan, alamat perusahaan, bentuk badna hukum perusahaan,
     *                          nomor faksimile perusahaan, dan nomor telefon perusahaan.
     */
    @Override
    public String toString() {
        return "Nama perusahaan: \u001B[33m" + nama.getAttribute() +
                "\u001B[0m\nAlamat perusahaan: \u001B[33m" + alamat.getAttribute() +
                "\u001B[0m\nBentuk badan hukum perusahaan: \u001B[33m" + map(bentukBadanHukum.getAttribute()) +
                "\u001B[0m\nNomor faksimile: \u001B[33m" + nomorFax.getNomorKontak() +
                "\u001B[0m\nNomor telefon: \u001B[33m" + nomorTelefon.getNomorKontak() + "\u001B[0m";
    }
}

/**
 * Merupakan sebuah kelas yang menyimpan database terkait bentuk badan hukum dari perusahaan, yaitu :
 * Tidak diketahui -> 0 ; Perusahaan Negara (PN) -> 1 ; Perusahaan Daerah (PD) -> 2 ; Persero -> 3 ;
 * Perum -> 4 ; Perseroan Terbatas (PT) -> 5 ; Naamloze Vennotschap (NV) -> 6 ; Commanditaire Venootschap (CV) -> 7 ;
 * Firma -> 8 ; Koperasi/KUD -> 9 ; dan Yayasan -> 10
 */
final class BentukBadanHukumMap {
    /**
     * Merupakan bentuk badan hukum dari perusahaan terkait dalam angka 1 s/d 10.
     */
    private static final BentukBadanHukumMap INSTANCE = new BentukBadanHukumMap();
    /**
     * Merupakan hash map yang menghubungkan antara value bentukBadanHukum(1 s/d 10) dengan kategori bentuk badan hukum dari sebuah perusahaan.
     */
    private final HashMap<Integer, String> map = new HashMap<>();

    private BentukBadanHukumMap() {
        map.put(0, "Tidak diketahui");
        map.put(1, "Perusahaan Negara (PN)");
        map.put(2, "Perusahaan Daerah (PD)");
        map.put(3, "Persero");
        map.put(4, "Perum");
        map.put(5, "Perseroan Terbatas (PT)");
        map.put(6, "Naamloze Vennotschap (NV)");
        map.put(7, "Commanditaire Venootschap (CV)");
        map.put(8, "Firma");
        map.put(9, "Koperasi/KUD");
        map.put(10, "Yayasan");
    }

    /**
     * Method untuk mendapatkan bentuk badan hukum dari perusahaan terkait berupa angka 1 s/d 10.
     * @return      Objek dengan class BentukBadanHukumMap
     */
    public static BentukBadanHukumMap getInstance() {
        return INSTANCE;
    }

    /**
     * Method untuk mendapatkan kategori bentuk badan hukum dari sebuah perusahaan dengan value bentukBadanHukum(1 s/d 10).
     * @param key       Berupa angka 1 s/d 10 yang merupakan kode yang disimpan dalam atribut bentukBadanHukum perusahaan dari class Company.
     * @return {@code String}   Berupa kategori bentuk badan hukum dari sebuah perusahaa. Contoh : Jika key=2 , maka return value adalah "Perusahaan Daerah (PD)"
     */
    public String getValue(int key) {
        return map.get(key);
    }
}
