package foundation;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateBMITest {

    @Test
    public void bmi() {
        assertEquals("Normal", CalculateBMI.bmi(80, 1.80));
    }
}