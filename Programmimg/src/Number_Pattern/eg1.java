package Number_Pattern;

public class eg1 {
	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++)
		{
			int count=i;
			for(int j=1;j<=n*2-1;j++)
			{
				if(i+j>=n+1&&j-i<=n-1)
				{
					System.out.print(count+" ");
					if(j<n)
					{
						count--;
					}
					else
					{
						count++;
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
