package Array_Programing;

public class Program_22_Type_Find2ndMinNumber_InArray {

	public static void main(String[] args) {
		
		int a [] = {2,3,5,4,1,5,7,6};
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		int min = max;
		int secmin = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]<min) {
				secmin=min;
				min=a[i];
			}
			else if(a[i]<secmin && a[i]!=min) {
				secmin=a[i];
			}
		}
		System.out.println(secmin);
	}

}
