package zz__Practice__zz;

class Emp{
	int id;
	String name;
	double sal;
	
	Emp(int id,String name,double sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	@Override
	public String toString() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
		
		return"";
	}
}

	public class Object_methods {
	
	public static void main(String[] args) {
		Emp ref=new Emp(13,"nik",500.6);
		System.out.println(ref);
		
		
	}
	
}
