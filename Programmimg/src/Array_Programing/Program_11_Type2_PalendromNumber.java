package Array_Programing;

public class Program_11_Type2_PalendromNumber {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,2,3};
		
//		int b[] = new int[a.length];
//		int num=0;
//		for(int i=a.length-1; i>=0; i--) {
//			b[num++]=a[i];
//		}
		
		boolean flag = false;
		int temp=0;
		int temp1= a.length-1;
		while(temp<temp1) {
			if(a[temp]==a[temp1]) {
				flag = true;
				temp++;
				temp1--;
			}
			else {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("palendrom number");
		}
		else {
			System.out.println("not palendrom number");
		}
	}

}
