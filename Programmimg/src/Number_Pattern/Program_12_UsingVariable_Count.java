package Number_Pattern;

public class Program_12_UsingVariable_Count {

	public static void main(String[] args) {
		
		int n = 4;
		
		for(int i=1; i<=n; i++) {
			int count = 1;
			for(int j=1; j<=n; j++) {
				if(i+j>=n+1) {
					System.out.print(count+" ");
					count++;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
