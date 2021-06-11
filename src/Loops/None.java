package Loops;

public class None {
	static {
		System.out.println("static block");
	}
	
	//non static block
	{
		System.out.println("non static block");
	}
	
	//constructor
	None(int a)
	{
		System.out.println("executing constructor");
	}

	public static void main(String[] args) {
		System.out.println("executing main method");
		
		None t=new None(10);
		

	}


}
