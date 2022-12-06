package zz__Practice__zz;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=23232;
		int temp=n;
		int rev=0;
		while(n != 0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("Yes Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
