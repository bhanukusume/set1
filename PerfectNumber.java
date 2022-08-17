package programs;

import java.util.Scanner;

//6 =1,2,3   1+2+3=6
//28= 1,2,4,7,14 1+2+4+7+14=28
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0;
		System.out.println("enter any number:");
		Scanner scan= new Scanner(System.in);
	     num =scan.nextInt();
	     for(int i=1;i<num;i++) {
	    	 if(num%i==0) {
	    		 sum=sum+i;
	    	 }
	     }
	     if(num==sum) {
	    	 System.out.println("perfect number");
	     }
	     else {
	    	 System.out.println("not a perfect number");
	     }
	}

}
