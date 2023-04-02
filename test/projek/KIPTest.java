package projek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KIPTest {
//    @Test
//    void NoUrutShouldIncrease(){
//        try{
//            assertEquals("4", KIP.getNoUrutKabupatenKota());
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
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
    void GetCodeTest(){
        try{
            KIP testKIP = new KIP("13", "72", "010", "01");
            assertEquals("13", testKIP.getKodeProvinsi());
            assertEquals("72", testKIP.getKodeKabupaten());
            assertEquals("010", testKIP.getKodeKecamatan());
            assertEquals("01", testKIP.getKodeKJU());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void SetCodeTest(){
        try{
            KIP testKIP = new KIP();
            assertDoesNotThrow(() -> testKIP.setKodeProvinsi("13"));
            assertDoesNotThrow(() -> testKIP.setKodeKabupaten("72"));
            assertDoesNotThrow(() -> testKIP.setKodeKecamatan("010"));
            assertDoesNotThrow(() -> testKIP.setKodeKJU("01"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void ToStringTest(){
        try{
            KIP testKIP = new KIP("13", "72", "010", "01");
            assertEquals("Kode Provinsi : 13, Kode Kabupaten : 72," +
                            " Kode Kecamatan : 010, Kode KJU : 01, No. Urut : 4",
                    testKIP.toString());
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