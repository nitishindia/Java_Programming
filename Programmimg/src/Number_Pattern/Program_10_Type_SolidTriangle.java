package Number_Pattern;

public class Program_10_Type_SolidTriangle {

	public static void main(String[] args) {
		
		int n = 4;
		 for(int i=n; i>=1; i--) {
			 for(int j=1; j<=n; j++) {
				 if(i+j<=n+1) {
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