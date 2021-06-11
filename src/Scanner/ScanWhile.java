package Scanner;

import java.util.Scanner;

public class ScanWhile {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the subject");
		String Sub = "";
		while (!Sub.equals("selenium")) {
			Sub = s.nextLine();
			System.out.println("the subject is not correct");

		}
		// System.out.println("the subject is correct");

	}

}
