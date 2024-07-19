/* *
 * <h1 > Story . java </ h1 >
 * <p >
 * This class is designed for processing XXX in Java .
 * It is part of Lab 3 Exercise D .
 *
 * <p > <b > Submission Date : </b > July 18th, 2024 </ p >
 *
 * @author Victor Gouttin
 *  * @version 1.0
 */

package ca.ucalgary.ensf380;

public class Story {
	//Attributes
	private Author[] theAuthors;

	//Methods
	public String plot() {
		return "Method plot called by Story";
	}
	
	//Setters and getters
	/**
	 * @return the theAuthors
	 */
	public Author[] getTheAuthors() {
		return theAuthors;
	}

	/**
	 * @param theAuthors the theAuthors to set
	 */
	public void setTheAuthors(Author[] theAuthors) {
		this.theAuthors = theAuthors;
	}

	
}
