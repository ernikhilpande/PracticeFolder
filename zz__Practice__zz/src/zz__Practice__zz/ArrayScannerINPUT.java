package zz__Practice__zz;

import java.util.Scanner;

public class ArrayScannerINPUT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in); //to import scanner
		System.out.println("Enter the size of array");
		int n=sc.nextInt(); //store the input of user
		int a[]=new int[n]; //size known. Array creation by new keyword
		
		for(int i=0; i<a.length; i++) { //for array index
			System.out.println("Enter elements of array");
			
			a[i]=sc.nextInt(); //Because again user input expected.
			
		}
		System.out.println("Array elements are");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
