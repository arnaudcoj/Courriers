/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails.test;

import static org.junit.Assert.assertEquals;
import mails.BankAccount;
import mails.City;
import mails.Inhabitant;
import mails.content.Money;
import mails.letter.PromissoryNote;

import org.junit.Test;

/**
 * Class defining the Inhabitant Tests
 */
public class InhabitantTest {

	/**
	 * Test method for {@link mails.Inhabitant#getCity()}.
	 */
	@Test
	public void testGetCity() {
		City c = new City("Testville");
		Inhabitant h = new Inhabitant(c, "Test", new BankAccount(12));
		assertEquals(c, h.getCity());
	}

	/**
	 * Test method for {@link mails.Inhabitant#getBankAccount()}.
	 */
	@Test
	public void testGetBankAccount() {
		BankAccount b = new BankAccount(12);
		Inhabitant h = new Inhabitant(new City("testVille"), "Test", b);
		assertEquals(b, h.getBankAccount());
	}
	
	/**
	 * Test method for {@link mails.Inhabitant#receiveLetter(mails.Letter)}.
	 */
	@Test
	public void testReceiveLetter() {
		City c = new City("Testville");
		Inhabitant h1 = new Inhabitant(c, "Test", new BankAccount(12));
		Inhabitant h2 = new Inhabitant(c, "Test", new BankAccount(12));
		PromissoryNote p = new PromissoryNote(h1, h2, new Money(12));
		h1.sendLetter(p);
		c.distributeLetters();
		assertEquals(-1, h1.getBankAccount().getBalance());
		assertEquals(23, h2.getBankAccount().getBalance());
	}

}
