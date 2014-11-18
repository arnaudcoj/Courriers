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
import mails.RenderCity;
import mails.StringBuilder;
import mails.content.Text;
import mails.letter.SimpleLetter;

import org.junit.Test;

/**
 * Class defining the RenderCityTest
 */
public class RenderCityTest {

	/**
	 * Test method for {@link mails.RenderCity#sendLetter(mails.Letter)}.
	 */
	@Test
	public void testSendLetter() {
		Inhabitant h = new Inhabitant(new City("city"), "name",
				new BankAccount(42));
		StringBuilder sb = new StringBuilder();
		RenderCity rc = new RenderCity("TestVille", sb);
		rc.sendLetter(new SimpleLetter(h, h, new Text("text")));
		assertEquals(
				"-> name mails a simple letter whose content is a text content (text) to name for a cost of 1 euros\n",
				sb.toString());
	}

}
