
package projek;

public class Result {
    
    private boolean konfirmasi=false;
    private int kondisiPerusahaan=0; 
    private boolean tanamanPangan=false;
    private boolean hortikultura=false;
    private boolean perkebunan=false;
    private boolean peternakan=false;
    private boolean kehutanan=false;
    private boolean perikanan=false;

    public void setKonfirmasi(boolean konfirmasi) {
        this.konfirmasi = konfirmasi;
    }

    public void setKondisiPerusahaan(int kondisiPerusahaan) {
        this.kondisiPerusahaan = kondisiPerusahaan;
    }

    public void setTanamanPangan(boolean tanamanPangan) {
        this.tanamanPangan = tanamanPangan;
    }

    public void setHortikultura(boolean hortikultura) {
        this.hortikultura = hortikultura;
    }

    public void setPerkebunan(boolean perkebunan) {
        this.perkebunan = perkebunan;
    }

    public void setPeternakan(boolean peternakan) {
        this.peternakan = peternakan;
    }

    public void setKehutanan(boolean kehutanan) {
        this.kehutanan = kehutanan;
    }

    public void setPerikanan(boolean perikanan) {
        this.perikanan = perikanan;
    }

    public boolean isKonfirmasi() {
        return konfirmasi;
    }

    public int getKondisiPerusahaan() {
        return kondisiPerusahaan;
    }

    public boolean isTanamanPangan() {
        return tanamanPangan;
    }

    public boolean isHortikultura() {
        return hortikultura;
    }

    public boolean isPerkebunan() {
        return perkebunan;
    }

    public boolean isPeternakan() {
        return peternakan;
    }

    public boolean isKehutanan() {
        return kehutanan;
    }

    public boolean isPerikanan() {
        return perikanan;
    }
    
}
