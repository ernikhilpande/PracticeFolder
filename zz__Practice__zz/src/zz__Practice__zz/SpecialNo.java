package zz__Practice__zz;

public class SpecialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=49;
		int sum=0;
		int multi=1;
		int temp=n;
		
		while(n != 0) {
			int d= n % 10;
			n=n/10;
			sum=sum+d;
			multi=multi*d;
		}
		int rev=sum+multi;
		if(rev==temp) {
			System.out.println("Yes Special num");
		}
		else {
			System.out.println("Not special num");
		}
	}

}
