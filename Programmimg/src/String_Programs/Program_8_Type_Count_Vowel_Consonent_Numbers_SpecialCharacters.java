package String_Programs;

public class Program_8_Type_Count_Vowel_Consonent_Numbers_SpecialCharacters {

	public static void main(String[] args) {
		
		String s = "java@program123";
	//	String s1=s.toLowerCase();
		int v=0, c=0, n=0, sc=0;
		
		for(int i=0; i<s.length(); i++) {
			 char ch = s.charAt(i);
			 if(ch>='a' && ch<='z')
		 {
			 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				 v++;
			 }
			 else {
				 c++;
			 }
		 }
			 
			 else if(ch>='0' && ch<='9') {
				 n++;
			 }
			 else {
				 sc++;
			 }
		}
		System.out.println("count of vowel = "+ v);
		System.out.println("count of consonent ="+ c);
		System.out.println("count of number ="+n);
		System.out.println("count of special character ="+sc);

	}

}
