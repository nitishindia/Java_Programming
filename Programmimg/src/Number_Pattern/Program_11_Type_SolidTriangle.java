package Number_Pattern;

public class Program_11_Type_SolidTriangle {

	public static void main(String[] args) {
		
		int n = 4;
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=1; j--) {
				if(i<=j) {
					System.out.print(j+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
