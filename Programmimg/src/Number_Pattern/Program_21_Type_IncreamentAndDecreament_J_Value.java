package Number_Pattern;

public class Program_21_Type_IncreamentAndDecreament_J_Value {

	public static void main(String[] args) {
		
		int n=3;
		
		for(int i=1; i<=n; i++) {
			int num = i;
			for(int j=1; j<=n*2-1; j++) {
				if(i+j>=n+1 && j-i<=n-1) {
					System.out.print(num);
					if(j<n){
						num--;
					}
					else {
						num++;
					}
				}
				else {
					System.out.print(" ");
				  }
			}
			System.out.println();
		}
	}
}
