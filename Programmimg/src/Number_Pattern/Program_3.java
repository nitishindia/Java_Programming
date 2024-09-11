package Number_Pattern;

public class Program_3 {

	public static void main(String[] args) {
		
		int n = 4;
		int sum = 1;
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(sum<=9) {
				System.out.print(sum+"  ");
				sum++;
				}
				else {
					System.out.print(sum+" ");
					sum++;
				}
			}
			System.out.println();
		}

	}

}


