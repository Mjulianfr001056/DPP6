package projek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KodeProvinsiValidatorTest {
    @Test
    void ConstructorTest() {
         assertDoesNotThrow(() -> new KodeProvinsiValidator("11"));
    }

    @Test
    void GetCodeTest(){
        int[] daftarProvinsi = {11, 12, 13, 14, 15, 16, 17, 18, 19,
                21, 31, 32, 33, 34, 35, 36, 51, 52, 53, 61, 62, 63,
                64, 71, 72, 73, 74, 75, 76, 81, 82, 91, 94};
        for (int i : daftarProvinsi){
            try{
                KodeProvinsiValidator KPV = new KodeProvinsiValidator(Integer.toString(i));
                assertEquals(Integer.toString(i), KPV.getCode());
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
    }

    @Test
    void OneDigitShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeProvinsiValidator("0"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    @Test
    void MoreThanTwoDigitsShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeProvinsiValidator("0"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Test
    void AlphabeticShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeProvinsiValidator("aa"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Test
    void SpecialCharacterShouldFailTest(){
        String testString = "!@#$%^&*()_+{<>?-=[];',\\\"./? ";
        for (int i = 0; i<testString.length(); i++){
            String testChar = Character.toString(testString.charAt(i));
            try{
                assertThrows(KIPException.class, () -> new KodeProvinsiValidator(testChar + testChar));
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
    }

}