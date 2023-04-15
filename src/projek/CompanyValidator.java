package projek;

/**
 * Merupakan sebuah interface untuk melakukan validasi terhadap beberapa data di dalam kelas company(perusahaan). 
 * Interface ini akan diterapkan ke dalam 3 class baru Yaitu nama perusahaan, alamat perusahaan, dan bentuk badan hukum dari perusahaan.
 * @author KELOMPOK 6 DPP (Muhammad Restu Ilahi)
 */
public interface CompanyValidator {
    /**
     * Merupakan method untuk mendapatkan atribut dari perusahaan berupa nama, alamat, atau bentuk badan hukum
     * @return  {@code String}  Berupa nama,alamat, atau bentuk badan hukum.
     */
    String getAttribute();
    
    /**
     * Merupakan method untuk mengecek kevalidan inputan user
     * baik itu berupa nama perusahaan, alamat perusahaan, dan/atau bentuk badan hukum perusahaan.
     * @param   kode             Berupa atribut yang akan divalidasi.
     * @return  {@code String}   Jika telah tervalidasi, maka atribut inputan user akan dikembalikan
     * @throws  KIPException     Jika tidak memenuhi validasi dari atribut yang diinput. 
     */
    String isValid(String attribute) throws CompanyException;
}

/**
 * Merupakan validator untuk mengecek apakah nama perusahaan
 * yang dimasukkan sudah sesuai.
 * 
 * @param   {@code String}    Merupakan nama perusahaan yang diinput user.
 * @return  {@code String}    Jika telah tervalidasi, maka nama perusahaan akan disimpan ke dalam atribut nama di objek dengan class Company.
 * @throws  CompanyException  Jika nama perusahaan kurang dari 3 karakter atau melebihi 30 karakter, atau mengandung karakter selain huruf dan spasi.
 */
class CompanyName implements CompanyValidator{
    String attribute;

    public CompanyName(String attribute) throws CompanyException {
        this.attribute = isValid(attribute);
    }


    @Override
    public String getAttribute() {
        return attribute;
    }

    /*
    * Validasi : 
    * Nama Perusahaan terdiri dari 3 s/d 30 karakter
    * Nama Perusahaan hanya berupa huruf atau spasi
    */      
    @Override
    public String isValid(String attribute) throws CompanyException {
        if(attribute.length() < 3 || attribute.length() > 30 || !attribute.matches("[\\s&|a-zA-Z]+")){
            throw new CompanyException("Nama Perusahaan tidak sesuai");
        }
        return attribute;
    }
}
    
/**
 * Merupakan validator untuk mengecek apakah alamat perusahaan
 * yang dimasukkan sudah sesuai.
 * 
 * @param   {@code String}    Merupakan alamat perusahaan yang diinput user.
 * @return  {@code String}    Jika telah tervalidasi, maka alamat perusahaan akan disimpan ke dalam atribut alamat di objek dengan class Company.
 * @throws  CompanyException  Jika alamat perusahaan melebihi 250 karakter, atau mengandung karakter selain huruf, angka dan spasi.
 */
class CompanyAddress implements CompanyValidator{
    String attribute;

    public CompanyAddress(String attribute) throws CompanyException {
        this.attribute = isValid(attribute);
    }

    @Override
    public String getAttribute() {
        return attribute;
    }

    /*
    * Validasi : 
    * Alamat Perusahaan memiliki maksimal 250 karakter
    * Alamat Perusahaan hanya memiliki karakter berupa huruf, angka, dan spasi
    */         
    @Override
    public String isValid(String attribute) throws CompanyException {
        if (attribute.length() > 250 || !attribute.matches("^[a-zA-Z0-9 ]+$")) {
            throw new CompanyException("Alamat Perusahaan tidak sesuai");
        }
        return attribute;
    }
} 
  
/**
 * Merupakan validator untuk mengecek apakah bentuk badan hukum dari perusahaan
 * yang dimasukkan sudah sesuai.
 * 
 * @param   {@code String}    Merupakan bentuk badan hukum perusahaan yang diinput user.
 * @return  {@code String}    Jika telah tervalidasi, maka bentuk badan hukum perusahaan akan disimpan ke dalam atribut bentukBadanHukum di objek dengan class Company.
 * @throws  CompanyException  Jika bentuk badan hukum tidak berada dalam rentang 1 s/d 10.
 */
class CompanyBentukBadanHukum implements CompanyValidator{
    String attribute;

    public CompanyBentukBadanHukum(String attribute) throws CompanyException {
        this.attribute = isValid(attribute);
    }

    @Override
    public String getAttribute() {
        return attribute;
    }   

     /*
    * Validasi : 
    * Bentuk Badan Hukum Perusahaan hanya berupa angka 1 s/d 10
    */     
    @Override
    public String isValid(String attribute) throws CompanyException {
        if(!attribute.matches("^[1-9]|10$")){
            throw new CompanyException("Bentuk Badan Hukum tidak sesuai!");
        }
        return attribute;
    }
        
}


