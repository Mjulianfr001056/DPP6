/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek;

import java.util.HashMap;

/**
 *
 * @author ACER
 */
public class Company {
    private CompanyValidator nama;
    private CompanyValidator alamat;
    private CompanyValidator bentukBadanHukum;
    private NomorKontak nomorFax;
    private NomorKontak nomorTelefon;

    public Company() {
    }

    public String getNama(){
        return nama.getAttribute();
    }
    public String getAlamat(){
        return alamat.getAttribute();
    }
    public String getBentukBadanHukum(){
        return bentukBadanHukum.getAttribute();
    }

    public String getNomorFax() {
        return nomorFax.getNomorKontak();
    }
    public String getNomorTelefon() {
        return nomorTelefon.getNomorKontak();
    }

    public void setNama(String nama) throws CompanyException{
        this.nama = new CompanyName(nama);
    }

    public void setAlamat(String alamat) throws CompanyException {
        this.alamat = new CompanyAddress(alamat);
    }

    public void setBentukBadanHukum(String bentukBadanHukum) throws CompanyException {
        this.bentukBadanHukum = new CompanyBentukBadanHukum(bentukBadanHukum);
    }

    public void setNomorFax(String nomorFax) throws InvalidNumberException {
        this.nomorFax = new NomorFaksimile(nomorFax);
    }

    public void setNomorTelefon(String nomorTelefon) throws InvalidNumberException {
        this.nomorTelefon = new NomorTelepon(nomorTelefon);
    }

    public static String map(String mapped){
        return BentukBadanHukumMap.getInstance().getValue(Integer.parseInt(mapped));
    }

    @Override
    public String toString() {
        return "Nama perusahaan: \u001B[33m" + nama.getAttribute() +
                "\u001B[0m\nAlamat perusahaan: \u001B[33m" + alamat.getAttribute() +
                "\u001B[0m\nBentuk badan hukum perusahaan: \u001B[33m" + map(bentukBadanHukum.getAttribute()) +
                "\u001B[0m\nNomor faksimile: \u001B[33m" + nomorFax.getNomorKontak() +
                "\u001B[0m\nNomor telefon: \u001B[33m" + nomorTelefon.getNomorKontak() + "\u001B[0m";
    }
}

final class BentukBadanHukumMap {
    private static final BentukBadanHukumMap INSTANCE = new BentukBadanHukumMap();
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

    public static BentukBadanHukumMap getInstance() {
        return INSTANCE;
    }

    public String getValue(int key) {
        return map.get(key);
    }
}
