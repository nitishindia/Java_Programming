package Character_Patterns;

public class Program_8_Type_SolidTriangle {

	public static void main(String[] args) {
		
		int n =4;
		for(int i=1; i<=n; i++) {
			char ch = 'A';
			for(int j=1; j<=n; j++) {
				if(i+j>=n+1) {
					System.out.print(ch+" ");
					ch++;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}