package SunnyNumber;

public class SunnyNo1 {

	public static void main(String[] args) {
		
		int n = 24;
		int n1 = n+1;
		
		for(int i=1; i<=n; i++) {
			if(i*i==n1) {
				System.out.println(n+" "+"is sunny number");
			}
		}
	}
}
