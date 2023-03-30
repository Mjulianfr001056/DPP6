package projek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoUrutValidatorTest {
    @Test
    void ConstructorFirstTest(){
        assertDoesNotThrow( () -> new NoUrutValidator("0"));
    }
    @Test
    void ConstructorSecondTest(){
        assertDoesNotThrow( () -> new NoUrutValidator("12"));
    }

    @Test
    void GetCodeTest(){
        try{
            NoUrutValidator NUV = new NoUrutValidator("332");
            assertEquals("332", NUV.getCode());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Test
    void AlphabeticShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new NoUrutValidator("a"));
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
                assertThrows(KIPException.class, () -> new NoUrutValidator(testChar));
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
    }
}