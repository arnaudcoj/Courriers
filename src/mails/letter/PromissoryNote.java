/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails.letter;

import mails.Inhabitant;
import mails.Letter;
import mails.content.Money;
import mails.content.Text;

/**
 * Class defining the PromissoryNote
 */
public class PromissoryNote extends Letter<Money> {
	
	/**
	 * Constructor for the PromissoryNote class
	 * @param sender
	 * @param receiver
	 * @param content
	 * @param amount
	 */
	public PromissoryNote(Inhabitant sender, Inhabitant receiver, Money content) {
		super(sender, receiver, content);
	}

	/* (non-Javadoc)
	 * @see mails.Letter#action()
	 */
	@Override
	public void action() {
		this.sender.getBankAccount().debit(this.content.getAmount());
		this.receiver.getBankAccount().credit(this.content.getAmount());		
		this.sender.getCity().sendLetter(new SimpleLetter(this.receiver, this.sender, new Text("Thanks !")));
	}

	/* (non-Javadoc)
	 * @see mails.Letter#getCost()
	 */
	@Override
	public int getCost() {
		return this.content.getAmount()/100 + SimpleLetter.SIMPLELETTERCOST;
	}
	
}
