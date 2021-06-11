package Scanner;

import java.util.Scanner;

public class ScanAssign3 {

	public static void main(String[] args) {
int a ;
int b ;
int c ;
Scanner s = new Scanner(System.in);
System.out.println("ENTER THE THREE NUMBERS");
a = s.nextInt();
b = s.nextInt();
c = s.nextInt();

if (a > b) {
	System.out.println("a is greater");
	
}
else if (b > c) {
	System.out.println("b is greater");

}
else if (c> a) {
	System.out.println("c is greater");

} else {
	System.out.println("ALL NUMBER ARE EQUAL");

}
	}

}
