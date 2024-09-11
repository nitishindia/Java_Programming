package String_Programs;

public class Program_3_Type_ReverseString {

	public static void main(String[] args) {
		
		String s = "JAVA";
		String s1 = "";
		for(int i=s.length()-1; i>=0; i--) {
			char ch = s.charAt(i);
			s1 = s1+ch;
		}
		System.out.print(s1);
	}

}
