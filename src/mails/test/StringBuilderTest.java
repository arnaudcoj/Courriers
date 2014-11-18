/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails.test;

import static org.junit.Assert.*;

import mails.StringBuilder;

import org.junit.Test;

/**
 * Class defining the StringBuilderTest
 */
public class StringBuilderTest {

	/**
	 * Test method for {@link mails.StringBuilder#addString(java.lang.String)}.
	 */
	@Test
	public void testAddString() {
		StringBuilder sb = new StringBuilder();
		sb.addString("string ");
		sb.addString("zizanie");
		assertEquals("string zizanie", sb.toString());
	}

	@Test
	public void emptyAfterRender() {
		StringBuilder sb = new StringBuilder();
		sb.addString("string ");
		sb.addString("zizanie");
		sb.render();
		assertEquals("", sb.toString());
	}
	
}
