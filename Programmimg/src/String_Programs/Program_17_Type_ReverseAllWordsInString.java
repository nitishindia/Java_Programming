package String_Programs;

public class Program_17_Type_ReverseAllWordsInString {

	public static void main(String[] args) {
		
		String s = "java programing class";
		 String[] s1 = s.split(" ");
		 String res = "";
		 for(int i=0; i<s1.length; i++) {
			 String w = s1[i];
		     String	 rev="";
			 for(int j=w.length()-1; j>=0; j--) {
				char r = w.charAt(j);
				rev = rev+r;
			 }
			 res = res+rev+" ";
		 }
		 System.out.println(res);

	}

}
