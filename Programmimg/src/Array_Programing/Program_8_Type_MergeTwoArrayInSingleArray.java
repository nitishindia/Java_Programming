package Array_Programing;

public class Program_8_Type_MergeTwoArrayInSingleArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int b[] = {5,6,7,8,10};
		
		int c[] = new int [a.length + b.length];
		int temp=0;
		int temp1=0;
		for(int i=0; i<c.length; i++) {
			
			if(temp<a.length) {
				c[i]=a[temp++];
			}
			else{
				c[i] = b[temp1++];
			}
		}
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}

	}

}
