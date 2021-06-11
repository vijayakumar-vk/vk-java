package Scanner;

import java.util.Scanner;

public class ScanAssign2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age ;
		System.out.println("enter the ATM PIN");

		int  PIN = s.nextInt();
if ( PIN == 5678) {
	System.out.println("CARD IS ACCEPTED");
}
else {
	System.out.println("CARD is DECLINED");

}
	}

}
