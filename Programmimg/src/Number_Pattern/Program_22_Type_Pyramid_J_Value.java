package Number_Pattern;

public class Program_22_Type_Pyramid_J_Value {

	public static void main(String[] args) {
		
		int n = 4;
		int num=1;
		for(int i=1; i<=n; i++) {
			int sum=n+1;
			for(int j=1; j<=n*2-1; j++) {
				if(i+j>=n+1 && j-i<=n-1 && i+j==sum) {
					System.out.print(num+" ");
					sum=sum+2;
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
