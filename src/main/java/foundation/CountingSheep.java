package foundation;

import java.util.Arrays;
import java.util.Objects;

public class CountingSheep {
    public int countSheep(Boolean[] arrayOfSheep){
        int count = 0;
        for (Boolean ofSheep : arrayOfSheep) {
            if (ofSheep != null && ofSheep) {
                count++;
            }
        }
        return count;
    }

    public int countSheep2(Boolean[] arrayOfSheep){
        return Arrays.stream(arrayOfSheep).filter(Objects::nonNull).filter(x -> x).toArray().length;
    }

}
