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
 * 
 * @param   kodeProvinsi    Merupakan kode provinsi yang diinput user.
 * @return  {@code String}  Jika telah tervalidasi, maka kode provinsi akan disimpan ke dalam atribut kodeProvinsi di objek dengan class KIP.
 * @throws  KIPException    Jika digit pertama kode provinsi adalah angka 4 atau jika
 *                          digit kedua kode provinsi adalah angka 0 atau jika
 *                          kode provinsi berupa huruf dan atau panjang kode provinsi bukan 2 digit.
 */
class KodeProvinsiValidator implements KIPValidator{
    private String kodeProvinsi;

    public KodeProvinsiValidator(String kodeProvinsi) throws KIPException{
        this.kodeProvinsi = isValid(kodeProvinsi);
    }

    /*
    * Validasi : 
    * Kode Provinsi diawali 1,2,3,5,6,7,8.9
    * Kode Provinsi diakhir 1-9
    * Kode Provinsi panjangnya 2
    * Kode hanya berupa angka
    */    
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
 * 
 * @param   kodeKabupaten   Merupakan kode kabupaten yang diinput user.
 * @return  {@code String}  Jika telah tervalidasi, maka kode kabupaten akan disimpan ke dalam atribut kodeKabupaten di objek dengan class KIP.
 * @throws  KIPException    Jika digit pertama kode kabupaten bukan 0 atau 4 atau jika
 *                          digit kedua kode kabupaten adalah angka 0 atau jika
 *                          kode kabupaten berupa huruf dan atau panjang kode kabupaten bukan 2 digit.
 */
class KodeKabupatenValidator implements KIPValidator{
    private String kodeKabupaten;

    public KodeKabupatenValidator(String kodeKabupaten) throws KIPException{
        this.kodeKabupaten = isValid(kodeKabupaten);
    }

    /*
    * Validasi : 
    * Kode Kab/Kota diawali 0,7
    * Kode Kab/Kota diakhiri 1-9
    * Kode Kab/Kota panjangnya 2
    * Kode Kab/Kota bukan huruf
    */
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
 * 
 * @param   kodeKecamatan   Merupakan kode kecamatan yang diinput user.
 * @return  {@code String}  Jika telah tervalidasi, maka kode kecamatan akan disimpan ke dalam atribut kodeKecamatan di objek dengan class KIP.
 * @throws  KIPException    Jika digit pertama kode kecamatan lebih besar dari 5 atau jika
 *                          digit kedua kode kecamatan adalah angka 0 atau jika
 *                          kode kecamatan berupa huruf atau jika digit ketiga kode kecamatan bukan angka 0
 *                          dan atau panjang kode kecamatan bukan 3 digit.
 */
class KodeKecamatanValidator implements KIPValidator{
    private String kodeKecamatan;

    public KodeKecamatanValidator(String kodeKecamatan) throws KIPException{
        this.kodeKecamatan = isValid(kodeKecamatan);
    }

    /*
    * Validasi : 
    * Jumlah kec terbanyak di 1 kab/kota +-50-an
    * Kode Kecamatan panjangnya 2
    */    
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
 * 
 * @param   kodeKJU            Merupakan kode KJU yang diinput user.
 * @return  {@code String}  Jika telah tervalidasi, maka kode KJU akan disimpan ke dalam atribut kodeKJU di objek dengan class KIP.
 * @throws  KIPException    Jika digit pertama kode KJU adalah angka 0 atau jika
 *                          digit kedua kode provinsi adalah angka 0 atau lebih dari 7 atau jika
 *                          kode KJU berupa huruf dan atau panjang kode KJU bukan 2 digit.
 */
class KodeKJUValidator implements KIPValidator{
    private String kodeKJU;

    public KodeKJUValidator(String kodeKJU) throws KIPException{
        this.kodeKJU = isValid(kodeKJU);
    }


    /*
    * Validasi : 
    * Jumlah KJU diawali 0 dan diikuti angka 1-7
    * Kode KJU panjangnya 2
    */
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
 * 
 * @param   noUrut          Merupakan no urut yang diinput user.
 * @return  {@code String}  Jika telah tervalidasi, maka no urut akan disimpan ke dalam atribut no urut di objek dengan class KIP.
 * @throws  KIPException    Jika no urut berupa huruf
 */
class NoUrutValidator implements KIPValidator{
    private String noUrut;

    public NoUrutValidator(String noUrut) throws KIPException{
        this.noUrut = isValid(noUrut);
    }

    /*
    * Validasi : 
    * No urut tidak boleh berupa huruf
    */    
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
