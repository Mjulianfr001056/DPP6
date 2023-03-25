
package projek;

import java.util.Scanner;

public class QuestionnaireData {
    
    private QuestionnaireValidator<Boolean> confirmed;
   
    private KeteranganKuesioner keterangan;
    private String kondisiPerusahaan;
    private boolean tanamanPangan=false;
    private boolean hortikultura=false;
    private String perkebunan;
    private boolean peternakan=false;
    private boolean kehutanan=false;
    private boolean perikanan=false;

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
        this.kondisiPerusahaan = keterangan.Kondisi_Perusahaan(kondisiPerusahaan1);
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
        this.perkebunan = keterangan.SubsektorPerkebunan(perkebunan1);
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

