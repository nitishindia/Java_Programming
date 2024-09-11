package Number_Pattern;

public class eg4 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int num=i;
			for(int j=1;j<=n;j++)
			{
				System.out.print(num+" ");
				num+=n;
			}
			System.out.println();
		}
	}
}