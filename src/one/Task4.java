package one;

public class Task4 {

	public static void main(String[] args) {
		Task4 b = new Task4();

		b.taskBank();
	}
		 String name = "RAMESH";
		static String bankName = "SBI BANK";
		static int accountBalance = 1000;
		static int withdrawlAmount = 500;
	
	public  void taskBank () {
		//Task4 b = new Task4();
		System.out.println(name);
		System.out.println(bankName);
		
		
			int balance = accountBalance - withdrawlAmount;
			System.out.println(balance);
		}
	
	public static void AreaOfCircle () {
		Double PI = 3.142;
		int radius = 5;
		
		System.out.println("Area of circe is"+" " + (PI *radius*radius) );
		
	}
	public static void AreaOfTriangle () {
		int base = 10;
		int height = 30;
		System.out.println("Area of triangle is"+" " + (1/2)*base*height);
	}
	public static void AreaOfSquare () {
		int length = 25;
		System.out.println("Area of square is"+" " + length*length);
				
	}
	public static void AreaOfRect() {
		int length = 20;
		int breadth = 40;
        System.out.println("Area of Rectangle is"+" " + length*breadth);
	}
	
	
	
	//ADD,SUB,MULTIPLY,DIVISION WITH PARAMETER
	
	public static void add(int a,int b) {
		System.out.println("addition of a and b is"+" "+(a+b));
	}
	
	public static void sub(int a,int b) {
		System.out.println("subraction of a and b is"+" "+(a-b));
	}
	
	public static void multiply(int a,int b) {
		System.out.println("multiplication of a and b is"+" "+(a*b));
	}
	
	public static void divide(int a,int b) {
		System.out.println("division of a and b is"+" "+(a/b));
	}
	
	
	
	//ADD,SUB,MULTIPLY,DIVISION WITHOUT PARAMETER
	
    public static void addition() {
    	int a =10;
    	int b= 5;
    	System.out.println("addition of two number is" +" " + (a+b));
    	}
    
    
    public static void subraction() {
    	int a =10;
    	int b= 5;
    	System.out.println("subraction of two number is" +" " + (a-b));
    	}
    
    
    public static void multiplication() {
    	int a =10;
    	int b= 5;
    	System.out.println("multipilication of two number is" +" " + (a*b));
    	}
    
    
    public static void dividion() {
    	int a =10;
    	int b= 5;
    	System.out.println("division of two number is" +" " + (a/b));
    	}
    
    

}
