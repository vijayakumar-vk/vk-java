package Constructor;

public class WithoutParameter {
	static {
		System.out.println("static block");
	}

	//non static block
	{
		System.out.println("non static block");
	}

	//constructor
	WithoutParameter(int a)
	{
		System.out.println("excuting constructor");
	}

	public static void main(String[] args) {
		System.out.println("executing main method");

		WithoutParameter t=new WithoutParameter(10);


	}

}
