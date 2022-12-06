package zz__String_Practice__zz;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="did";
		String rev="";
		for(int i=s.length()-1; i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if (s.equalsIgnoreCase(rev)) { //Remember to compare string not use ==
			System.out.println("Yes Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
