package programs;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		System.out.println("enter the number");
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		for(int i=1;i<=n;i++) {
		 sum=sum+i;
		}
		 System.out.println("sum of digits:" +sum);

	

}
}