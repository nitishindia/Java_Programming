package String_Programs;

public class Program_4_Type_CheckGivenNumber_Palindrom {

	public static void main(String[] args) {
		
		String s = "MADAM";
		String s1 = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			char ch = s.charAt(i);
			s1 = s1 + ch;
		}
		//if(s==s1)
        if(s.equals(s1))
		{
			System.out.println("Palindrom Number");
		}
		else {
			System.out.println("Not palindrom Number");
		}

	}

}
