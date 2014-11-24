/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails.test;

import static org.junit.Assert.assertTrue;
import mails.BankAccount;
import mails.City;
import mails.Inhabitant;
import mails.RenderCity;
import mails.RenderInhabitant;
import mails.StringBuilder;
import mails.content.Text;
import mails.letter.RegisteredLetter;
import mails.letter.SimpleLetter;
import mails.letter.UrgentLetter;

import org.junit.Test;

/**
 * Class defining the LetterDecoratorTest
 */
public class LetterDecoratorTest {
	
	@Test
	public void createADecoractedLetter(){
		StringBuilder builder = new StringBuilder();
		
		City c = new RenderCity("Testville", builder);
		
		Inhabitant h1 = new RenderInhabitant(c, "Test-01", new BankAccount(12), builder);
		Inhabitant h2 = new RenderInhabitant(c, "Test-02", new BankAccount(12), builder);
		
		SimpleLetter sl = new SimpleLetter(h1, h2, new Text("hello"));
		RegisteredLetter rl = new RegisteredLetter(h1, h2, sl);
		
		c.sendLetter(rl);
		c.distributeLetters();
		assertTrue(!c.isEmpty());
		c.distributeLetters();
		assertTrue(c.isEmpty());
	}
	
	@Test
	public void createUrgentLetter(){
		StringBuilder builder = new StringBuilder();
		
		City c = new RenderCity("Testville", builder);
		
		Inhabitant h1 = new RenderInhabitant(c, "Test-01", new BankAccount(12), builder);
		Inhabitant h2 = new RenderInhabitant(c, "Test-02", new BankAccount(12), builder);
		
		SimpleLetter sl = new SimpleLetter(h1, h2, new Text("hello"));
		UrgentLetter ul = new UrgentLetter(h1, h2, sl);
		
		c.sendLetter(ul);
		c.distributeLetters();
		assertTrue(c.isEmpty());
	}

}
