/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import mails.BankAccount;
import mails.City;
import mails.Inhabitant;
import mails.content.Money;
import mails.letter.PromissoryNote;

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
		Inhabitant h1 = new Inhabitant(c, new BankAccount(12));
		Inhabitant h2 = new Inhabitant(c, new BankAccount(12));
		PromissoryNote p = new PromissoryNote(h1, h2, new Money(12));
		c.sendLetter(p);
		c.distributeLetters();
		assertEquals(-1, h1.getBankAccount().getBalance());
		assertEquals(23, h2.getBankAccount().getBalance());
	}

}
