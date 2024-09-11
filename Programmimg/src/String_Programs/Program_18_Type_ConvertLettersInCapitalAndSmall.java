package String_Programs;

public class Program_18_Type_ConvertLettersInCapitalAndSmall {

	public static void main(String[] args) {
		
		String s = "Programming";
		String res ="";
		for(int i=0; i<s.length(); i++) {
			char ch =s.charAt(i);
			
			if(i%2==0 && ch>='a' && ch<='z') {
				int a = ch;
				char ch1 = (char) (a-32);
				res=res+ch1;
			}
			else {
				res=res+ch;
			}
		}
		System.out.println(res);
	}
}
