package foundation;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void greet() throws Exception{
        assertEquals("hello world", HelloWorld.greet());
    }
}