package programs;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,remainder;
		System.out.println("Enter any number:");
		Scanner sc= new Scanner(System.in);
		number=sc.nextInt();

		if(number%2==0) {
			
			System.out.println("Even number");
		}
		else {
			System.out.println("odd number");
		}
		
	}
	}
