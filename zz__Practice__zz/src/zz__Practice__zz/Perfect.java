package zz__Practice__zz;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		
		System.out.println("Enter number to check if it is perfect or not");
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int sc1 = sc.nextInt();
		System.out.println(sc1);
		
		for(int i=1; i<sc1;i++) {
			
			if (sc1 % i ==0) {
				sum=sum+i;
			}
		}
		if (sum==sc1) {
			System.out.println("Perfect num");
		}
		else {
			System.out.println("Not a perfect num");
		}
		
	}

}
