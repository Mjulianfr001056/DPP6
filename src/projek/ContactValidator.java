package projek;

public interface ContactValidator {
    String getNomor();
    String isValid(String nomor) throws InvalidNumberException;
}

class FaximileValidator implements ContactValidator{
    String nomor;

    public FaximileValidator(String nomor) throws InvalidNumberException{
        this.nomor = isValid(nomor);
    }

    @Override
    public String getNomor() {
        return nomor;
    }

    @Override
    public String isValid(String nomor) throws InvalidNumberException{
        if(nomor.length() >15 || nomor.length() < 8 || !nomor.matches("[0-9]*")){
            throw new InvalidNumberException("Nomor Fax salah");
        }else return nomor;
    }
}

class TelephoneValidator implements ContactValidator{
    String nomor;

    public TelephoneValidator(String nomor) throws InvalidNumberException{
        this.nomor = isValid(nomor);
    }
    /*
    TODO Implement Validator
    1. Buat validator Telephone buat ngecek nomor telefon
    2. Kodenya mirip kek yang di Faximile
     */
    @Override
    public String getNomor() {
        return nomor;
    }

    @Override
    public String isValid(String nomor) throws InvalidNumberException{
        if(nomor.length() >15 || nomor.length() < 10 || !nomor.matches("[0-9]*")){
            throw new InvalidNumberException("Nomor Fax salah");
        }else return nomor;
    }
}