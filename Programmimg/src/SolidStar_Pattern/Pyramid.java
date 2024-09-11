package SolidStar_Pattern;

public class Pyramid {

	public static void main(String[] args) {
		
		int n=3;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n*2-1; j++) {
				if(i<=j&&j+i<=n*2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
