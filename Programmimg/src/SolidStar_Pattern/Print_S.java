package SolidStar_Pattern;

public class Print_S {

	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=5; j++) {
				if(i==1 && j>=2 && j<=4 || 
				   j==1 && i>=2 && i<=3 || 
				   i==4 && i>=2 && j<=4 || 
				   j==5 && i>=5 && i<=6 || 
				   i==7 && j>=2 && j<=4 || 
				   i==6 && j==1 || 
				   j==5 && i==2) 
				{
				System.out.print("*");	
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
