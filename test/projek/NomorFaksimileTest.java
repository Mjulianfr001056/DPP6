package projek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NomorFaksimileTest {
    @Test
    void ConstructorTest(){
        assertDoesNotThrow(()-> new FaximileValidator("0217832901"));
    }

    @Test
    void CetakNomorTest(){
        try{
            NomorFaksimile nf = new NomorFaksimile("02173436714");
            nf.cetakNomor();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}