package Inheritance;

public class Parent extends Grandparent {
	public void grand () {
		System.out.println("i am  parent");
        super.grand();
	}

	public static void main(String[] args) {
    Parent p = new Parent();
    p.grand();
	}

}
