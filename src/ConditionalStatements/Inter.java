package ConditionalStatements;

import Interface.domain;

public class Inter implements domain {
int a = 10;
int b = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Inter i = new Inter();
i.add();
i.sub();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int c = a+b;
		System.out.println(c);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int c = a-b;
		System.out.println(c);
	}
	

	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		int c = a*b;
		System.out.println(c);
	
	}

}
