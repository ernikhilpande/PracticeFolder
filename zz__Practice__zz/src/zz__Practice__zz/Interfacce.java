package zz__Practice__zz;

interface I1{
	void test();
	
}
	
interface I2{
	void test();
}

class c implements I1,I2{
	public void test()
	{
		System.out.println("Providing body or Implementation");
	}
}

public class Interfacce{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I1 ref1=new c(); //here method is over
		ref1.test();
	}

}

