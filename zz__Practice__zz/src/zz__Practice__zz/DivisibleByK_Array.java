package zz__Practice__zz;

public class DivisibleByK_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]q= {5,9,12,16,25};
		int k=6;
		int sum=0;
		for (int i = 0; i < q.length; i++) {
			sum=sum+(q[i]%k);
		}
		System.out.println(sum);

	}

}
