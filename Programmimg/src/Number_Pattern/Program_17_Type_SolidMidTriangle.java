package Number_Pattern;

public class Program_17_Type_SolidMidTriangle {

	public static void main(String[] args) {
		
		int n = 3;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n*2-1; j++) {
				if(i+j>=n+1 && j-i<=n-1) {
					System.out.print(i);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
