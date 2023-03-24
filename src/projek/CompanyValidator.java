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
        if(attribute.equals("0")){
            throw new CompanyException("Attribute tidak sesuai");
        }
        return attribute;
    }
}


