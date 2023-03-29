package projek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NomorTeleponTest {
    @Test
    void ConstructorTest(){
        assertDoesNotThrow(()-> new NomorTelepon("051124283219"));
    }
}