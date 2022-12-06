package zz__Practice__zz;

public class BinarySearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {9,12,26,33,46,55};
		int search=55;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		while(li<=hi) {
			if(search==a[mi]) {
				System.out.println("element present at index "+mi);
				break;
			}
			else if(search>a[mi]) {
				li=mi+1;
			}
			else if(search<a[mi]) {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}

	}

}
