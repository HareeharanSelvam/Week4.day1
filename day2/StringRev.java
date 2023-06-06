package week3.day2;

public class StringRev {

	public static void main(String[] args) {
	 String input = "Hariharan";
	       char[] ch = input.toCharArray();
	       
	       for (int i = ch.length-1; i >=0; i--) {
	    	   System.out.print(ch[i]);
			
		}
	}
}
