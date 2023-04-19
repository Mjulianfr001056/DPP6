package projek;


/**
 * Merupakan sebuah interface untuk melakukan validasi terhadap keseluruhan kode didalam class KIP. 
 * Interface ini akan diterapkan ke dalam 5 class baru dengan jumlah yang sama dengan jumlah atribut dari class KIP.
 * Yaitu kode provinsi, kode kabupaten, kode kecamatan, kode KJU, dan nomor urut
 * @author KELOMPOK 6 DPP (Muhammad Restu Ilahi)
 */
public interface KIPValidator  {
    /**
     * Merupakan method untuk mengecek kevalidan inputan user
     * baik itu berupa kode provinsi, kode kabupaten, kode kecamatan,
     * kode KJU, maupun nomor urut.
     * 
     * @param   kode             Berupa kode yang akan divalidasi.
     * @return  {@code String}   Jika telah tervalidasi, maka kode inputan user akan dikembalikan
     * @throws  KIPException     Jika tidak memenuhi validasi dari kode yang diinput. 
     */
    String isValid(String kode) throws KIPException ;
    
    /**
     * Merupakan method untuk mengambil nilai kode tertentu
     * baik itu berupa kode provinsi, kode kabupaten, kode kecamatan,
     * kode KJU, maupun nomor urut.
     * @return {@code String}   Berupa kode yang ingin diambil nilainya.
     */
    String getCode();
}

/**
 * Merupakan validator untuk mengecek apakah inputan kode provinsi
 * yang dimasukkan benar.
 */
class KodeProvinsiValidator implements KIPValidator{
    private String kodeProvinsi;

    public KodeProvinsiValidator(String kodeProvinsi) throws KIPException{
        this.kodeProvinsi = isValid(kodeProvinsi);
    }

    @Override
    public String isValid(String kodeProvinsi) throws KIPException{
        if (!(kodeProvinsi.matches("[12356789][1-9]*") && kodeProvinsi.length() == 2))
        {
            throw new KIPException("Kode Provinsi Salah!");
        }
        return kodeProvinsi;
    }

    @Override
    public String getCode() {
        return kodeProvinsi;
    }
}

/**
 * Merupakan validator untuk mengecek apakah inputan kode kabupaten yang dimasukkan benar.
 */
class KodeKabupatenValidator implements KIPValidator{
    private String kodeKabupaten;

    public KodeKabupatenValidator(String kodeKabupaten) throws KIPException{
        this.kodeKabupaten = isValid(kodeKabupaten);
    }

    @Override
    public String isValid(String kodeKabupaten) throws KIPException{
        if (!((kodeKabupaten.matches("[07][1-9]*")&& kodeKabupaten.length() == 2))){
            throw new KIPException("Kode Kabupaten Salah!");
        }
        return kodeKabupaten;
    }
    
    @Override
    public String getCode() {
        return kodeKabupaten;
    }

}

/**
 * Merupakan validator untuk mengecek apakah inputan kode kecamatan
 * yang dimasukkan benar
 */
class KodeKecamatanValidator implements KIPValidator{
    private String kodeKecamatan;

    public KodeKecamatanValidator(String kodeKecamatan) throws KIPException{
        this.kodeKecamatan = isValid(kodeKecamatan);
    }

    @Override
    public String isValid(String kodeKecamatan) throws KIPException{
        if (!(kodeKecamatan.matches("[0-5][1-9]0*")&& kodeKecamatan.length() == 3)){
            throw new KIPException("Kode Kecamatan Salah!");
        }
        return kodeKecamatan;
    }
    @Override
    public String getCode() {
        return kodeKecamatan;
    }

}

/**
 * Merupakan validator untuk mengecek apakah inputan kode KJU
 * yang dimasukkan benar.
 */
class KodeKJUValidator implements KIPValidator{
    private String kodeKJU;

    public KodeKJUValidator(String kodeKJU) throws KIPException{
        this.kodeKJU = isValid(kodeKJU);
    }

    @Override
    public String isValid(String kodeKJU) throws KIPException{
        if (!(kodeKJU.matches("0[1-7]*")&& kodeKJU.length() == 2)){
            throw new KIPException("Kode KJU Salah!");
        }
        return kodeKJU;
    }
    @Override
    public String getCode() {
        return kodeKJU;
    }

}

/**
 * Merupakan validator untuk mengecek apakah inputan no urut
 * yang dimasukkan benar.
 */
class NoUrutValidator implements KIPValidator{
    private String noUrut;

    public NoUrutValidator(String noUrut) throws KIPException{
        this.noUrut = isValid(noUrut);
    }

    @Override
    public String isValid(String noUrut) throws KIPException{
        if(noUrut.matches("\\d+")) return noUrut;
        else throw new KIPException("Salah");
    }
    @Override
    public String getCode() {
        return noUrut;
    }

}
