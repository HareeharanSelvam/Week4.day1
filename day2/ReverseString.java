package week3.day2;
public class ReverseString {

	public static void main(String[] args) {
	  String input ="Amazon development centre,chennai";
	  String replace = input.replace(",", " ");
	  String lowerCase = replace.toLowerCase();
	  String[] split = lowerCase.split(" ");
	  for (int i = split.length-1; i >=0; i--) {
		  System.out.print(split[i]+" ");
		
	}
		
	}
		}	    
	 



