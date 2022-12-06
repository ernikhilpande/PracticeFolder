package zz__Practice__zz;

public class smallestElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a  = {4,2,1,5,3};
		int small=Integer.MAX_VALUE;
		for(int i=0; i<a.length;i++) {
			if (a[i]<small) {
				small=a[i];
			}
		}
		System.out.println("smallest element : "+ small);

	}

}
