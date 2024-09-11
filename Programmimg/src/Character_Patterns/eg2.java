package Character_Patterns;

public class eg2 {

	public static void main(String[] args) {
		int n=5;
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			char ch1=ch;
			for(int j=1;j<=n;j++)
			{
				System.out.print(ch1+" ");
				ch1=(char) (ch1+n);
			}
			ch++;
			System.out.println();
		}
	}
}
