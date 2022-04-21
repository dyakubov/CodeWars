package foundation;

import org.junit.Assert;
import org.junit.Test;

public class CountingSheepTest {

    @Test
    public void countSheep() {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, null, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        Assert.assertEquals(17, new CountingSheep().countSheep(array1));
    }

    @Test
    public void countSheep2() {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, null, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        Assert.assertEquals(17, new CountingSheep().countSheep2(array1));
    }
}