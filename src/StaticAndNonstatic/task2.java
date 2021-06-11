package StaticAndNonstatic;

public class task2 {
	 double PI = 3.142;
	 int radius = 10;
	int side = 25;
	double area = (PI*radius*radius);
	public static void main(String[] args) {
        task2.AreaOfCircle();
        task2 obj = new task2();
        obj.AreaOfSquare();
	}

	
	public static void  AreaOfCircle () {
		task2 a = new task2();
		System.out.println("AREA OF CIRCLE IS"+" "+a.area);
		
	}
	public void AreaOfSquare() {
		System.out.println("AREA OF SQUARE IS"+" "+(side*side));
		
	}
}
