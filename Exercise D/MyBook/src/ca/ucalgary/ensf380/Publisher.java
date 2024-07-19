/* *
 * <h1 > Publisher . java </ h1 >
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

public class Publisher {
	
	//Attributes
	private String name;
	private String address;
	private Classic[] classicsCatalog;
	
	//Constructor
	public Publisher(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	//Methods
	public String printLetterHead() {
		return "Method printLetterHead called by Publisher";
	}

	//Setters and Getters
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the classicsCatalog
	 */
	public Classic[] getClassicsCatalog() {
		return classicsCatalog;
	}

	/**
	 * @param classicsCatalog the classicsCatalog to set
	 */
	public void setClassicsCatalog(Classic[] classicsCatalog) {
		this.classicsCatalog = classicsCatalog;
	}
	
	
}
