package zz__Practice__zz;
class p1
{
	static void sheela() {
		System.out.println("Super class P1");
	}
}
class p2 extends p1
{
	static void sheela() {
		System.out.println("Sub class P2");
	}
}

public class compile_polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p1 ref1=new p1();
		ref1.sheela();
		
		p2 ref2=new p2();
		ref2.sheela();
		
		p1 ref3=new p2(); //Depends on ref var.
		ref3.sheela();		//Not depends on obj creation
		
	}

}
