package SolidStar_Pattern;

public class Print_NITISH {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j==1 || j==i || j==5) {
					System.out.print("@");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
		Thread.sleep(500);
		
				for(int j=1; j<=5; j++) {
					if(i==1 || j==3 || i==5) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print(" ");
				Thread.sleep(500);
				
				for(int j=1; j<=5; j++) {
					if(i==1 || j==3) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print(" ");
				Thread.sleep(500);
				
				for(int j=1; j<=5; j++) {
					if(i==1 || j==3 || i==5) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print(" ");
				Thread.sleep(500);
				
				
				for(int j=1; j<=5; j++) {
					if(i==1 && j>=2 && j<=4 || 
					   j==1 && i==2  || 
					   i==3 && i>=2 && j<=4 || 
					   j==5 && i==4  || 
					   i==5 && j>=2 && j<=4)
					   
					{
					System.out.print("*");	
					}
					else {
						System.out.print(" ");
					}	
				}
				System.out.print(" ");
				Thread.sleep(500);
				
				
				for(int j=1; j<=5; j++) {
					if(j==1 || i==3 || j==5) {
						System.out.print("@");
					}
					else {
						System.out.print(" ");
					}
				}
			
			Thread.sleep(1000);
			System.out.println();
		}
	}
}
