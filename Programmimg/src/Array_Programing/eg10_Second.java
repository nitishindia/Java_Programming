package Array_Programing;

public class eg10_Second {

	public static void main(String[] args) {
	
		int [] a= {6,3,5,6,4,3,6};
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		int max=min;
		int secmax=0;
		for(int i=0;i<a.length; i++)
		{
			if(a[i]>max)
			{
				secmax=max;
				max=a[i];
			}
			else if(a[i]>secmax && a[i]!=max)
			{
				secmax=a[i];
			}
		}
		System.out.println(secmax);
		
		

	}

}
