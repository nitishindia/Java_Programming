package Number_Pattern;

public class eg2 {

	public static void main(String[] args) {
		int n=4;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			int sum=n+1;
			for(int j=1;j<=n*2-1;j++)
			{
				if(i+j>=n+1&&j-i<=n-1&&i+j==sum)
				{
				System.out.print(count+" ");
				count++;
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
