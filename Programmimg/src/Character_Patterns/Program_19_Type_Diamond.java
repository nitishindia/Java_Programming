package Character_Patterns;

public class Program_19_Type_Diamond {

	public static void main(String[] args) {
		
		int n =3;
		for(int i=1; i<=n*2-1; i++) {
			char ch = 'A';
			for(int j=1; j<=n*2-1; j++) {
				if(i+j>=n+1 && i-j<=n-1 && i+j<=n*3-1 && j-i<=n-1) {
					if(j<n) {
					System.out.print(ch+" ");
					ch++;
					}
					else {
						System.out.print(ch+" ");
						ch--;
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
