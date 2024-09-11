package Character_Patterns;

public class eg1 {

	public static void main(String[] args) {
		int n=4;
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			int sum=n+1;
			for(int j=1;j<=n*2-1;j++)
			{
				if(i+j>=n+1&&j-i<=n-1&&i+j==sum)
				{
					System.out.print(ch+" ");
					ch++;
					sum+=2;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
