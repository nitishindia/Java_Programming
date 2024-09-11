package Practice;

public class Xylam_Phloam {

	public static void main(String[] args) {
		
		int n=12345;
		int l=n%10;
		n=n/10;
		
		int InnerSum = 0;
		
		while(n>9) {
		int	d=n%10;
		InnerSum = InnerSum + d;
		n=n/10;
		}
		int OuterSum = l+n;
		
		if(InnerSum==OuterSum) {
			System.out.println("Xylam Number");
		}
		else {
			System.out.println("phloem number");
		}

	}

}
