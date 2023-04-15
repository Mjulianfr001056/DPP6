package projek;

/**
 * Merupakan sebuah interface untuk melakukan validasi terhadap nomor (nomor telepon & faksimile. 
 * Interface ini akan diterapkan ke dalam 2 class yaitu FaximileValidator dan TelephoneValidator
 * @author KELOMPOK 6 DPP : Natalie Merry Angelina
 */
public interface ContactValidator {
    
    /**
     * Merupakan method untuk mengambil nomor kontak (nomor telepon/nomor faksimile)
     * @return {@code String}   Berupa nomor kontak yang ingin diambil.
     */
    String getNomor();
    
    /**
     * Merupakan method untuk mengecek kevalidan inputan user
     * yang berupa nomor telepon maupun nomor faksimile
     * 
     * @param   nomor                   Berupa nomor kontak yang akan divalidasi.
     * @return  {@code String}          Jika telah tervalidasi, maka nomor kontak inputan user akan dikembalikan
     * @throws InvalidNumberException   Jika tidak memenuhi validasi dari nomor yang diinput. 
     */
    String isValid(String nomor) throws InvalidNumberException;
}

/**
 * Merupakan validator untuk mengecek apakah inputan nomor faksimile yang dimasukkan benar.
 * 
 * @param   nomor           Merupakan nomor faksimile yang diinput user.
 * @return  {@code String}  Jika telah tervalidasi, maka nomor faksimile akan disimpan ke dalam atribut nomor.
 * @throws  KIPException    Jika jumlah digit nomor faksimile kurang dari 8 atau
 *                          Jika jumlah digit lebih dari 15 atau
 *                          Jika digit pertama bukan nol.
 */
class FaximileValidator implements ContactValidator{
    String nomor;

    public FaximileValidator(String nomor) throws InvalidNumberException{
        this.nomor = isValid(nomor);
    }

    @Override
    public String getNomor() {
        return nomor;
    }

    /*
    * Validasi : 
    * Nomor Faksimile panjangnya diantara 8 sampai 15 digit
    * Nomor faksimile diawali dengan angka nol
    */   
    @Override
    public String isValid(String nomor) throws InvalidNumberException{
        if(nomor.length() >15 || nomor.length() <8 || !nomor.matches("0\\d+")){
            throw new InvalidNumberException("Nomor Fax salah");
        }else return nomor;
    }
}

/**
 * Merupakan validator untuk mengecek apakah inputan nomor telepon yang dimasukkan benar.
 * 
 * @param   nomor           Merupakan nomor telepon yang diinput user.
 * @return  {@code String}  Jika telah tervalidasi, maka nomor telepon akan disimpan ke dalam atribut nomor.
 * @throws  KIPException    Jika jumlah digit nomor telepon kurang dari 8 atau
 *                          Jika jumlah digit lebih dari 15 atau
 *                          Jika digit pertama bukan nol.
 */
class TelephoneValidator implements ContactValidator{
    String nomor;

    public TelephoneValidator(String nomor) throws InvalidNumberException{
        this.nomor = isValid(nomor);
    }

    @Override
    public String getNomor() {
        return nomor;
    }

     /*
    * Validasi : 
    * Nomor Telepon panjangnya diantara 8 sampai 15 digit
    * Nomor Telepon diawali dengan angka nol
    */ 
    @Override
    public String isValid(String nomor) throws InvalidNumberException{
        if(nomor.length() >15 || nomor.length() <8 || !nomor.matches("0\\d+")){
            throw new InvalidNumberException("Nomor Telefon salah");
        }else return nomor;
    }
}