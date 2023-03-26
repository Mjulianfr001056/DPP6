
package projek;

import java.util.HashMap;

public class QuestionnaireData {
    
//    private KeteranganKuesioner keterangan;
    private QuestionnaireValidator<Boolean> confirmed;       // kolom 12
    private KeteranganKuesioner kondisiPerusahaan;                        // kolom 13
    private QuestionnaireValidator<Boolean> tanamanPangan;   // kolom 14
    private QuestionnaireValidator<Boolean> hortikultura;    // kolom 15
    private KeteranganKuesioner perkebunan;                               // kolom 16
    private QuestionnaireValidator<Boolean> peternakan;      // kolom 17
    private QuestionnaireValidator<Boolean> kehutanan;       // kolom 18
    private QuestionnaireValidator<Boolean> perikanan;       // kolom 19
    private Boolean status;
    
    public QuestionnaireValidator<Boolean> getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) throws QuestionnaireException{
        this.confirmed = new BooleanField(confirmed);
    }

    public String getKondisiPerusahaan(String kondisiPerusahaan1) {    
       return kondisiPerusahaan.getKeteranganKuesioner(kondisiPerusahaan1);
    }

//    public void setKondisiPerusahaan(String kondisiPerusahaan1) {
//        this.kondisiPerusahaan.getKeteranganKuesioner(kondisiPerusahaan1) ;
//    }

    public QuestionnaireValidator<Boolean> getTanamanPangan() {
        return tanamanPangan;
    }

    public void setTanamanPangan(String tanamanPangan1) throws QuestionnaireException {
        this.tanamanPangan = new BooleanField(tanamanPangan1);
    }

    public QuestionnaireValidator<Boolean> getHortikultura() {
        return hortikultura;
    }

    public void setHortikultura(String hortikultura1) throws QuestionnaireException {
          this.hortikultura = new BooleanField(hortikultura1);
    }

    public String getPerkebunan(String perkebunan1) {
        return perkebunan.getKeteranganKuesioner(perkebunan1);
    }

//    public void setPerkebunan(String perkebunan1) {
//        this.perkebunan = new BooleanField(perkebunan1);
//    }

    public QuestionnaireValidator<Boolean> getPeternakan() {
        return peternakan;
    }

    public void setPeternakan(String peternakan1) throws QuestionnaireException {
        this.peternakan = new BooleanField(peternakan1);
    }

    public QuestionnaireValidator<Boolean> getKehutanan() {
        return kehutanan;
    }

    public void setKehutanan(String kehutanan1) throws QuestionnaireException {
        this.kehutanan = new BooleanField(kehutanan1);
    }

    public QuestionnaireValidator<Boolean> getPerikanan() {
        return perikanan;
    }

    public void setPerikanan(String perikanan1) throws QuestionnaireException {
        this.perikanan = new BooleanField(perikanan1);
    }

}

/*
TODO sesuaikan lagi get dan set nya
 */

