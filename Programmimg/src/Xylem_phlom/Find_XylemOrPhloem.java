package Xylem_phlom;

public class Find_XylemOrPhloem {
	
	public static void main(String[] args) {
		 
		 int n = 12326;
		 
		 int l= n%10;
		  n = n/10;
		 int IS = 0;
		 
		 while(n>9) {
			 int d = n%10;
			 IS = IS +d;
			 n=n/10;	 
		 }
		 int OS = l+n;
		 if(OS==IS) {
			 System.out.println(n+" "+"Xylem number");
		 }
		 else {
			 System.out.println(n+" "+"Phloem number");
		 }
	}

}
