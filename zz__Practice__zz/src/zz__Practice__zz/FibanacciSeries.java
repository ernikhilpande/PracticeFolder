package zz__Practice__zz;

public class FibanacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1; i<=8; i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
