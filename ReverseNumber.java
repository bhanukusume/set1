package programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r;
		System.out.println("enter any number");
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		while(n>0) {
			r=n%10;
			System.out.print(r);
			n=n/10;
		}

	}

}
