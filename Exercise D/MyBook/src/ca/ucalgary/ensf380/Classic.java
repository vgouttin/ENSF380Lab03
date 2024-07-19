/* *
 * <h1 > Classic . java </ h1 >
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

public class Classic extends Hardcover {
	//Attributes
	private int origPubYear = 1860;
	private Author theAuthor;
	private Publisher[] bookPublisher;
	
	//Methods
	public String createNotes() {
		return "Method createNotes called by Classic";
	}
	//Setters and Getters

	public int getOrigPubYear() {
		return origPubYear;
	}

	public void setOrigPubYear(int origPubYear) {
		this.origPubYear = origPubYear;
	}

	public Author getTheAuthor() {
		return theAuthor;
	}

	public void setTheAuthor(Author theAuthor) {
		this.theAuthor = theAuthor;
	}

	public Publisher[] getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(Publisher[] bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	
}
