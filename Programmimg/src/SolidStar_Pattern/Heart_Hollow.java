package SolidStar_Pattern;

public class Heart_Hollow {

	public static void main(String[] args) {
		
	//	int n =5;
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
//				if((i==1 && j==2 ) ||
//					(i==1 && j==4) ||
//						(j==1 && i>=2 && i<=3) || 
//						(j==5 && i>=2 && i<=3) ||
//						(i==4 && j==2) ||
//						(i==4 && j==4) ||
//						(j==3 && i==2) || 
//						(j==3 && i==5) ) {
				if(i+j==8 ||
						i-j==2 ||
						j-i==1 && i<=2 ||
						i+j==5 && i<=2 ||
						j==1 && i>=2 && i<=3 ||
						j==5 && i>=2 && i<=3) {
					System.out.print("* ");
				
				}
				else {
					System.out.print("  ");
				}	
			}
			System.out.println();
		}
	}
}
