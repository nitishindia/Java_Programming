package String_Programs;

public class Program_7_Type_SeperateAlphabetsAndNumbersOfString {

	public static void main(String[] args) {
		
		String s = "a1b2c3";
		String alpha = "";
		String num = "";
		
		for(int i=0; i<s.length(); i++) {
			 char ch = s.charAt(i);
			 if(ch>='a' && ch<='z') {
				 alpha = alpha + ch;
			 }
			 else if(ch>='0' && ch<='9') {
				 num = num + ch;
			 }
		}
//		System.out.println(alpha);
//		System.out.println(num);
		System.out.println(alpha+num);
	}

}
