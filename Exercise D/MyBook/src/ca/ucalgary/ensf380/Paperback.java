/* *
 * <h1 > Paperback . java </ h1 >
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

public class Paperback extends Book {
	  public Paperback() {
	        super(); // Calls the default constructor of Book
	    }

	    // Parameterized constructor
	    public Paperback(String isbn, int pages) {
	        super(isbn, pages); // Calls the parameterized constructor of Book
	    }
	    
	public String coverArt() {
		return "Method coverArt called from Paperback";
	}
}
