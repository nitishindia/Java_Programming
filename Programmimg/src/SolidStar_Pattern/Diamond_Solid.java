package SolidStar_Pattern;

public class Diamond_Solid {

	public static void main(String[] args) {
		
		int n=3;
		
		for(int i=1; i<=n*2-1; i++) {
			for(int j=1; j<=n*2-1; j++) {
				if(j-i<=n-1 && i+j>=n+1 && i+j<=3*n-1 && i-j<=n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
