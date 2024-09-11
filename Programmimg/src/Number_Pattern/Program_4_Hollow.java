package Number_Pattern;

public class Program_4_Hollow {

	public static void main(String[] args) {

		int n=4;
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i==1 || j==1 || i==n || j==n) {
					System.out.print(i+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
