package programs;

import java.util.Scanner;
//pi*r*r
public class AreaOfTheCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius,area;
		System.out.println("enter any number:");
		Scanner scan = new Scanner(System.in);
		radius=scan.nextDouble();
		area=Math.PI*radius*radius;
		System.out.println("area of the circle is:" +area);
		
		
        
	}
	

}
