package zz__Practice__zz;

public class SumofEevenElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,3,5,2,8};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i] % 2==0) {
			sum=sum+a[i];
		}	
	}
		System.out.println(sum);
  }
}
