package zz__Practice__zz;

public class Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Auto Unboxing
		Integer i=20; //non pri var
		int a=i; //non pri to pri conversion
		System.out.println(a);
		
		//Explicit Unboxing
		
		int b=i.intValue();
		System.out.println("b"+b);

	}

}
