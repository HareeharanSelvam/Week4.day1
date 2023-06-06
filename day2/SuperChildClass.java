package week7.day2;

public class SuperChildClass {
       public void color() {
    	   super.color();
    	   System.out.println("coming from child class");
       }
	public static void main(String[] args) {
		SuperChildClass obj = new SuperChildClass();
		obj.color();
	}

}
