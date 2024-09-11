package SolidStar_Pattern;

public class Rhombus {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n*2-1; j++) {
		//		if(i-j<=n-3 && j-i<=n-1)   // this one for static way for rhombus if have n=3
				if(i<=j && j-i<=n-1) 	   // this one for Dynamic way for rhombus if have any value for 'n'. like n=2,3,4,5.....
				{
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
