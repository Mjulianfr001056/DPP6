
package projek;

public class QuestionnaireData {
    
    private QuestionnaireValidator<Boolean> confirmed;
    private int kondisiPerusahaan=0;
    private boolean tanamanPangan=false;
    private boolean hortikultura=false;
    private boolean perkebunan=false;
    private boolean peternakan=false;
    private boolean kehutanan=false;
    private boolean perikanan=false;

    public boolean getConfirmed() {
        return confirmed.getAttribute().booleanValue();
    }

    public void setConfirmed(String confirmed) throws QuestionnaireException{
        this.confirmed = new BooleanField(confirmed);
    }

    public int getKondisiPerusahaan() {
        return kondisiPerusahaan;
    }

    public void setKondisiPerusahaan(int kondisiPerusahaan) {
        this.kondisiPerusahaan = kondisiPerusahaan;
    }

    public boolean isTanamanPangan() {
        return tanamanPangan;
    }

    public void setTanamanPangan(boolean tanamanPangan) {
        this.tanamanPangan = tanamanPangan;
    }

    public boolean isHortikultura() {
        return hortikultura;
    }

    public void setHortikultura(boolean hortikultura) {
        this.hortikultura = hortikultura;
    }

    public boolean isPerkebunan() {
        return perkebunan;
    }

    public void setPerkebunan(boolean perkebunan) {
        this.perkebunan = perkebunan;
    }

    public boolean isPeternakan() {
        return peternakan;
    }

    public void setPeternakan(boolean peternakan) {
        this.peternakan = peternakan;
    }

    public boolean isKehutanan() {
        return kehutanan;
    }

    public void setKehutanan(boolean kehutanan) {
        this.kehutanan = kehutanan;
    }

    public boolean isPerikanan() {
        return perikanan;
    }

    public void setPerikanan(boolean perikanan) {
        this.perikanan = perikanan;
    }

}

/*
TODO sesuaikan lagi get dan set nya
 */
