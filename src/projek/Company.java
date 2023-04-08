/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek;

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


    @Override
    public String toString() {
        return "Nama perusahaan: \u001B[33m" + nama.getAttribute() +
                "\u001B[0m\nAlamat perusahaan: \u001B[33m" + alamat.getAttribute() +
                "\u001B[0m\nBentuk badan hukum perusahaan: \u001B[33m" + bentukBadanHukum.getAttribute() +
                "\u001B[0m\nNomor faksimile: \u001B[33m" + nomorFax.getNomorKontak() +
                "\u001B[0m\nNomor telefon: \u001B[33m" + nomorTelefon.getNomorKontak() + "\u001B[0m";
    }
}
