/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import mails.content.Text;
import mails.letter.SimpleLetter;

public class Main {

	protected City city;
	protected List<Inhabitant> inhabitants;
	protected Random r;

	public Main() {
		r = new Random();

		System.out
				.println("Creating Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch city");
		this.city = new City(
				"Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch");

		this.inhabitants = new ArrayList<Inhabitant>();

		System.out.println("Creating 100 inhabitants");
		for (int i = 0; i < 100; i++)
			this.inhabitants.add(new Inhabitant(city, "inhabitant-" + (i + 1),
					new BankAccount(5000)));
	}

	protected Random getR() {
		return this.r;
	}

	protected City getCity() {
		return this.city;
	}

	protected Letter<?> createRandomLetter() {
		Letter<?> letter;

		switch (r.nextInt(4)) {

		case 1:
			letter = new UrgentLetter(this.inhabitants.get(r.nextInt(100)),
					this.inhabitants.get(r.nextInt(100)), new Text("bla bla"+1));
			break;

		case 2:
			letter = new SimpleLetter(this.inhabitants.get(r.nextInt(100)),
					this.inhabitants.get(r.nextInt(100)), new Text("bla bla"+2));
			break;

		case 3:
			letter = new SimpleLetter(this.inhabitants.get(r.nextInt(100)),
					this.inhabitants.get(r.nextInt(100)), new Text("bla bla"+3));
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
		}

		while (!main.getCity().isEmpty()) {
			System.out
					.println("**************************************************");
			System.out.println("Day " + (i + 1));

			main.getCity().distributeLetters();

			i++;
		}
	}

}
