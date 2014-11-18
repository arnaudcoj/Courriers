/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails.test;

import static org.junit.Assert.*;

import mails.BankAccount;
import mails.City;
import mails.Inhabitant;
import mails.content.Text;
import mails.letter.AcknowledgmentOfReceipt;

import org.junit.Test;

/**
 * Class defining the AcknowledgmentOfReceiptTest
 */
public class AcknowledgmentOfReceiptTest {


	/**
	 * Test method for {@link mails.letter.AcknowledgmentOfReceipt#toString()}.
	 */
	@Test
	public void testToString() {
		Inhabitant h1 = new Inhabitant(new City("ledj"), "jipé", new BankAccount(12));
		AcknowledgmentOfReceipt aor = new AcknowledgmentOfReceipt(h1, h1, new Text("bleh"));
		assertEquals("an aknowledgment of receipt which is a simple letter whose content is a text content (bleh)", aor.toString());
	}

	/**
	 * Test method for {@link mails.letter.SimpleLetter#getCost()}.
	 */
	@Test
	public void testGetCost() {
		Inhabitant h1 = new Inhabitant(new City("ledj"), "jipé", new BankAccount(12));
		AcknowledgmentOfReceipt aor = new AcknowledgmentOfReceipt(h1, h1, new Text("bleh"));
		assertEquals(1, aor.getCost());
	}

}
