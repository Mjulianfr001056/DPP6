package projek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KodeProvinsiValidatorTest {
    @Test
    void ConstructorTest() {
         assertDoesNotThrow(() -> new KodeProvinsiValidator("11"));
    }

    @Test
    void GetCodeTest() throws Exception {
        int[] daftarProvinsi = {11, 12, 13, 14, 15, 16, 17, 18, 19,
                21, 31, 32, 33, 34, 35, 36, 51, 52, 53, 61, 62, 63,
                64, 71, 72, 73, 74, 75, 76, 81, 82, 91, 94};
        for (int i : daftarProvinsi){
            KodeProvinsiValidator KPV = new KodeProvinsiValidator(Integer.toString(i));
            assertEquals(Integer.toString(i), KPV.getCode());
        }
    }

    @Test
    void KodeProvinsiOneDigitShouldFailTest() throws Exception{
        KodeProvinsiValidator KPV = new KodeProvinsiValidator("11");
        assertThrows(KIPException.class, () -> KPV.isValid("0"));
    }

    @Test
    void KodeProvinsiNotNumberShouldFailTest() throws Exception{
        KodeProvinsiValidator KPV = new KodeProvinsiValidator("11");
        assertThrows(KIPException.class, () -> KPV.isValid("a"));
    }

    @Test
    void KodeProvinsiSpecialCharacterShouldFailTest() throws Exception{
        String testString = "!@#$%^&*()_+{<>?-=[];',\\\"./? ";
        KodeProvinsiValidator KPV = new KodeProvinsiValidator("11");
        for (int i = 0; i<testString.length(); i++){
            String testChar = Character.toString(testString.charAt(i));
            assertThrows(KIPException.class, () -> KPV.isValid(testChar));
        }
    }

}