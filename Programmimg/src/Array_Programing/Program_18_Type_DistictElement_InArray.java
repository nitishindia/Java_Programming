package Array_Programing;

public class Program_18_Type_DistictElement_InArray {

	public static void main(String[] args) {
	//	System.out.println(Integer.MIN_VALUE);     // just checking the value of "Integer.MIN_VALUE"
		
		int a[] = {1,2,2,3,4,3,5};
		for(int i=0; i<a.length; i++) {
			int count=0;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				//	a[j]=-1;				// Static way because may be in Array we get element as -1 that's way
					a[j]=Integer.MIN_VALUE;	// Universal way
					
				}
			}
		//	if(count==0 && a[i]!=-1) 
			if(count==0 && a[i]!=Integer.MIN_VALUE) 
			{
			System.out.println(a[i]);
			}
		}
	}
}
