package foundation;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringEndsWithTest {
    @Test
    public void solution() {
        assertTrue(StringEndsWith.solution("abc", "bc"));
        assertTrue(StringEndsWith.solution("abcde", "e"));
        assertFalse(StringEndsWith.solution("abc", "d"));
    }
}