package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInSet {

	public static void main(String[] args) {
		//here i try to add the data in the Set 
		String input = "Testleaf";
		//declare the variable to get result
		String output = "";
		//So here first i need to convert the string into character Array
		char[] charArray = input.toCharArray();
		// now i add those data in the set by 
		Set<Character> RemoveDup = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if(RemoveDup.add(charArray[i]))
			{
			output = output+charArray[i];
		}
		
	}
		System.out.println(output);
	}
}
