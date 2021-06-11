package Inheritance;

public class Child1 extends Parent {
	public void Child1 () {
		System.out.println("i am  Child1");

	}
	public static void main(String[] args) {
		Child1 c = new Child1();
		c.grand();
		c.Parent();c.Child1();
	}

}
