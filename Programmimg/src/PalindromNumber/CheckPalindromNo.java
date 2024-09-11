  package PalindromNumber;

public class CheckPalindromNo {
	
	

	public static void main(String[] args) {
		
		int n = 12321;
		int n1=n;
		 int rev = 0;
		 
		while(n>0) {
			
			int d = n%10;
			rev=rev*10+d;
			n=n/10;
		}
		
		System.out.println(rev);
		if(n1==rev) {
			System.out.println(n1+" "+"is palindrom number");
		}
		else {
			System.out.println(n1+" "+"not palindrom number");
		}	
	}
	
}
