package Array_Programing;

public class Program_20_Type_RemoveDuplicateElement_FromArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,2,3,4,5,4};
		
		for(int i=0; i<a.length; i++) {
			int count=0;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=-1;
				}
			}
			if(count>=0 && a[i]!=-1) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
