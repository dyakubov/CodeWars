package foundation;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReversedStringsTest {

    @Test
    public void solution() {
        assertEquals("dlrow", ReversedStrings.solution("world"));
        assertEquals("dlrow", ReversedStrings.solution2("world"));
    }
}