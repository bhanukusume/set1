package programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,a=0,b=1,c;
		System.out.println("Enter any number:");
		Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        for(int i=1;i<=num;i++) { 
        	
        	System.out.print(a+ " ");
        	c=a+b;
        	a=b;
        	b=c;
        }
	}

}
