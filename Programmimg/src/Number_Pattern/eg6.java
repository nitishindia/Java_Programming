package Number_Pattern;

public class eg6 {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++)
		{
			char ch='A';
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1||j==n||i==n)
				{
					System.out.print(ch+" ");
					ch++;
				}
				
				else
				{
					System.out.print("  ");
					ch++;
				}
			}
			System.out.println();
		}
	}
}
