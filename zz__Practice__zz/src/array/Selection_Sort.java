package array;

public class Selection_Sort {
	public static void main(String[] args) {
		int a [] = {8,10,1,3,2};
		
		for (int i = 0; i < a.length; i++) {
			int min=i;
			
			for (int j = i+1; j < a.length; j++) {
				if (a[j]<a[min]) {
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
