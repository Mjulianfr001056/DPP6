package projek;

public interface KIPValidator{
    KIPValidator isValid() throws KIPException;
}

class KodeProvinsiValidator implements KIPValidator{
    private String kodeProvinsi;

    public KodeProvinsiValidator(String kodeProvinsi) {
        this.kodeProvinsi = kodeProvinsi;
    }

    public String getKodeProvinsi() {
        return kodeProvinsi;
    }

    @Override
    public KodeProvinsiValidator isValid() throws KIPException{
        if (!kodeProvinsi.equals("1")){
            throw new KIPException("Kode Provinsi Salah!");
        }
        return this;
    }

}

class KodeKabupatenValidator implements KIPValidator{
    private String kodeKabupaten;

    public KodeKabupatenValidator(String kodeKabupaten) {
        this.kodeKabupaten = kodeKabupaten;
    }

    public String getKodeKabupaten() {
        return kodeKabupaten;
    }

    @Override
    public KodeKabupatenValidator isValid() throws KIPException{
        if (!kodeKabupaten.equals("1")){
            throw new KIPException("Kode Provinsi Salah!");
        }
        return this;
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
