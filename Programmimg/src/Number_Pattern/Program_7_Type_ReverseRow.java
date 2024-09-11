package Number_Pattern;

public class Program_7_Type_ReverseRow {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
