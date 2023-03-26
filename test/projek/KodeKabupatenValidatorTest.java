package projek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KodeKabupatenValidatorTest {
    @Test
    void ConstructorTest(){
        assertDoesNotThrow( () -> new KodeKabupatenValidator("01"));
    }

    @Test
    void GetCodeTest(){
        try{
            KodeKabupatenValidator KPV = new KodeKabupatenValidator("01");
            assertEquals("01", KPV.getCode());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Test
    void NotZeroOrSevenFirstShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeKabupatenValidator("11"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    @Test
    void NotZeroOrSevenSecondShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeKabupatenValidator("23"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Test
    void NotZeroOrSevenThirdShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeKabupatenValidator("83"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Test
    void NotZeroOrSevenFourthShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeKabupatenValidator("95"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Test
    void ZeroAtLastFirstShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeKabupatenValidator("10"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Test
    void ZeroAtLastSecondShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeKabupatenValidator("70"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Test
    void AlphabeticShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeKabupatenValidator("ab"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Test
    void OneDigitShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeKabupatenValidator("0"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @Test
    void MoreThanTwoDigitsShouldFailTest(){
        try{
            assertThrows(KIPException.class, () -> new KodeKabupatenValidator("0123"));
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
                assertThrows(KIPException.class, () -> new KodeKabupatenValidator(testChar + testChar));
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}