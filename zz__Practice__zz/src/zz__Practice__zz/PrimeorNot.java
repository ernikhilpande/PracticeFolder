package zz__Practice__zz;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 28;
		int count = 0;
		for (int i=1; i<=n; i++)
		{
			if(n % i==0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime no it is");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}

}
