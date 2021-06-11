package one;

public class Sum {
	Sum(String phone)
	{
	System.out.println("phone");	
	}

	Sum(String address,int pinnumb)
	{
		this("iphone");
		System.out.println("address and pinnumb");
	}

	Sum(int quantity,String product,double payment)
	{
		this("fgfdfh",6768);
		System.out.println("quantity product and payment");
	}

	Sum(double payment,int quantity,String product)
	{
		this(34,"laptop",78.98);
		System.out.println("payment quantity and product");
	}

	public static void main(String[] args) {
      Sum s = new Sum(7.0,10,"vij");
	}

}
