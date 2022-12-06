package zz__Practice__zz;

import java.util.Iterator;

public class BubbbleSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]= {'a','d','n','m','x'}; //for number : int a[]
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					char temp=a[i]; //for numbers int temp
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println("Bubble sorted Array :");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	}

}
