package com.psl.date;

/* Class takes the input for Date, Month and Year 
 * Displays in the Format (dd-mm-yyyy)
 *   
 * @author Nikhil (Admin)
 * 
 */

public class FirstDemo {
	private int day, month, year;

	private FirstDemo() {
		System.out.println("Default Constructor Called!");
		day = 7;
	}

	public FirstDemo(int mm, int yy) {
		this();
		System.out.println("Parameterized  Constructor Called!");
		month = mm;
		year = yy;
	}

	public void displayDate() {
		System.out.println(day + "-" + month + "-" + year);
	}

	public static void main(String[] args) {
		FirstDemo obj;
		obj = new FirstDemo(9, 2015);
		obj.displayDate();
	}

}
