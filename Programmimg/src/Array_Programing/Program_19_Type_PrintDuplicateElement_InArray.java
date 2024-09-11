package Array_Programing;

public class Program_19_Type_PrintDuplicateElement_InArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,2,4,3};
		
		for(int i=0; i<a.length-1; i++) {
			int count=0;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=-1;
				}
			}
			if(count>0 && a[i]!=-1) {
				System.out.println(a[i]);
			}
		}
	}
}
