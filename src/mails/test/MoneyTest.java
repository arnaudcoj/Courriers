/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails.test;

import static org.junit.Assert.assertEquals;
import mails.content.Money;

import org.junit.Test;

/**
 * Class defining the MoneyTest
 */
public class MoneyTest {

	/**
	 * Test if a Money can't be negative
	 */
	@SuppressWarnings("unused")
	@Test (expected=IllegalArgumentException.class)
	public void testNegativeMoney() {
		Money m = new Money(-1);
	}
	
	/**
	 * Test method for {@link mails.content.Money#getAmount()}.
	 */
	@Test
	public void testGetAmount() {
		assertEquals(5, new Money(5).getAmount());
	}

	/**
	 * Test method for {@link mails.content.Money#toString()}.
	 */
	@Test
	public void testToString() {
		assertEquals("a money content (12)", new Money(12).toString());
		}

}
