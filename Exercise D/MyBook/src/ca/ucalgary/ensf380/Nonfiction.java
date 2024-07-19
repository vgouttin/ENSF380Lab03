/* *
 * <h1 > Nonfiction . java </ h1 >
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

public class Nonfiction extends Paperback{
	//Attributes
	private Category deweyClassification;
	
	//Methods
	public String topic() {
		return "Method topic called from Nonfiction";
	}

	//Setters and Getters
	/**
	 * @return the deweyClassification
	 */
	public Category getDeweyClassification() {
		return deweyClassification;
	}

	/**
	 * @param deweyClassification the deweyClassification to set
	 */
	public void setDeweyClassification(Category deweyClassification) {
		this.deweyClassification = deweyClassification;
	}
	
	
}
