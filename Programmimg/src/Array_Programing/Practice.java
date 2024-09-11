package Array_Programing;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
//		int a[] = {1,2,3,4,5,6,7};
		
		// finding prime number in the array.
//		for(int i=0; i<a.length; i++) {  	
//			int num = a[i];
//			int count = 0;
//			for(int j=1; j<a.length; j++) {
//				if(num%j==0) {
//					count++;
//				}
//			}
//			if(count==2) {
//				System.out.println(num);
//			}
//		}
		
		

		// Storing one array element to another array
//		int b[] = new int[a.length];		
//		for(int i=0; i<b.length; i++) {
//			b[i] = a[i];
//			Thread.sleep(1000);
//			System.out.print(b[i]);
//		}
		
		
		
		// storing two array element in one array
//		int a[] = {1,5,4,4,2};
//		int b[] = {6,7,8,9};
//		int ar1 = 0; 
//		int ar2 = 0;
//		int c[] = new int [a.length+b.length];
//		for(int i=0; i<c.length; i++) {
//			if(ar1<a.length) {
//				c[i] = a[ar1++];
//			}
//			else {
//				c[i] = b[ar2++];
//			}
//			System.out.print(c[i]+" ");
//		}
		
		
		
		//Merge two array in a Single Array by Zig - Zag Manner
//		int a[] = {1,2,3,4,5};
//		int b[] = {6,7,8,9};
//		int ar1 = 0;
//		int ar2 = 0;
//		int c[] = new int[a.length+b.length];
//		for(int i=0; i<c.length; ) {
//			if(ar1<a.length) {
//			c[i] = a[ar1++];
//			i++;
//			}
//			if(ar2<b.length) {
//				c[i] = b[ar2++];
//				i++;
//			}
//		}
//		for (int i = 0; i < c.length; i++) {
//			System.out.print(c[i]+" ");	
//		}
		
		
		
//		// Adding two array element in Array
//		int a[] = {1,2,3,4,5};
//		int b[] = {6,7,8,2,9};
//		int ar1 = 0;
//		int ar2 = 0;
//		int c[] = new int [a.length];
//		for(int i=0; i<c.length; i++) {
//			c[i] = a[ar1++]+b[ar2++];
//		//	c[i] = a[ar1++]*b[ar2++];
//			System.out.println(c[i]);
//		}
		
		
		
		// take element in array a & b and store in array c.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Size of the array ");
//		int a[] = new int[sc.nextInt()];
//		System.out.println("Enter element in the array a");
//		for(int i=0; i<a.length; i++) {
//			a[i] = sc.nextInt();
//		}
//		
//		int b[] = new int[a.length];
//		System.out.println("Enter Element in the array b");
//		for(int j=0; j<b.length; j++) {
//			b[j] = sc.nextInt();
//		}
//		
//		int c[] = new int[a.length+b.length];
//		int num = 0;
//		int num1 = 0;
//	//	for(int k=0; k<c.length; ) {
//		
//		int k=0;
//		while(k<c.length) {
//			if(num<a.length) {
//				c[k++] = a[num++];
//			}
//			if(num1<b.length) {
//				c[k++] = b[num1++];
//			}
//		}
//		System.out.println("Printing the element of array c");
//		for(int j=0; j<c.length; j++) {
//			System.out.print(c[j]+" ");
//		}
		
		
		
		// Reverce the array element and store into another Array
//		 int a [] = {1,2,3,4,5};
//		 int b [] = new int[a.length];
//		 int num = 0;
//		 for(int i=a.length-1; i>=0; i--) {
//			b[num++] = a[i];
//		 }
//		 for(int i=0; i<b.length; i++) {
//		System.out.print(b[i]);
//		 }
		
		
		
		// check the given number is palendrom number or not
	
//		int a[] = {1,2,3,2,1};
//		int b[] = new int[a.length];
//		int num=0;
//		for(int i=a.length-1; i>=0; i--) {
//			b[num++] = a[i];	
//		}
//		boolean flag = false;
//		for(int i=0; i<a.length; i++) {
//		//	System.out.print(b[i]);
//			if(a[i] == b[i]) {
//				flag=true;
//			}
//			else {
//				flag=false;
//				break;
//			}
//		}
//		if(flag == true) {
//			System.out.println("palendrom number");
//		}
//		else {
//			System.out.println("not palendrom number");
//		}
		
		
		// insert element base on the index value of Array
