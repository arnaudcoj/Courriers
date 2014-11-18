/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;

/**
 * Class defining the StringBuilder
 */
public class StringBuilder {

	private String buildingString;
	
	/**
	 * Constructor for the StringBuilder class
	 */
	public StringBuilder(){
		this.buildingString = "";
	}
	
	/**
	 * Append a string to the builder
	 * @param string the string to append to the render
	 */
	public void addString(String string){
		this.buildingString += string;
	}
	
	/**
	 * Print the built string
	 */
	public void render(){
		System.out.print(this.buildingString);
		this.buildingString = "";
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.buildingString;
	}
}
