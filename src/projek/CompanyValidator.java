package projek;

public interface CompanyValidator {
    String getAttribute();
    String isValid(String attribute) throws CompanyException;
}

class CompanyName implements CompanyValidator{
    String attribute;

    public CompanyName(String attribute) throws CompanyException {
        this.attribute = isValid(attribute);
    }

    @Override
    public String getAttribute() {
        return attribute;
    }

    @Override
    public String isValid(String attribute) throws CompanyException {
        if(attribute.length() < 3 || attribute.length() > 30 || !attribute.matches("[^a-z|^A-Z|^&|^]")){
            throw new CompanyException("Attribute tidak sesuai");
        }
        return attribute;
    }
}
    
class CompanyAddress implements CompanyValidator{
    String attribute;
        
    public CompanyAddress(String attribute) throws CompanyException {
    this.attribute = isValid(attribute);
    }

    @Override
    public String getAttribute() {
        return attribute;
    }

   @Override
    public String isValid(String attribute) throws CompanyException {
        if(attribute.length() <20  || attribute.length() > 250 || !attribute.matches("[^a-z|^A-Z|^]")){
            throw new CompanyException("Attribute tidak sesuai");
        }
        return attribute;
    }
        
} 
    
class CompanyBentukBadanHukum implements CompanyValidator{
    String attribute;
      
    public CompanyBentukBadanHukum(String attribute) throws CompanyException {
    this.attribute = isValid(attribute);
    }
    
    @Override
    public String getAttribute() {
        return attribute;
    }   

    @Override
    public String isValid(String attribute) throws CompanyException {
        if(attribute.length() < 1 || attribute.length() > 2 || !attribute.matches("[0-9]*")){
            throw new CompanyException("Attribute tidak sesuai");
        }
        return attribute;
    }
        
}


