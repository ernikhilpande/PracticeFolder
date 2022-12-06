package zz__Practice__zz;

public class Widening {
	
	public static void name(long a) {
		System.out.println("long");
	}
	public static void name(int a) {
		System.out.println("int");
	}
	public static void name(double a) {
		System.out.println("double");
	}
	public static void main(String[] args) {
		name('c');
	}
}
