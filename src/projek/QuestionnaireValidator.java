package projek;

import java.lang.annotation.Inherited;

public interface QuestionnaireValidator<R> {
    R getAttribute();
    R isValid(String attributes) throws QuestionnaireException;
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

    public Boolean isValid(String attributes) throws QuestionnaireException {
        
        if (attributes == "1")
           return true;
         else if (attributes == "0")
            return false;
        else 
            throw new QuestionnaireException("Inputan Anda salah");
              
    }

}


//Integer Field

class IntegerField implements QuestionnaireValidator<Integer> {
    private Integer attribute;
    
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
         else {
           return Integer.parseInt(attributes);
       }
    }
}

class StringField implements QuestionnaireValidator<String> {
    private String attribute;

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
    }
}