package programs;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,sum=0;
		System.out.println("enter the number:");
		Scanner scan= new Scanner(System.in);
		n=scan.nextInt();
		
		while(n>0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
			System.out.println("sum of digits: "+sum);
		}

	}


