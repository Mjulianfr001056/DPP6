
package projek;

public class Result {
    
    private boolean konfirmasi;
    private int kondisiPerusahaan; 
    private boolean tanamanPangan;
    private boolean hortikultura;
    private boolean perkebunan;
    private boolean peternakan;
    private boolean kehutanan;
    private boolean perikanan;
   
    public void setKonfirmasi(boolean konfirmasi)
    {
        this.konfirmasi = konfirmasi;
    }
    
    public boolean getKonfirmasi()
    {
        return konfirmasi;
    }

    public void setKondisiPerusahaan(int kondisiPerusahaan) {
        this.kondisiPerusahaan = kondisiPerusahaan;
    }

    public int getKondisiPerusahaan() {
        return kondisiPerusahaan;
    }
    

    public void setTanamanPangan(boolean tanamanPangan) {
        this.tanamanPangan = tanamanPangan;
    }
    
    public boolean getTanamanPangan() {
        return tanamanPangan;
        
    }

    public void setHortikultura(boolean hortikultura) {
        this.hortikultura = hortikultura;
    }
    
    public boolean getHortikultura()
    {
        return hortikultura;
    }
    
    
}
