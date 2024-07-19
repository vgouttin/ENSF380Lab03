/* *
 * <h1 > Category . java </ h1 >
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

public class Category {
	//Attributes
	private Category subCategory;
	private Category superCategory;
	private String category;
	
	//Methods
	
	public String sort() {
		return "Method sort called by Category";
	}
	
	//Setters and Getters
	/**
	 * @return the subCategory
	 */
	public Category getSubCategory() {
		return subCategory;
	}

	/**
	 * @param subCategory the subCategory to set
	 */
	public void setSubCategory(Category subCategory) {
		this.subCategory = subCategory;
	}

	/**
	 * @return the superCategory
	 */
	public Category getSuperCategory() {
		return superCategory;
	}

	/**
	 * @param superCategory the superCategory to set
	 */
	public void setSuperCategory(Category superCategory) {
		this.superCategory = superCategory;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
