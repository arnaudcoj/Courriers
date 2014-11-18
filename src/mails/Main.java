/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import mails.content.Money;
import mails.content.Text;
import mails.letter.PromissoryNote;
import mails.letter.RegisteredLetter;
import mails.letter.SimpleLetter;
import mails.letter.UrgentLetter;

public class Main {

	protected City city;
	protected List<Inhabitant> inhabitants;
	protected Random r;
	protected StringBuilder builder;

	public Main() {
		this.builder = new StringBuilder();
		
		r = new Random();

		System.out
				.println("Creating Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch city");
		this.city = new RenderCity(
				"Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch", this.builder);

		this.inhabitants = new ArrayList<Inhabitant>();

		System.out.println("Creating 100 inhabitants");
		for (int i = 0; i < 100; i++)
			this.inhabitants.add(new RenderInhabitant(city, "inhabitant-" + (i + 1),
					new BankAccount(5000), this.builder));
	}

	protected Random getR() {
		return this.r;
	}

	protected City getCity() {
		return this.city;
	}
	
	protected StringBuilder getBuilder(){
		return this.builder;
	}

	protected Letter<?> createRandomLetter() {
		Letter<?> letter;

		switch (r.nextInt(4)) {

		case 1:
			Letter<?> tmp1 = new SimpleLetter(this.inhabitants.get(r.nextInt(100)),
					this.inhabitants.get(r.nextInt(100)), new Text("bla bla"));
			letter = new UrgentLetter(tmp1.getSender(), tmp1.getReceiver(), tmp1);
			break;

		case 2:
			Letter<?> tmp2 = new SimpleLetter(this.inhabitants.get(r.nextInt(100)),
					this.inhabitants.get(r.nextInt(100)), new Text("bla bla"));
			letter = new RegisteredLetter(tmp2.getSender(), tmp2.getReceiver(), tmp2);
			break;

		case 3:
			letter = new PromissoryNote(this.inhabitants.get(r.nextInt(100)),
					this.inhabitants.get(r.nextInt(100)), new Money(r.nextInt(10)+10));
			break;
			
		default :
			letter = new SimpleLetter(this.inhabitants.get(r.nextInt(100)),
					this.inhabitants.get(r.nextInt(100)), new Text("bla bla"));

		}

		return letter;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i;

		Main main = new Main();

		System.out.println("Mailing letters for 6 days");

		for (i = 0; i < 6; i++) {
			System.out
					.println("**************************************************");
			System.out.println("Day " + (i + 1));

			for (int j = 0; j < main.getR().nextInt(4) + 2; j++)
				main.getCity().sendLetter(main.createRandomLetter());

			main.getCity().distributeLetters();
			
			main.getBuilder().render();
		}

		while (!main.getCity().isEmpty()) {
			System.out
					.println("**************************************************");
			System.out.println("Day " + (i + 1));

			main.getCity().distributeLetters();

			main.getBuilder().render();
			
			i++;
		}
	}

}
