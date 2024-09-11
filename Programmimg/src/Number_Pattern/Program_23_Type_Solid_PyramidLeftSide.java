package Number_Pattern;

public class Program_23_Type_Solid_PyramidLeftSide {

	public static void main(String[] args) {
		
		int n=3;
		for(int i=1; i<=n*2-1; i++) {
			int num=1;
			for(int j=1; j<=n; j++) {
				if(i+j>=n+1 && i-j<=n-1) {
					System.out.print(num+" ");
					num++;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
