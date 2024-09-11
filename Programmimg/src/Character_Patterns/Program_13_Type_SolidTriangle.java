package Character_Patterns;

public class Program_13_Type_SolidTriangle {

	public static void main(String[] args) {
		
		int n =3;
		char ch = 'A';
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n*2-1; j++) {
				if(i+j>=n+1 && j-i<=n-1) {
				System.out.print(ch+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			ch++;
		}
	}
}
