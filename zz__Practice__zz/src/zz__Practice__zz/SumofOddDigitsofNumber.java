package zz__Practice__zz;

public class SumofOddDigitsofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int n=3245;
		while(n!=0) {
			int d=n%10;
			if(d%2!=0) {
				sum=sum+d;
			}
			n=n/10;
		}
		System.out.println(sum);
		
	}

}
