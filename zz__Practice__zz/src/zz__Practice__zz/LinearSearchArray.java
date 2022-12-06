package zz__Practice__zz;

public class LinearSearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {29,18,83,00,18,62};
		int search=18;
		int count=1; //take it if duplicates in array
		boolean b = false;
		for (int i = 0; i < a.length; i++) {
			if(search==a[i]) {
				System.out.println(search + " Element is present @ index "+i);
				b=true;
				count++; //only for duplicates
				//break; //only for No duplicates
			}
		}
		if(b==false) {
			System.out.println("Element Not Present in Array");
		}
	}

}
