package projek;

/**
 *  Merupakan sebuah interface yang melakukan validasi terhadap keseluruhan variabel pertanyaan di dalam kelas QuestionnaireData, yaitu:
 * 1. confirmed, 
 * 2. kondisiPerusahaan, 
 * 3. tanamanPangan, 
 * 4. hortikultura, 
 * 5. perkebunan, 
 * 6. peternakan, 
 * 7. kehutanan, dan
 * 8. perikanan.
 * 
 * @param <R> tipe data nilai yang akan divalidasi sesuai yang diminta
 */
public interface QuestionnaireValidator<R> {

    /**
     * Meurpakan sebuah method untuk mendapatkan nilai atribut yang ingin divalidasi.
     * @return nilai atribut
     */
    R getAttribute();

    /**
     * Merupakan sebuah method untuk memvalidasi nilai variabel yang dimasukkan.
     * @param attributes nilai variabel yang ingin divalidasi 
     * @return nilai yang telah divalidasi
     * @throws QuestionnaireException jika nilai variabel tidak valid
     */
    R isValid(String attributes) throws QuestionnaireException;
}


/**
 * Merupakan kelas implementasi dari interface QuestionnaireValidator untuk tipe data Boolean.
 * Implementasi ini akan memvalidasi nilai yang diinput harus berupa "0" atau "1".
 */
class BooleanField implements QuestionnaireValidator<Boolean> {
    private Boolean attribute;

    /**
     * Merupakan sebuah constructor untuk menginisiasi nilai boolean yang akan divalidasi.
     * @param attribute nilai inputan yang akan divalidasi
     * @throws QuestionnaireException  jika nilai inputan tidak valid
     */
    public BooleanField(String attribute) throws QuestionnaireException{
        this.attribute = isValid(attribute);
   }

    @Override
    public Boolean getAttribute() {
        return attribute;
    }

    /**
     * Merupakan sebuah method untuk memvalidasi nilai boolean dari variabel yang diinput.
     * @param attributes nilai inputan berupa boolean
     * @return nilai yang telah divalidasi, 'true' jika bernilai '1' dan false jika bernilai '0'
     * @throws QuestionnaireException jika nilai inputan tidak valid
     */
    public Boolean isValid(String attributes) throws QuestionnaireException {
        
        if (attributes.equalsIgnoreCase("1"))
           return true;
         else if (attributes.equalsIgnoreCase("0"))
            return false;
        else 
            throw new QuestionnaireException("Inputan Anda salah");
              
    }

}


//Integer Field
/**
 * Merupakan kelas implementasi dari interface QuestionnaireValidator untuk data bertipe integer.
 * Implementasi ini akan memvalidasi nilai yang diinput harus bertipe integer.
 * @author Kelompok DPP 6
 */
class IntegerField implements QuestionnaireValidator<Integer> {
    private Integer attribute;
    
    /**
     * Merupakan sebuah constructor untuk menginisiasi nilai integer yang akan divalidasi.
     * @param attribute nilai inputan yang akan divalidasi
     * @throws QuestionnaireException  jika nilai inputan tidak valid
     */
    public IntegerField(String attribute) throws QuestionnaireException{
        this.attribute = isValid(attribute);
    }

    @Override
    public Integer getAttribute() {
        return attribute;  
    }
    
    /**
     * Merupakan sebuah method untuk memvalidasi nilai integer dari variabel yang diinput.
     * @param attributes nilai inputan berupa integer
     * @return nilai yang telah divalidasi
     * @throws QuestionnaireException jika nilai inputan tidak valid
     */
    public Integer isValid(String attributes) throws QuestionnaireException {
       if (!(attributes.matches("\\d") || attributes.matches("[123456789]")))
       {
            throw new QuestionnaireException("Inputan Anda salah");
       }
         else {
           return Integer.parseInt(attributes);
       }
    }
}

/**
 * Merupakan kelas implementasi dari interface QuestionnaireValidator untuk data bertipe String.
 * Implementasi ini akan memvalidasi nilai yang diinput harus bertipe String.
 * @author Kelompok DPP6
 */
class StringField implements QuestionnaireValidator<String> {
    private String attribute;

    /**
     * Merupakan sebuah constructor untuk menginisiasi nilai String yang akan divalidasi.
     * @param attribute nilai inputan yang akan divalidasi
     * @throws QuestionnaireException  jika nilai inputan tidak valid
     */
    public StringField(String attribute) throws QuestionnaireException{
       this.attribute = isValid(attribute);         
   }

    @Override
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * Merupakan sebuah method untuk memvalidasi nilai String dari variabel yang diinput telah sesuai dengan yang ditentukan.
     * @param attributes nilai inputan berupa String
     * @return nilai String yang telah divalidasi
     * @throws QuestionnaireException jika nilai inputan tidak valid
     */
    public String isValid(String attributes) throws QuestionnaireException {
        if (!(attributes.matches("3a|3b|3c|3d|3e|3f|3g|3h|3i|3j|3k|0")))
            throw new QuestionnaireException("Input anda Salah");
        else return attributes;
    }
}