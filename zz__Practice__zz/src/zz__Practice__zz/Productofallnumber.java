package zz__Practice__zz;

public class Productofallnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prod=1;
		int n=123456789;
		while(n!=0) {
			int d=n%10;
			prod=prod*d;
			n=n/10;
		}
		System.out.println(prod);
	}

}
