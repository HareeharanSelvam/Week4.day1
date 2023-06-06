package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class LearnSets1 {

	public static void main(String[] args) {
		//syntax and creating set collection 
		/* set worked based on three implementation class
		 * 1.Hash set
		 * 2.Linked Hash set
		 * 3.Tree set
		 * now we work with Hash set , Hash set works like random search and fast result  and it will display like queue (FIFO)
		 * and import it to the util package 
		 */
		Set<Integer> nums = new HashSet <Integer>();
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
		
		Set<String> name = new HashSet <String>();
		name.add("Hari");
		name.add("Sangee");
		name.add("Dinga");
		System.out.println(name.contains("Hari"));
		// In Set collection we cannot use the For loop , so instead of the For loop 
		//we can use the For each  loop to iterate and , print the element is presented or not
		for (String output : name) {
			System.out.println( output);
		}
		

	}

}
