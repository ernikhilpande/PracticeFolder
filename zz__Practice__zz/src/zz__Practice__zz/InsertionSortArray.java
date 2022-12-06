package zz__Practice__zz;

public class InsertionSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {30,00,40,50,20};
		for (int i = 1; i < a.length; i++) {
			int temp=a[i];
			int j=i;
			while(j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j=j-1;	
			}
			a[j]=temp;	
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
