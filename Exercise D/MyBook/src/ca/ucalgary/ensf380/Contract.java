/* *
 * <h1 > Contract . java </ h1 >
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

public class Contract {
	
	//Attributes
	private String date;
	private Publisher publisherInfo;
	private Author[] authorInfo;
	
	//Constructor
	
	public Contract(String date, Publisher publisherInfo, Author[] authorInfo) {
		this.date = date;
		this.publisherInfo = publisherInfo;
		this.authorInfo = authorInfo;
	}	
	//Methods
	public String printContact() {
		return "Method printContact called by Contract";
	}
	
	//Setters and Getters
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the publisherInfo
	 */
	public Publisher getPublisherInfo() {
		return publisherInfo;
	}

	/**
	 * @param publisherInfo the publisherInfo to set
	 */
	public void setPublisherInfo(Publisher publisherInfo) {
		this.publisherInfo = publisherInfo;
	}

	/**
	 * @return the authorInfo
	 */
	public Author[] getAuthorInfo() {
		return authorInfo;
	}

	/**
	 * @param authorInfo the authorInfo to set
	 */
	public void setAuthorInfo(Author[] authorInfo) {
		this.authorInfo = authorInfo;
	}
	
	
}
