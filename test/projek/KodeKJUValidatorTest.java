package projek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KodeKJUValidatorTest {
    @Test
    void ConstructorFirstTest(){
        assertDoesNotThrow( () -> new KodeKJUValidator("07"));
    }
    @Test
    void ConstructorSecondTest(){
        assertDoesNotThrow( () -> new KodeKJUValidator("03"));
    }

    @Test
    void GetCodeTest(){
        try{
            KodeKJUValidator KKV = new KodeKJUValidator("04");
            assertEquals("04", KKV.getCode());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Test
    void NotZeroUntilSevenShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeKJUValidator("09"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Test
    void NotBeginWithZeroShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeKJUValidator("11"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Test
    void MoreThanTwoDigitsShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeKJUValidator("11"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Test
    void AlphabeticShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeKJUValidator("ab"));
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
                assertThrows(KIPException.class, () -> new KodeKJUValidator(testChar+testChar));
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
    }
}