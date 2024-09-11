package Array_Programing;

import java.util.Arrays;

public class Program_23_Type_SearchElementInArrayByUsing_BinarySearchTechnic {

	public static void main(String[] args) {
		
		int a [] = {5,6,9,12,19,20,1,6,4};
		Arrays.sort(a);
//		for(int i=0; i<a.length; i++) {
//		System.out.print(a[i]+" ");
//		}
		
		int l = 0, h=a.length;
		int mid = 0, t=4;
		
		boolean flag = false;
		while(l<=h) {
			mid = (l+h)/2;
			if(t==a[mid]) {
				flag=true;
				System.out.println(t+" = Target is present");
				break;
			}
			else if (t<a[mid]) {
				h=mid-1;
			}
			else if (t>a[mid]) {
				l=mid+1;
			}
		}
		if(flag==false) {
			System.out.println("Target is not present");
		}
	}

}
