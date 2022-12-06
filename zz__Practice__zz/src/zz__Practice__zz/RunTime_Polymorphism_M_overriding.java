
package zz__Practice__zz;
class p11
{
	void sheela() {
		System.out.println("Super class P1");
	}
}
class p22 extends p11
{
	void sheela() {
		System.out.println("Sub class P2");
	}
}

public class RunTime_Polymorphism_M_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p11 ref1=new p11();
		ref1.sheela();
		
		p22 ref2=new p22();
		ref2.sheela();
		
		p11 ref3=new p22(); //NOT Depends on ref var.
		ref3.sheela();		//Depends on obj creation
		
	}

}

