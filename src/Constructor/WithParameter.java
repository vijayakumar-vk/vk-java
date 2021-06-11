package Constructor;

public class WithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithParameter w1= new WithParameter(10,3.14);
		WithParameter w2 = new WithParameter(10);
        WithParameter w3 = new WithParameter(10,20);
        WithParameter w4 = new WithParameter(10.0,20.0);

	} 
	WithParameter(int radius,double pii) {
		System.out.println("AREA OH CIRCLE IS"+" "+(pii*radius*radius) );
	}
	WithParameter(int side) {
		System.out.println("AREA OH SQUARE IS"+" "+(side*side) );
	}
	WithParameter(int base,int height) {
		System.out.println("AREA OH TRIANGLE IS"+" "+(base*height*1/2) );
	}
	WithParameter(double length,double breadth) {
		System.out.println("AREA OH RECTANGLE IS"+" "+(length*breadth) );
	}
	

}
