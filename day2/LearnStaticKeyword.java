package week7.day2;

public class LearnStaticKeyword {
       static int a=10;
       static String name="Hari";
       static {
    	   System.out.println("Static block");
       }
	 public void test() {
		 System.out.println("Test begin");
		 int a=15; 
		 System.out.println(a);
		 System.out.println("Test End");
	 }
	 public static void print() {
		 int b=20;
		 System.out.println("print begin");
		 System.out.println(b);
		 System.out.println("print end");
	 }

	public static void main(String[] args) {
		System.out.println("Main Begin");
		System.out.println(a);
		LearnStaticKeyword obj = new LearnStaticKeyword();
		obj.test();
		print();
		System.out.println(name); 
		System.out.println("Main End");
		
	}

	static {
		System.out.println("static initializer");
	}
}
