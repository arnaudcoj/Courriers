/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails.test;

import static org.junit.Assert.assertEquals;
import mails.BankAccount;
import mails.City;
import mails.RenderInhabitant;
import mails.StringBuilder;
import mails.content.Text;
import mails.letter.SimpleLetter;

import org.junit.Test;

/**
 * Class defining the RenderInhabitantTest
 */
public class RenderInhabitantTest {

	/**
	 * Test method for {@link mails.RenderInhabitant#receiveLetter(mails.Letter)}.
	 */
	@Test
	public void testReceiveLetter() {
		StringBuilder sb = new StringBuilder();
		RenderInhabitant h = new RenderInhabitant(new City("city"), "name",
				new BankAccount(42), sb);
		h.receiveLetter(new SimpleLetter(h, h, new Text("text")));
		System.out.println(sb);;
		assertEquals("<- name receives a simple letter whose content is a text content (text) from name\n", sb.toString());
	}

	/**
	 * Test method for {@link mails.RenderInhabitant#credit(int)}.
	 */
	@Test
	public void testCredit() {
		StringBuilder sb = new StringBuilder();
		RenderInhabitant h = new RenderInhabitant(new City("city"), "name",
				new BankAccount(42), sb);
		h.credit(12);
		assertEquals("+ name's account is credited with 12; its balance is now 54 euros\n", sb.toString());
	}

	/**
	 * Test method for {@link mails.RenderInhabitant#debit(int)}.
	 */
	@Test
	public void testDebit() {
		StringBuilder sb = new StringBuilder();
		RenderInhabitant h = new RenderInhabitant(new City("city"), "name",
				new BankAccount(42), sb);
		h.debit(12);
		assertEquals("- name's account is debited of 12; its balance is now 30 euros\n", sb.toString());
	}

}
