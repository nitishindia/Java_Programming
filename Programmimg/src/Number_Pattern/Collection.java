package Number_Pattern;

import java.util.LinkedHashSet;

public class Collection {

	public static void main(String[] args) {
		
		int[] a= {8,2,5,27,2,8};
		for (int i = 0; i < a.length; i++) {
		LinkedHashSet lh=new LinkedHashSet();
		int count=0;
		for (int j = 0; j < a.length; j++) {
			if(!lh.add(a[j])) {
				count++;
			}
		}
		System.out.println(a[i]+"-"+count);
		}
	}

}
