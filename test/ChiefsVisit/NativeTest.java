package ChiefsVisit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NativeTest {
    private Native wunmi;
    @BeforeEach
    public void startAllTestWith() {
        wunmi = new Native("Adewunmi");
    }

    @Test
    public void thatNativeExist() {
        assertNotNull(wunmi);
    }

//    @Test
//    public void thatInformationChanges() {
//        wunmi = new Native("Adewunmi");
//        assertEquals("Adewunmi", wunmi.getFirstname());
//        assertEquals("Quadri", scvi90);
//    }



}