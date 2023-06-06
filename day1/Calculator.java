package week3.day1;

public class Calculator {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(float x, int y) {
		System.out.println(x+y);
	}
	public void mul(int a, int b, int c) {
		System.out.println(a*b*c);
	}
	public void mul(float x, int y){ 
		System.out.println(x*y);
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add(10, 20);
		obj.add(10.5f, 15);
		obj.mul(10, 20, 30);
		obj.mul(15.5f, 30);

	}

}
