package zz__Practice__zz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class aaa {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Progra Begin");
		
		try 
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a/b);
		}
		
		
		catch (ArithmeticException ae) 
		{
			// TODO: handle exception
		System.out.println("AE handeled");
		}
		catch (InputMismatchException ie) {
			// TODO: handle exception
			System.out.println("IM handeled");
		}
		System.out.println("Prog ends");
		

	}

}
