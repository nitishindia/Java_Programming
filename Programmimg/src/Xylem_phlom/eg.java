package Xylem_phlom;

public class eg {
public static void main(String[] args) {
	int n=1234;
	int n1=n;
	int count=0;
	int s1=0;
	int s2=0;
	while(n>0)
	{
		n=n/10;
		count++;
	}
	for(int i=1;i<=count;i++)
	{
		int r=n1%10;
		if(i==1||i==count)
		{
			s1=s1+r;
		}
		else
		{
			s2=s2+r;
		}
		n1=n1/10;
	}
	if(s1==s2)
	{
		System.out.println("it is xylem");
		
	}
	else
	{
		System.out.println("it is phlom");
	}
}
}
