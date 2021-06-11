package Scanner;

import java.util.Scanner;

public class ScanAssing1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age ;
		System.out.println("enter the age");

		age = s.nextInt();
if (age >= 21) {
	System.out.println("eligible for marraige");
}
else {
	System.out.println("not eligible for marraige");

}
	}

}
