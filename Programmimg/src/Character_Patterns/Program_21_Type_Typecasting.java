package Character_Patterns;

public class Program_21_Type_Typecasting {

	public static void main(String[] args) {
		
		int n = 4;
		char ch = 'A';
		for(int i=1; i<=n; i++) {
			char ch1 = ch;
			int  a = ch1;
			for(int j=1; j<=n; j++) {
				System.out.print(ch1+" ");
				a = a+n;
				ch1 = (char) a;
			}
			System.out.println();
			ch++;
		}
	}
}
