package String_Programs;

import java.util.Arrays;

public class Program_11_Type_AnagramProgram {

	public static void main(String[] args) {
		
		String s = "pot";
		String s1 = "top";
		
		
		if(s.length()!=s1.length()) {
			System.out.println("not Anagram");
		}
		else {
			char[] ch = s.toCharArray();
			char[] ch1 = s1.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			System.out.println(ch);
			System.out.println(ch1);
			
			boolean flag = false;
			for(int i=0; i<ch.length; i++) {
				if(ch[i]==ch1[i]) {
					flag=true;
				}
				else {
					flag=false;
					break;
				}
			}
				if(flag==true) {
					System.out.println("It is Anagram");
				}
				else {
					System.out.println("It is Not Anagram");
				}
				
		}
	}
}
