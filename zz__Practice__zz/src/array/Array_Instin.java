package array;

public class Array_Instin {
	
	public static void main(String[] args) {
		int a[]= {40,10,50,20,30};
		
		for (int i = 1; i < a.length; i++) {
			int temp=a[i]; //10
			int j=i-1; // 0
			
			while (j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
