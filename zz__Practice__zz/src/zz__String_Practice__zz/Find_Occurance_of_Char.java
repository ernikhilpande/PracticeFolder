package zz__String_Practice__zz;

public class Find_Occurance_of_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="meenu";
		char []c=s.toCharArray();
		boolean[]b=new boolean[c.length];
		for(int i=0; i<=s.length()-1;i++) {
			if (b[i]==false) {
				{
					int count =1;
					for(int j=i+1; j<s.length();j++) {
						if(c[i]==c[j]) {
							count++;
							b[j]=true;
						}
					}
					System.out.println(c[i]+" " +count);
				}
			}
			
		}
	}

}
