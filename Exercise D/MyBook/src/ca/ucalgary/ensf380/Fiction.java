/* *
 * <h1 > Fiction . java </ h1 >
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

public class Fiction extends Paperback{
	
	public Fiction() {
	    super(); // Calls the default constructor of Paperback
	}

	    // Parameterized constructor
	public Fiction(String isbn, int pages) {
		super(isbn, pages); // Calls the parameterized constructor of Paperback
	}
	
	public String coverArt() {
		return "Method coverArt called from Fiction";
	}
	
	public String genre() {
		return "Method genre called from Fiction";
	}
}
