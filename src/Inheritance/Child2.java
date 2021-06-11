package Inheritance;

public class Child2 extends Parent {
	public void Child2 () {
		System.out.println("i am  Child2");

	}
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.grand();
		c.Parent();
		c.Child2();
		
	}

}
