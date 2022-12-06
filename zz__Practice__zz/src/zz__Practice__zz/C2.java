package zz__Practice__zz;

abstract class C1
{
	
	abstract public void login(); // This is always NON-Static bcoz we can't override static m
	{
		// NO Body or implementation.
	}
	
	public void insta() // Abstract class can have concrete methods
	{
		System.out.println("Insta method");
	}
}


class C2 extends C1
{
	public void login()  // concrete class cannot have Abstract methods.
	{
		System.out.println("concreate........");
	}
	
	
	// Main Method
	public static void main(String[] args) 
	{
		C1 ref=new C2(); // Can create ref var for abstract method but can't create object.
		ref.login();
		ref.insta();
		
	}

}
