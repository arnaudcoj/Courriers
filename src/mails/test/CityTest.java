/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import mails.BankAccount;
import mails.City;
import mails.Inhabitant;
import mails.content.Money;
import mails.content.Text;
import mails.letter.PromissoryNote;
import mails.letter.SimpleLetter;

import org.junit.Test;

/**
 * Class defining the City Tests
 */
public class CityTest {

	/**
	 * Test method for {@link mails.City#sendLetter(mails.Letter)}.
	 */
	@Test
	public void testLetters() {
		City c = new City("Testville");
		Inhabitant h1 = new Inhabitant(c, "Test-01", new BankAccount(12));
		Inhabitant h2 = new Inhabitant(c, "Test-02", new BankAccount(12));
		PromissoryNote p = new PromissoryNote(h1, h2, new Money(12));
		c.sendLetter(p);
		c.distributeLetters();
		assertEquals(-1, h1.getBankAccount().getBalance());
		assertEquals(23, h2.getBankAccount().getBalance());
	}
	
	
	@Test
	public void testIsEmpty() {
		City c = new City("Testville");
		Inhabitant h1 = new Inhabitant(c, "Test-01", new BankAccount(12));
		Inhabitant h2 = new Inhabitant(c, "Test-02", new BankAccount(12));
		SimpleLetter p = new SimpleLetter(h1, h2, new Text("bla bla"));
		assertTrue(c.isEmpty());
		c.sendLetter(p);
		assertFalse(c.isEmpty());
		c.distributeLetters();
		assertTrue(c.isEmpty());
	}
	
	@Test
	public void testToString() {
		assertEquals(new City("Testville").toString(),"Testville city");
	}

}
