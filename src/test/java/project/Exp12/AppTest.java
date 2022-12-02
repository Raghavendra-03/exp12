package project.Exp12;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
  
	@Test
    public void test() {

        App p = new App();
        assertEquals("Hello srivalli", p.getMessage("srivalli"));

    }
    @Test
    public void testNameEmpty() {

        App c = new App();
        assertEquals("Please provide a name!", c.getMessage(" "));

    }
}