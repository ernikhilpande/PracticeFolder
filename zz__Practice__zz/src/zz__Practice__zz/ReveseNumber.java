package zz__Practice__zz;

public class ReveseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
		int rev=0;
		while(n  != 0) {
			int d=n%10;
			n=n/10;
			rev=rev*10+d;
			//System.out.print(d); Giving same O/P.
		}
		System.out.print(rev);
		
	}

}
