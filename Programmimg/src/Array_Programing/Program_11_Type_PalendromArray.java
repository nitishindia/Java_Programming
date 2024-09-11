package Array_Programing;

public class Program_11_Type_PalendromArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,2,1};
		
		int b[] = new int[a.length];
		int temp = 0;
		for(int i=a.length-1; i>=0; i--) {
			b[temp++] = a[i];
		}
		
		boolean flag = false;
		for(int i=0; i<b.length; i++) {
			if(a[i] == b[i]) {
				flag = true;
			}
			else {
				flag = false;
				break;
			}
		}
	
			if(flag==true) {
				System.out.println("given array is palendrom array");
			}
			else {
				System.out.println("given array is not palendrom array");
			}
		
	}

}
