package zz__Practice__zz;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("Before");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("After");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}

}
