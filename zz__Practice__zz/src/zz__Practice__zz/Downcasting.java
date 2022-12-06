package zz__Practice__zz;

class fruit
{
	int i=10;
	void trial() {
		System.out.println("fruit menthod");
	}
}
class mango extends fruit
{
	int j=20;
	void trial() {
		System.out.println("mango menthod");
	}
}

public class Downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		fruit f = new mango(); // UPCASTING
		System.out.println(f.i);
		f.trial();
		
		mango m = (mango) f; // DOWNCASTING
		System.out.println(m.i);
		System.out.println(m.j);
		m.trial();		
	}
}
