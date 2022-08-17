package programs;

import java.util.Scanner;
/* temp variable :In which it is stored each digits
 * Armstrong:are we stored or addition of each digits which will be intially zero
 * 
 * 
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=153,rem,arm=0,c;
       c=n;
       System.out.println("enter the number");
       Scanner scan= new Scanner(System.in);
       n=scan.nextInt();
       
       while(n>0) {
    	   rem=n%10;
    	  
    	   arm=(rem*rem*rem)+arm;
    	   n=n/10;
       }
       if(arm==n) {
    	   System.out.println(" armstrong number");
           
       }
       else {
    	   System.out.println(" it is not an armstrong number");
          
       }
       
	}

}
