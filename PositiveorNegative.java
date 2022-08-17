package programs;

import java.util.Scanner;
//n>0 positive
//n<0 negative
//n=0 is positive or negative

public class PositiveorNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter any number:");
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		if(n>0){
			System.out.println("positive number");
		}
		else if(n<0) {
			System.out.println("negative number");
			
		}
		else {
			System.out.println("neither positive or negative number:");
		}
		
		

	}

}
