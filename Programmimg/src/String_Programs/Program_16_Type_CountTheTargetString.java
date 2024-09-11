package String_Programs;

public class Program_16_Type_CountTheTargetString {

	public static void main(String[] args) {
		
		String s = "hi hii hii hi hi";
		String t = "hi";
		int count=0;
		String[] s1 = s.split(" ");
		for(int i=0; i<s1.length; i++) {
			if(s1[i].equals(t)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
