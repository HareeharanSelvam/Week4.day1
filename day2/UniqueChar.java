package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueChar {

	public static void main(String[] args) {
		//input
		String companyName = "Google";
		//declarer the variable output
		String output = "";
		//convert this String into charArray
		char[] charArray = companyName.toCharArray();
		//now i enter the data into the set as an individual characters to we convert into the array
		Set<Character> unique =  new LinkedHashSet<Character>();
		//use for loop to add the data and it is the array for loop
		for (int i = 0; i < charArray.length; i++) {
			if(unique.add(charArray[i]))
			{
				//Assign a variable to store the result
				output = output+charArray[i];
			}
			
		}
		System.out.println(output);

	}

}
