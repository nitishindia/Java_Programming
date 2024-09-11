package Array_Programing;

public class Program_13_Type_RemoveElementBaseOnIndexValueIntoArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,2,3,4,5};
		int b[] = new int [a.length-1];
		int num=0;
		int ind=2;
		for(int i=0; i<a.length; i++) {
			if(i!=ind) {
				b[num++]=a[i];
			}
		}
		
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}
}
