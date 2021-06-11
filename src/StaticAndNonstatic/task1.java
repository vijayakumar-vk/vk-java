package StaticAndNonstatic;

import one.Task5;

public class task1 {

	int a =100;
	int b = 50;
	public static void main(String[] args) {
		
         task1 obj = new task1();
         obj.add();
         obj.sub();
         obj.multiply();
         obj.divide();
         
	}
	
	public  void add () {
		 
		
		System.out.println(a+b);
		
	}
public  void sub () {
		 
		
		System.out.println(a-b);
		
	}
public  void multiply () {
	 
	
	System.out.println(a*b);
	
}
public  void  divide() {
	 
	System.out.println(a/b);
	
}




}
