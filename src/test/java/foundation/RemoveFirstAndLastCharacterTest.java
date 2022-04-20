package foundation;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveFirstAndLastCharacterTest {

    @Test
    public void remove() {
        assertEquals("loquen", RemoveFirstAndLastCharacter.remove("eloquent"));
        assertEquals("ountr", RemoveFirstAndLastCharacter.remove("country"));
        assertEquals("erso", RemoveFirstAndLastCharacter.remove("person"));
        assertEquals("lac", RemoveFirstAndLastCharacter.remove("place"));
    }
}