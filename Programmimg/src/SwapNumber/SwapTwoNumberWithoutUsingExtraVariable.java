package SwapNumber;

public class SwapTwoNumberWithoutUsingExtraVariable {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 30;
		
		a = a+b; //50
		b = a-b; //20
		a = a-b; //30
		
		System.out.println(a);
		System.out.println(b);
	}
}
