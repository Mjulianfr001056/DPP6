package projek;

public interface QuestionnaireValidator<R> {
    R getAttribute();
    @Override
    public String toString();
     
}

class BooleanField implements QuestionnaireValidator<Boolean> {
    private Boolean attribute;
    private QuestionnaireData i  = new QuestionnaireData();

    public BooleanField(String attribute) throws QuestionnaireException{
        this.attribute = isValid(attribute);
   }

    @Override
    public Boolean getAttribute() {
        return attribute;
    }

    public boolean isValid(String attributes) throws QuestionnaireException {
        
        if (attributes == "1")
           return true;
         else if (attributes == "0")
            return false;
        else 
            throw new QuestionnaireException("Inputan Anda salah");
              
    }
    
    @Override
    public String toString() //method get baru khusus untuk mengembalikan keterangan kode Perkebunan
    {
        String ket = i.ketbool.get(attribute);
        return ket;
    }
   
}


//Integer Field

class IntegerField implements QuestionnaireValidator<Integer> {
    private Integer attribute;
    private QuestionnaireData i  = new QuestionnaireData(); 
    
    public IntegerField(String attribute) throws QuestionnaireException{
             this.attribute = isValid(attribute);
    }

    @Override
    public Integer getAttribute() {
        return attribute;  
    }
    
    public Integer isValid(String attributes) throws QuestionnaireException {
          
       if (!(attributes.matches("\\d") || attributes.matches("[123456789]")))
       {
            throw new QuestionnaireException("Inputan Anda salah");
       }
         else 
             return Integer.getInteger(attributes);
            
              
    }
    
    @Override
    public String toString() //method get baru khusus untuk mengembalikan keterangan kondisi perusahaan
    { 
        String ket = i.ketint.get(String.valueOf(attribute));
        return ket;
    }    

}



// String Field

class StringField implements QuestionnaireValidator<String> {
    private String attribute;
    private QuestionnaireData i = new QuestionnaireData();

    public StringField(String attribute) throws QuestionnaireException{
       this.attribute = isValid(attribute);         
   }

    @Override
    public String getAttribute() {
        return attribute;
    }
    
    

    
    public String isValid(String attributes) throws QuestionnaireException {
        
        if (!(attributes.matches("3a|3b|3c|3d|3e|3f|3g|3h|3i|3j|3k|0")))
           throw new QuestionnaireException("Input anda Salah");
        
         else return attributes;
       
    //sebelum pakai regex
//        if (!(attributes == "3a" ||
//            attributes == "3b" ||
//            attributes == "3c" ||
//            attributes == "3d" ||
//            attributes == "3e" ||
//            attributes == "3f" ||
//            attributes == "3g" ||
//            attributes == "3h" ||
//            attributes == "3i" ||
//            attributes == "3j" ||
//            attributes == "3k" ||
//            attributes == "0"))
    }  
    
    @Override
    public String toString() //method get baru khusus untuk mengembalikan keterangan kode Perkebunan
    {
        String ket = i.ketstr.get(attribute);
        return ket;
    }
}