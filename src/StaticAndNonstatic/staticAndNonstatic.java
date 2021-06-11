package StaticAndNonstatic;




///////////////////////////ROUGH PAGE///////////////////////////////////////




public class staticAndNonstatic {
	
	//STATIC BLOCK
	static
	{
		System.out.println("Hello from static block");
	}

	//non static block
	{
		System.out.println("Non static block");
	}
	public static void add() {
		staticAndNonstatic t=new staticAndNonstatic();

    }
	public static void main(String[] args) {
		System.out.println("Bye from main method");
		staticAndNonstatic t=new staticAndNonstatic();
		staticAndNonstatic.add();
		
		
         
	}
    
}
