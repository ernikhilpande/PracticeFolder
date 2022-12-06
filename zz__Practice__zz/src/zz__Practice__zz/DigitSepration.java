package zz__Practice__zz;

public class DigitSepration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=23101997;
		while (n!=0) {
			int d = n%10;
			n=n/10;
			System.out.print(d+" ");
		}
		
	}

}
