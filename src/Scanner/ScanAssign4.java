package Scanner;

import java.util.Scanner;

public class ScanAssign4 {

	public static void main(String[] args) {
		int mark;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the mark");
		mark = s.nextInt();
		if (mark <= 90 && mark > 70) {
			System.out.println("FIRST CLASS");
		} else if (mark <= 70 && mark > 50) {
			System.out.println("SECOND CLASS");
		} else if (mark <= 50 && mark > 30) {
			System.out.println("THIRD CLASS");
		} else if (mark <= 30 && mark > 10) {
			System.out.println("FAIL");
		}
	}
}