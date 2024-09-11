package ARM_StrongNumber;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int n= 153;
		int count = 0;
		int temp1 = n;
		int temp2 = n;
		while (temp1!=0) {
			temp1= temp1/10;
			count++;
		}
		int r;
		int arm=0;
		while (temp2!=0) {
			int mult=1;
			r=temp2%10;
			for(int i=1; i<=count; i++) {
				mult = mult*r;
			}
			arm = arm + mult;
			temp2 = temp2/10;
		}
		if(arm==n) {
			System.out.println("Armstong Number");
		}
		else {
			System.out.println("not Armstrong Number");
		}
	}

}
