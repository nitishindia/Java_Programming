package Array_Programing;

public class Program_16_Type_SearchElement_InArray {

	public static void main(String[] args) {
		
		int a[] = {1,3,2,6,9,4,5,8};
		int t = 5;
		boolean flag=false;
		for(int i=0; i<a.length; i++) {
			if(a[i]==t) {
				flag=true;
				System.out.println("Element is present");
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element is not present");
		}
	}

}
