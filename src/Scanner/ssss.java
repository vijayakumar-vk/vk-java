package Scanner;

import java.util.Scanner;

public class ssss {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name id and salary");

		//String input
		String name= s.nextLine();
		
		System.out.println(name);

		//Integer input
		int id=s.nextInt();
		System.out.println(id);
		//double input
		double salary=s.nextDouble();
		System.out.println(salary);



	}

}
