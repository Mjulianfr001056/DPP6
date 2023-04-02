package projek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NomorTeleponTest {
    @Test
    void ConstructorTest(){
        assertDoesNotThrow(()-> new TelephoneValidator("051124283219"));
    }

    @Test
    void CetakNomorTest(){
        try{
            NomorTelepon nt = new NomorTelepon("081299327412");
            nt.cetakNomor();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}