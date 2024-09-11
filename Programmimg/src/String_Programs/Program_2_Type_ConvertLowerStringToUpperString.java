package String_Programs;

public class Program_2_Type_ConvertLowerStringToUpperString {

	public static void main(String[] args) {
		
		String s = "nitiSH";
		String s1 = "";
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				int assci = ch - 32;
				char ch1 = (char) assci;
				s1 = s1 +ch1;
			}
			else {
				s1=s1+ch;
			}
		}
		System.out.println(s1);
	}
}
