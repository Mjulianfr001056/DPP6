package projek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KodeKecamatanValidatorTest {
    @Test
    void ConstructorFirstTest(){
        assertDoesNotThrow( () -> new KodeKecamatanValidator("010"));
    }
    @Test
    void ConstructorSecondTest(){
        assertDoesNotThrow( () -> new KodeKecamatanValidator("510"));
    }

    @Test
    void GetCodeTest(){
        try{
            KodeKecamatanValidator KKV = new KodeKecamatanValidator("510");
            assertEquals("510", KKV.getCode());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    @Test
    void NotZeroUntilFiveShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeKecamatanValidator("740"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    @Test
    void NotEndedZeroShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeKecamatanValidator("511"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    @Test
    void MoreThanThreeDigitsShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeKecamatanValidator("12683"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    @Test
    void AlphabeticShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeKecamatanValidator("abh"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    @Test
    void SpecialCharacterShouldFailTest(){

        String testString = "!@#$%^&*()_+{<>?-=[];',\\\"./? ";

        try{
            for (int i = 0; i<testString.length(); i++){
                String testChar = Character.toString(testString.charAt(i));
                assertThrows(KIPException.class, () -> new KodeKecamatanValidator(testChar+testChar+testChar));
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}