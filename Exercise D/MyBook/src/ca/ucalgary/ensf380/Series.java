/* *
 * <h1 > Series . java </ h1 >
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

public class Series {
	//Attributes
	private String seriesName;
	
	
	//Methods
	public String theme() {
		return "Method theme called by Series";
	}

	//Setters and Getters
	/**
	 * @return the seriesName
	 */
	public String getSeriesName() {
		return seriesName;
	}

	/**
	 * @param seriesName the seriesName to set
	 */
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
	
	
}
