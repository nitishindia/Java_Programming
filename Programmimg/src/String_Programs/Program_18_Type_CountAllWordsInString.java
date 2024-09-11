package String_Programs;

public class Program_18_Type_CountAllWordsInString {

	public static void main(String[] args) {
		
		String s = "hello hi hello hi bye";
		String[] s1 = s.split(" ");
		
		for(int i=0; i<s1.length; i++) {
			String w = s1[i];
			int count = 1;
			for(int j=i+1; j<s1.length; j++) {
				if(w.equals(s1[j])) {
					count++;
					s1[j]="-1";
				}
			}
		    if(count>=1 && s1[i]!="-1") {
			System.out.println(w+"-"+count);
		    }
		}
	}
}
