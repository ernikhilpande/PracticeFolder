package zz__Practice__zz;

public class SumofallDigitsofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123456789;
		int sum=0;
		while(n!=0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println(sum);

	}

}
