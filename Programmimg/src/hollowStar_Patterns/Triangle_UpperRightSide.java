package hollowStar_Patterns;

public class Triangle_UpperRightSide {

	public static void main(String[] args) {
		int n = 4;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(j==4||i==1||i==j) {
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
