package SqureRootNumber;

public class BooleanFlag {

	public static void main(String[] args) {
		
		boolean flag = false;
		int n = 4;
		for (int i=1; i<=n; i++) {
			if(i*i==n) {
				flag=true;
				System.out.println(i);
			}
		}
		if (flag==false)
		{
			System.out.println(n+" "+"not spiral number");
		}
	}

}
