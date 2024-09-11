package String_Programs;

public class Program_12_Type_CountOccuranceOfCharacter {

	public static void main(String[] args) {
		
		String s = "apple";
//		String s1 = "";
//		for(int i=0; i<s.length(); i++) {
//			char ch = s.charAt(i);
//			int count=1;
//			
//			if(s1.indexOf(ch)==-1) {
//				for(int j=i+1; j<s.length(); j++) {
//					char ch1 = s.charAt(j);
//					if(ch==ch1) {
//						count++;
//					}
//				}
//			System.out.println(ch+"-"+count);
//			s1=s1+ch;
//			
//			}
//		}
//	}
//}

		
		
		char[] ch =s.toCharArray();
		for(int i=0; i<ch.length; i++) {
			int count=1;
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]=' ';
				}
			}
			if(count>=1 && ch[i]!=' ') {
			System.out.println(ch[i]+"-"+count);
			}
		}	
	}
}
		