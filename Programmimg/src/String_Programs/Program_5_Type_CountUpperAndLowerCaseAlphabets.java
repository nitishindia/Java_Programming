package String_Programs;

public class Program_5_Type_CountUpperAndLowerCaseAlphabets {

	public static void main(String[] args) {
		
		String s = "JaVa ProGrAmmiNG";
		int UC=0, LC=0;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z') {
				UC++;
			}
			else if (ch>='a' && ch<='z') {
				LC++;
			}
		}
		System.out.println("Count of Uppercase="+UC);
		System.out.println("Count of lowercase="+LC);
	}
}
