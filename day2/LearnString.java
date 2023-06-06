package week3.day2;

public class LearnString {

	public static void main(String[] args) {
		String name = "TestLeaf"; // as a literal creating in string constant pool memory
		String compName = "TestLeaf";
		String s = new String("TestLeaf"); // creating an string instance and creating in different memory
		System.out.println(name==compName); // == operator returns the boolean and it compares the pool memory
		System.out.println(name==s); // Reference address check for memory that saved in same location and return as boolean
		System.out.println(name.equals(s)); //comparing the strings
		System.out.println("Before the case :" +name.equals(compName)); // equals it compares two strings as well as case sensitive 
		System.out.println(name.length()); // length it count the no. of characters of string and it returns the int value  
		System.out.println("After ignore the case :" +name.equalsIgnoreCase(compName)); // it return the boolen value
        System.out.println(name.contains(compName)); // check the string and value are exis tor not and checks the case sensitive
        int len = name.length(); //press ctrl+2 it will assig the local variable and return type
        System.out.println(len);
        System.out.println(compName.contains("Test"));
        int num [] = {1,2,3,4,5};
        System.out.println(num); // print the address 
        String [] name1 = {"Hari","Haran","Dinga","Dingi"};
        System.out.println(name1);
        String name2= "Hariharan";
        System.out.println(name2);
        char[] charArray = name.toCharArray(); //press ctrl+2 it will asign the local variable an returns the character
        System.out.println(charArray); // prints the char 
        for (int i = 0; i < charArray.length; i++) {
        	System.out.println(charArray[i]);
        }
              char charAt = name.charAt(5);
        	System.out.println("Index of particular character :" +charAt);
        	String input ="TestLeaf located in chennai";
        	    String[] split = input.split(" ");
        	    for (int i = 0; i < split.length; i++) {
					System.out.println(split[i]);
				}
        	    String replace = name.replace('e', 'a');
        	    System.out.println(replace);  //replace the particular thing we given
        	    
        	       String input1="TestLeaf Located in chennai by 2009";
        	              String replaceAll = input1.replaceAll("[^A-Z ]", "");
        	     
        	              System.out.println(replaceAll);
		}
	}


