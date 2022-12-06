package array;

public class Bubble_Sort {
	
	public static void main(String[] args) {
		int a [] = {8,10,1,3,2};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}

	}

}
