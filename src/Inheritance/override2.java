package Inheritance;

public class override2 extends Override1 {
	public  void cal() {
		System.out.println("sending love" );
		super.cal();
	}
	public static void main(String[] args) {
    override2 o = new override2();
    o.cal();
	}

}
