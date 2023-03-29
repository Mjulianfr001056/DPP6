package projek;
import projek.CompanyException;

public interface CompanyValidator {
    String getAttribute();
    String isValid(String attribute) throws CompanyException;
}

class CompanyName implements CompanyValidator{
    String attribute;

    public CompanyName(String attribute) {
        try{
            this.attribute = isValid(attribute);
        }catch (CompanyException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getAttribute() {
        return attribute;
    }

    @Override
    public String isValid(String attribute) throws CompanyException {
        if(attribute.length() < 3 || attribute.length() > 30 || !attribute.matches("[&a-zA-Z]+")){
            throw new CompanyException("Nama Perusahaan tidak sesuai");
        }
        return attribute;
    }
}
    
class CompanyAddress implements CompanyValidator{
    String attribute;
        
    public CompanyAddress(String attribute){
        try{
            this.attribute = isValid(attribute);
        }catch (CompanyException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getAttribute() {
        return attribute;
    }

   @Override
    public String isValid(String attribute) throws CompanyException {
        if(attribute.length() <20  || attribute.length() > 250 || !attribute.matches("[a-zA-Z]")){
            throw new CompanyException("Alamat Perusahaan tidak sesuai");
        }
        return attribute;
    }
        
} 
    
class CompanyBentukBadanHukum implements CompanyValidator{
    String attribute;
      
    public CompanyBentukBadanHukum(String attribute){
        try{
            this.attribute = isValid(attribute);
        }catch (CompanyException e){
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public String getAttribute() {
        return attribute;
    }   

    @Override
    public String isValid(String attribute) throws CompanyException {
        if(!attribute.matches("[0-9][0-9]")){
            throw new CompanyException("Bentuk Badan Hukum tidak sesuai!");
        }
        return attribute;
    }
        
}


