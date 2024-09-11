package String_Programs;

public class Program_10_Type_PrintPattern {

	public static void main(String[] args) {
		
		String s = "NITISH";
		for(int i=0; i<s.length(); i++) {
		 char ch = s.charAt(i);
		 
		 for(int j=0; j<s.length(); j++) {
			if(i>=j) {
				System.out.print(ch+" ");
			}
			else {
				System.out.print("  ");
			}
		 }
		 System.out.println();
		}
	}
}
