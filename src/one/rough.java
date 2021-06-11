package one;

import java.util.Scanner;

///////////////////////////ROUGH PAGE///////////////////////////////////////



public class rough {
	
	public void status() {
		System.out.println("message");
	}

}
class Whatsup2 extends rough
{
	public void status() {
		System.out.println("photos video ");
		super.status();
	}
}

class Whatsup3 extends rough {
	public void status() {
		System.out.println("location,gif");
		super.status();
	}
	
	public static void main(String[] args) {
		
		rough r = new rough();
		r.status();
		r.status();
}
}