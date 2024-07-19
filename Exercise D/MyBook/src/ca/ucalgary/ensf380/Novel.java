/* *
 * <h1 > Novel . java </ h1 >
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

public class Novel extends Fiction {
	//Attributes
	private Author[] theAuthors;
	private Series mySeries;
	
	//Methods
	public String theme() {
		return "Method theme called from Novel";
	}

	public String coverArt() {
		return "Method coverArt called from Novel";
	}
	//Setters and Getters
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

	/**
	 * @return the mySeries
	 */
	public Series getMySeries() {
		return mySeries;
	}

	/**
	 * @param mySeries the mySeries to set
	 */
	public void setMySeries(Series mySeries) {
		this.mySeries = mySeries;
	}
	
	
}
