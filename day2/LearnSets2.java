package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSets2 {

	public static void main(String[] args) {
		//here we using LinkedHashSet using the other implementation class
		//here the result will be displayed as per the given insertion
		Set<Integer> nums = new LinkedHashSet <Integer>();
		// we use add method to check what happens 
		nums.add(20);
		nums.add(25);
		nums.add(36);
		nums.add(16);
		nums.add(55);
		nums.add(20);// it will wont allow duplicates 
		//printing the add method by using the set name 
		System.out.println(nums);
		System.out.println(nums.add(23));
		//removing the number from the set 
		//either we use syso statement or we can use the method
		nums.remove(23);
		System.out.println(nums.remove(20));
		System.out.println(nums.size()); // show the length or size of the set
		System.out.println(nums.add(37));
		
		Set<String> name = new LinkedHashSet <String>();
		name.add("Hari");
		name.add("Sangee");
		name.add("Dinga");
		System.out.println(name.contains("Hari"));
		

	}

}
