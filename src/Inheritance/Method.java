package Inheritance;

public class Method {
	public void add(int a, int b) {
		System.out.println(a + b);

	}

	public void add(double b, int a) {
		System.out.println(b + a);
	}

	public void add(int a, double b) {
		System.out.println(a + b);
	}
     
	public void add(double a,double b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Method m = new Method();
		m.add(10, 10);
		m.add(5.0, 45);
		m.add(5.0, 10.0);
		m.add(45, 5.0);
		

	}

}
