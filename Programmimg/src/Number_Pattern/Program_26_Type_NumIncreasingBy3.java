package Number_Pattern;

public class Program_26_Type_NumIncreasingBy3 {

	public static void main(String[] args) {
		
		int n=4;
		
		for(int i=1; i<=n; i++) {
			int num = i;
			for(int j=1; j<=n; j++) {
				System.out.print(num+" ");
				num=num+n;
			}
			System.out.println();
		}

	}

}
