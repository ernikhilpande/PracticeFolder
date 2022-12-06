package zz__Practice__zz;

public class PrintEvenDigitsfromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123456789;
		while(n!=0) {
			int d = n%10;
			if(d%2==0) {
				System.out.print(d+" ");
			}
			n=n/10;
		}
	}

}
