package projek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KIPTest {
    @Test
    void NoUrutShouldIncrease(){
        try{
            assertEquals("2", KIP.getNoUrutKabupatenKota());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    void ConstructorFirstTest(){
        try{
            assertDoesNotThrow( () -> new KIP("12", "71", "020", "07"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void ConstructorSecondTest(){
        try{
            assertDoesNotThrow( () -> new KIP("13", "72", "010", "01"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    void ConstructorThirdTest(){
        try{
            assertDoesNotThrow( () -> new KIP("14", "73", "070", "05"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void ConstructorFourthTest(){
        try{
            assertDoesNotThrow( () -> new KIP());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    void KodeProvinsiShouldFailTest(){
        try{
            new KIP("42", "71", "02", "07");
        }catch (Exception e){
            assertEquals("Kode Provinsi Salah!", e.getMessage());
        }
    }

    @Test
    void KodeKabupatenShouldFailTest(){
        try{
            new KIP("12", "21", "02", "07");
        }catch (Exception e){
            assertEquals("Kode Kabupaten Salah!", e.getMessage());
        }
    }
    @Test
    void KodeKecamatanShouldFailFirstTest(){
        try{
            new KIP("12", "71", "92", "07");
        }catch (Exception e){
            assertEquals("Kode Kecamatan Salah!", e.getMessage());
        }
    }
    @Test
    void KodeKecamatanShouldFailSecondTest(){
        try{
            new KIP("12", "71", "011", "07");
        }catch (Exception e){
            assertEquals("Kode Kecamatan Salah!", e.getMessage());
        }
    }
    @Test
    void KodeKJUShouldFailSecondTest(){
        try{
            new KIP("12", "71", "460", "09");
        }catch (Exception e){
            assertEquals("Kode KJU Salah!", e.getMessage());
        }
    }



}