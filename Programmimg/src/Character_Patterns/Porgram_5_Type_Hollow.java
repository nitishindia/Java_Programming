package Character_Patterns;

public class Porgram_5_Type_Hollow {

	public static void main(String[] args) {
		
		int n = 4;
		
		for(int i=1; i<=n; i++) {
			char ch = 'A';
			for(int j=1; j<=n; j++) {
			
			if(j==1 || j==n || i==1 || i==n) {
				System.out.print(ch+" ");
				ch++;
			}
			else {
				System.out.print("  ");
				ch++;	
			}
		}
			System.out.println();
			
	}

	}

}
