package Character_Patterns;

public class Program_7_Type_SolidTriangle {

	public static void main(String[] args) {

		int n =4;
		char ch = 'A';
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j<=n+1) {
					System.out.print(ch+" ");
				}
			}
			System.out.println();
			ch++;
		}

	}

}
