
package collections;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		// Declare the ArrayList
		ArrayList<String> var = new ArrayList<String>();
		// add a few Strings to it
		var.add("Lars");
		var.add("Jennifer");
		// Loop over it and print the result to the console
		for (String s : var) {
			System.out.println(s);
		}
	}
}
