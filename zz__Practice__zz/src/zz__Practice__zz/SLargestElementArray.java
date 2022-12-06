package zz__Practice__zz;

public class SLargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a  = {4,2,1,5,3};
		int large=Integer.MIN_VALUE;
		int slarge=Integer.MIN_VALUE;
		for(int i=0; i<a.length;i++) {
			if (a[i]>large) {
				slarge=large;
				large=a[i];
			}
			if (a[i]>slarge && a[i] != large) {
				slarge=a[i];
			}
		}
		System.out.println("Large element :"+large);
		System.out.println("SLarge element :"+slarge);
	}

}
