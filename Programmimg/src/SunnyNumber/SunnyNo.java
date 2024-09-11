package SunnyNumber;

public class SunnyNo {

	public static void main(String[] args) {
		
		int n = 11;
		int n1 = n+1;
		
		for (int i=1; i<=n1; i++) {
			if(i*i==n1) {
				System.out.println(n+" "+"is sunny number");
			}
			else if(i==n)
			{
				System.out.println(n+" "+"is not sunny number");
			}
		}	
	}

}
