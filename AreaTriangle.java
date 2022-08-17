package programs;

import java.util.Scanner;
public class AreaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     float b=4,h=13,area;
		
	
		System.out.println("enter the value sides of the triangle:");
		Scanner scan = new Scanner(System.in);
		/*a=scan.nextInt();//nextInt is  a predefined method
		b=scan.nextInt();
		c=scan.nextInt();
		sp=(a+b+c)/2;//semiperimeter formula
		area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));*/
		area=(b*h)/2;
		
		System.out.println("Area of the triangle:" +area);
		

	}

}
