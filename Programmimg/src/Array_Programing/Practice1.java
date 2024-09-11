package Array_Programing;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Size of Array");
//		int a[] = new int[s.nextInt()];
//		System.out.println("Enter the elememt in Array");
//		for(int i=0; i<a.length; i++) {
//			
//			a[i]= s.nextInt();
//		}
//		for(int i=0; i<a.length; i++) {
//			System.out.print(a[i]);
//		}

		
		int a[] = {1,3,4,5,6};
		int b[] = new int[a.length+1];
		int ind = 1;
		int ele = 2;
		int num = 0;
		for(int i=0; i<b.length; i++) {
			if(i==ind) {
			b[i]=ele;
			}
			else {
				b[i]=a[num++];
			}
		}
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]);
		}
		
	}

}
