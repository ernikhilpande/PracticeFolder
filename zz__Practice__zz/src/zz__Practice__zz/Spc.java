package zz__Practice__zz;

public class Spc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=49;
		int temp=n;
		int sum=0;
		int multi=1;
		while(n != 0) {
			int d=n%10;
			n=n/10;
			sum=sum+d;
			multi=multi*d;
			
		}
		int add=sum+multi;
		if(add==temp) {
			System.out.println("special num");
		}
		else {
			System.out.println("Not special");
		}

	}

}
