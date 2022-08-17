package programs;
//145 factorial of 1 ,4,5 =145
import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,temp,rem,sum=0;
		System.out.println("enter any number:");
		Scanner scan = new Scanner(System.in);
		num=scan.nextInt();
		temp=num;
		while(num>0) {
		 rem=num%10;
		 int fact=1;
		 for(int i=1;i<=rem;i++) {
			 fact=fact*i;
		 }
		 num=num/10;
		 sum=sum+fact;
		}
		if(temp==sum) {
		System.out.println(sum+ " strong number");
	}
		else
			System.out.println(sum+ " not a strong number");
   
}
}
