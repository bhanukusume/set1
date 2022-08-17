package programs;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact=1 ;
		System.out.println("enter any number");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
			System.out.println("factorial of a number is " +fact);
		

}
}