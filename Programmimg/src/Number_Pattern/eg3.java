package Number_Pattern;

public class eg3 {


	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=2*n-1;i++)
		{
			int count=1;
			for(int j=1;j<=2*n-1;j++)
			{
				if(i+j>=n+1&&j-i<=n-1&&i+j<=3*n-1&&i-j<=n-1)
				{
					System.out.print(count+" ");
					if(j<n)
					{
						count++;
					}
					else
					{
						count--;
					}
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
