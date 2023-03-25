package projek;

public interface KIPValidator  {
    String isValid(String kode) throws KIPException ;
    String getCode();
}

class KodeProvinsiValidator implements KIPValidator{
    private String kodeProvinsi;

    public KodeProvinsiValidator(String kode) throws KIPException{
        this.kodeProvinsi = isValid(kode);
    }

    public String getKodeProvinsi() {
        return kodeProvinsi;
    }

    /*
    * Validasi : 
    * Kode Provinsi diawali 1,2,3,5,6,7,8.9
    * Kode Provinsi diakhir 1-9
    * Kode Provinsi panjangnya 2
    * Kode hanya berupa angka
    */    
    @Override
    public String isValid(String kode) throws KIPException{
        if (!(kode.matches("[12356789][1-9]*") && kode.length() == 2))
        {
            throw new KIPException("Kode Provinsi Salah!");
        }
        return kode;
    }

    @Override
    public String getCode() {
        return kodeProvinsi;
    }
}

class KodeKabupatenValidator implements KIPValidator{
    private String kodeKabupaten;

    public KodeKabupatenValidator(String kode) throws KIPException{
        this.kodeKabupaten = isValid(kode);
    }

    public String getKodeKabupaten() {
        return kodeKabupaten;
    }
    
    /*
    * Validasi : 
    * Kode Kab/Kota diawali 0,7
    * Kode Kab/Kota diakhiri 1-9
    * Kode Provinsi panjangnya 2
    */
    @Override
    public String isValid(String kode) throws KIPException{
        if (!((kode.matches("[07][1-9]*")&& kode.length() == 2))){
            throw new KIPException("Kode Kabupaten Salah!");
        }
        return kode;
    }
    @Override
    public String getCode() {
        return kodeKabupaten;
    }

}

class KodeKecamatanValidator implements KIPValidator{
    private String kodeKecamatan;

    public KodeKecamatanValidator(String kode) throws KIPException{
        this.kodeKecamatan = isValid(kode);
    }

    public String getKodeKecamatan() {
        return kodeKecamatan;
    }

    /*
    * Validasi : 
    * Jumlah kec terbanyak di 1 kab/kota +-50-an
    * Kode Kecamatan panjangnya 2
    */    
    @Override
    public String isValid(String kode) throws KIPException{
        if (!(kode.matches("[0-5][1-9]0*")&& kode.length() == 3)){
            throw new KIPException("Kode Kecamatan Salah!");
        }
        return kode;
    }
    @Override
    public String getCode() {
        return kodeKecamatan;
    }

}

class KodeKJUValidator implements KIPValidator{
    private String kodeKJU;

    public KodeKJUValidator(String kode) throws KIPException{
        this.kodeKJU = isValid(kode);
    }

    public String getKodeKJU() {
        return kodeKJU;
    }

    /*
    * Validasi : 
    * Jumlah kec terbanyak di 1 kab/kota +-50-an
    * Kode Kecamatan panjangnya 2
    */    
    @Override
    public String isValid(String kode) throws KIPException{
        if (!(kode.matches("0[1-7]*")&& kode.length() == 2)){
            throw new KIPException("Kode KJU Salah!");
        }
        return kode;
    }
    @Override
    public String getCode() {
        return kodeKJU;
    }

}

class NoUrutValidator implements KIPValidator{
    private String noUrut;

    public NoUrutValidator(String noUrut) throws KIPException{
        this.noUrut = isValid(noUrut);
    }

    public String getNoUrut() {
        return noUrut;
    }

    /*
    * Validasi : 
    * No urut tidak boleh berupa huruf
    */    
    @Override
    public String isValid(String kode) throws KIPException{
        //TIDAK PERLU ADA VALIDASI
        return kode;
    }
    @Override
    public String getCode() {
        return noUrut;
    }

}

/*
TODO
1. Buat class yang implements si KIPValidator disini
2. Atribut yang dipakai sama
3. Constructor juga sama
4. Getter nya juga sama
5. Yang beda cuma di @Override isValid() nya, sesuaikan dengan validasi yang kemarenn
 */
