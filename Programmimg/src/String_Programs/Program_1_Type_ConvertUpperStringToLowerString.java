package String_Programs;

public class Program_1_Type_ConvertUpperStringToLowerString {

	public static void main(String[] args) {
		
		String s = "NITIsh";
		String s1 = "";
		
		for(int i=0; i<s.length(); i++ ) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z') {
			int	assci=ch+32;
			char ch1 = (char) assci;
				s1=s1+ch1;
			}
			else {
				s1=s1+ch;
			}
		}
		System.out.print(s1);
	}
}


//			String s = "NITIsh";
//			String s1 = "";
//			char[]	ch = s.toCharArray();
//			for(int i=0; i<s.length(); i++ ) {
//				
//				if(ch[i]>='A' && ch[i]<='Z') {
//				int	assci=ch[i]+32;
//				char ch1 = (char) assci;
//					s1=s1+ch1;
//				}
//				else {
//					s1=s1+ch[i];
//				}
//			}
//			System.out.print(s1);
//			}
//		}
