package zz__String_Practice__zz;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="India";
		String rev="";
		for(int i=s.length()-1; i>=0; i-- ) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
