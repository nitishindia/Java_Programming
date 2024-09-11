package String_Programs;

public class Program_6_Type_CountNumericAndAlphabetsOfString {

	public static void main(String[] args) {
		
		String s = "JaVa123".toUpperCase();
		//String s1 = s.toUpperCase();
		int alpha=0;
		int num=0; 
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z') {
				alpha++;
			}
			else if (ch>='0' && ch<='9'){
				num++;
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		
	}
}
