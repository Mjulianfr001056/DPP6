package projek;

public interface KIPValidator  {
    String isValid(String kode) throws KIPException ;
    String getCode();
}

class KodeProvinsiValidator implements KIPValidator{
    private String kodeProvinsi;

    public KodeProvinsiValidator(String kodeProvinsi) throws KIPException{
        this.kodeProvinsi = isValid(kodeProvinsi);
    }

    public String getKodeProvinsi() {
        return kodeProvinsi;
    }

    @Override
    public String isValid(String kode) throws KIPException{
        if (!kodeProvinsi.equals("1")){
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

    public KodeKabupatenValidator(String kodeKabupaten) throws KIPException{
        this.kodeKabupaten = isValid(kodeKabupaten);
    }

    public String getKodeKabupaten() {
        return kodeKabupaten;
    }

    @Override
    public String isValid(String kode) throws KIPException{
        if (!kodeKabupaten.equals("1")){
            throw new KIPException("Kode Provinsi Salah!");
        }
        return kode;
    }
    @Override
    public String getCode() {
        return kodeKabupaten;
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
