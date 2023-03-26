package projek;

public interface QuestionnaireValidator<R> {
    R getAttribute();
    boolean isValid(String attributes) throws QuestionnaireException;  
}

class BooleanField implements QuestionnaireValidator<Boolean> {
    private Boolean attribute;

    public BooleanField(String attribute) throws QuestionnaireException{
        this.attribute = isValid(attribute);
    }

    @Override
    public Boolean getAttribute() {
        return attribute;
    }

    @Override
    public boolean isValid(String attributes) throws QuestionnaireException {
        // implementation
        /*
        TODO confirmation
        Buat validasi klo yang dimasukkan itu 1 atau 0
         */
       
        if (attributes == "1")
           return true;
         else if (attributes == "0")
            return false;
        else 
            throw new QuestionnaireException("Inputan Anda salah");
              
    }  
}

/*
TODO buat IntegerField class
Buat field untuk integer
 */
