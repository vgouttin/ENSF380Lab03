/* *
 * <h1 > Book . java </ h1 >
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

public class Book {
	
	//Attributes
	private String isbn;
	private int publicationYear;
	private int pages;
	
	public Book() {
		//Default constructor
	}
	
	
	//Constructor
	public Book(String isbn, int pages) {
		this.isbn = isbn;
		this.pages = pages;
	}
	
	//Setters and Getters
	public String getIsbn() {
		return this.isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getPublicationYear() {
		return this.publicationYear;
	}
	
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	public int getPages() {
		return this.pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
}
