/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails.test;

import static org.junit.Assert.*;

import mails.BankAccount;

import org.junit.Test;

/**
 * Class defining the BankAccount Tests
 */
public class BankAccountTest {

	@Test(expected = IllegalArgumentException.class)
	public void testCredit() throws IllegalArgumentException {
		BankAccount ba = new BankAccount(12);
		ba.credit(12);
		assertEquals(24, ba.getBalance());
		ba.credit(-12);
	}

	/**
	 * Test method for {@link mails.BankAccount#debit(int)}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testDebit() throws IllegalArgumentException {
		BankAccount ba = new BankAccount(12);
		ba.debit(12);
		assertEquals(0, ba.getBalance());
		ba.debit(-12);
	}
}
