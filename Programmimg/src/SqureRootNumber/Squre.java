package SqureRootNumber;

public class Squre {

	public static void main(String[] args) {
		int n=16;
		
		for (int i=0; i<=n; i++) {
			if (i*i==n) {
				System.out.println(i);
				break;
			}
				else if(i==n){
					System.out.println(i+" "+"is not square root number");
				}
			}
		}

	}


