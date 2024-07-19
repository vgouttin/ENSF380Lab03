/* *
 * <h1 > Anthology . java </ h1 >
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

public class Anthology extends Fiction{
	//Attributes
	private Story[] stories;
	
    // Default constructor
    public Anthology() {
        super(); // Calls the default constructor of Fiction
    }

    // Parameterized constructor
    public Anthology(String isbn, int pages) {
        super(isbn, pages); // Calls the parameterized constructor of Fiction
    }
	
	//Methods
	public String storyOrder() {
		return "Method storyOrder called from Anthology";
	}
	
	//Making anthology abstract 
	public String coverArt() {
		return "Method coverArt called from Anthology";
	}

	//Setters and Getters
	/**
	 * @return the stories
	 */
	public Story[] getStories() {
		return stories;
	}

	/**
	 * @param stories the stories to set
	 */
	public void setStories(Story[] stories) {
		this.stories = stories;
	}
	
}
