
package projek;

import java.util.Scanner;

public class QuestionnaireData {
    
    private QuestionnaireValidator<Boolean> confirmed;  // kolom12
   
    private KeteranganKuesioner keterangan;
    private String kondisiPerusahaan;      // kolom 13
    private boolean tanamanPangan=false;   // kolom 14
    private boolean hortikultura=false;    // kolom 15
    private String perkebunan;             // kolom 16
    private boolean peternakan=false;      // kolom 17
    private boolean kehutanan=false;       // kolom 18
    private boolean perikanan=false;       // kolom 19

    public boolean getConfirmed() {
        return confirmed.getAttribute().booleanValue();
    }

    public void setConfirmed(String confirmed) throws QuestionnaireException{
        this.confirmed = new BooleanField(confirmed);
    }

    public String getKondisiPerusahaan() {    
       return kondisiPerusahaan;
    }

    public void setKondisiPerusahaan(int kondisiPerusahaan1) {
        this.kondisiPerusahaan = keterangan.kondisiPerusahaan(kondisiPerusahaan1);
    }

    public boolean isTanamanPangan() {
        return tanamanPangan;
    }

    public void setTanamanPangan(int tanamanPangan1) {
        this.tanamanPangan = keterangan.SubsektorTanamanPangan(tanamanPangan1);
    }

    public boolean isHortikultura() {
        return hortikultura;
    }

    public void setHortikultura(int hortikultura1) {
        this.hortikultura = keterangan.SubsektorHortikultura(hortikultura1);
    }

    public String getPerkebunan() {
        return perkebunan;
    }

    public void setPerkebunan(String perkebunan1) {
        this.perkebunan = keterangan.subsektorPerkebunan(perkebunan1);
    }

    public boolean isPeternakan() {
        return peternakan;
    }

    public void setPeternakan(int peternakan1) {
        this.peternakan = keterangan.SubsektorPeternakan(peternakan1);
    }

    public boolean isKehutanan() {
        return kehutanan;
    }

    public void setKehutanan(int kehutanan1) {
        this.kehutanan = keterangan.SubsektorKehutanan(kehutanan1);
    }

    public boolean isPerikanan() {
        return perikanan;
    }

    public void setPerikanan(int perikanan1) {
        this.perikanan = keterangan.SubsektorPerikanan(perikanan1);
    }

}

/*
TODO sesuaikan lagi get dan set nya
 */

