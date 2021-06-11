package StaticAndNonstatic;

public class task3 {
static int a = 50;
static int b= 200;
	public static void main(String[] args) {
		
		 task3 obj = new task3();
         obj.add();
         task3.addition();
         obj.sub();
         task3.subraction();
         obj.multiply();
         task3.multiplication();
         obj.divide();
         task3.division();
        
	}
public  void add () {
		 
		
		System.out.println("ADDITION OF TWO NUMBER IS"+" "+(a+b));
		
	}
public  void sub () {
		 
		
	System.out.println("SUBRACTION OF TWO NUMBER IS"+" "+(a-b));		
	}
public  void multiply () {
	 
	
	System.out.println("MULTIPLICATION OF TWO NUMBER IS"+" "+(a*b));	
}
public  void  divide() {
	 
	System.out.println("DIVISION OF TWO NUMBER IS"+" "+(a/b));	
}
//////////////////////////////////////////////////////////////

public static void addition () {
	 
	
	System.out.println("ADDITION OF TWO NUMBER IS"+" "+(a+b));	
}
public static void subraction () {
	 
	
	System.out.println("SUBRACTION OF TWO NUMBER IS"+" "+(a-b));	
}
public static void multiplication () {
 

	System.out.println("MULTIPLICATION OF TWO NUMBER IS"+" "+(a*b));
}
public static void  division() {
 
	System.out.println("DIVISION OF TWO NUMBER IS"+" "+(a/b));
}



}