//		int a[] = {1,3,4,5,6};
//		int b[] = new int[a.length+1];
//		int ele=2;
//		int ind = 1;
//		int num = 0;
//		for(int i=0; i<=b.length-1; i++) {
//			if(i==ind) {
//				b[i]=ele;
//			}
//			else {
//				b[i]=a[num++];
//			}
//		}
//		for(int i=0; i<b.length; i++) {
//		System.out.print(b[i]+" ");
//		}
		
		
		
		// Remove element base on the index value of Array
//		int a[] = {1,2,3,3,4,5};
//		int b[] = new int[a.length-1];
//		int num=0;
//		int ind=2;
//		for(int i=0; i<a.length; i++) {
//			if(i!=ind) {
//				b[num++]=a[i];
//			}
//		}
//		for(int i=0; i<b.length; i++) {
//			System.out.print(b[i]);
//		}
		
		
		
		// Find the maxium element in the Array
//		int a[] = {1,6,9,2,3,5,4,7};
//		int max=a[0];
//		for(int i=0; i<a.length; i++) {
//			if(a[i]>max) {
//				max=a[i];
//			}
//		}
//		System.out.println(max);
		
		
		
		// Find the minium element in the Array
//		 int a [] = {9,8,7,6,5,4,6,2,3,8};
//		 int min = a[0];
//		 for(int i=0; i<a.length; i++) {
//			 if(a[i]<min) {
//				 min=a[i];
//			 }
//		 }
//		 System.out.println(min);
		
		
		
		
		// Search the nth element in an Array
//		 int a [] = {9,8,7,5,4,2,6,3,8};
//		 int t = 6;
//		 boolean flag = false;
//		 for(int i=0; i<a.length; i++) {
//			 if(a[i]==t) {
//				 flag=true;
//				 System.out.println(a[i]+" element is prsent");
//				 break;
//			 } 
//		 }
//		 if(flag==false) {
//			 System.out.println("Element is not present");
//		 }

		
		
		
		// Remove the duplicate in the Array
//		int a[] = {1,2,3,3,4,4,5};
//		for(int i=0; i<a.length; i++) {
//			int count=0;
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i]==a[j]) {
//					count++;
//					a[j]=Integer.MAX_VALUE;
//				}
//			}
//			if(count>=0 && a[i]!=Integer.MAX_VALUE) {
//				System.out.println(a[i]);
//			}
//		}
		
		
		
		// Arrange the element in Accending OR Decending order.
//		 int a [] = {3,2,4,1,5,9,7,6,8};
//		 for(int i=0; i<a.length; i++) {
//			 for(int j=i+1; j<a.length; j++) {
//				 if(a[i]>a[j]) {
//				//	 if(a[i]<a[j]) {
//					 int temp = a[j];
//					 a[j]=a[i];
//					 a[i]=temp;
//					 
//					 System.out.print(a[i]);
//				 }
//			 }
//		 }
//		 for(int i=0; i<a.length; i++) {
//			 System.out.print(a[i]);
//		 }
		
		// Print the Distinct element in an Array
//		int a[] = {1,2,2,3,4,5,4};
//		for(int i=0; i<a.length; i++) {
//			int count = 0;
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i]==a[j]) {
//					count++;
//					a[j]=-1;
//				}
//			}
//			if(count==0 && a[i]!=-1) {
//			System.out.println(a[i]);
//			}
//		}
		
		
		
		int a[] = {2,5,7,9,8,6,4,3,1};
		int max = a[0];
		int secmax = 0;
	//	int thirdmax = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
		//	thirdmax = secmax;
			secmax = max;
			max = a[i];
			}
			if(a[i]>secmax && max!=a[i]) {
				secmax=a[i];
			}
		}
		System.out.println(secmax);
		
		
		
		
		
	}
}
