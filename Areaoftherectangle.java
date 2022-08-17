package programs;

import java.util.Scanner;
// length*breadth
//semiperimeter
public class Areaoftherectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length,breadth,area;
		System.out.println("enter the values for  sides:");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter length  value:");
		length=sc.nextInt();
		System.out.println("enter breadth value:");
		breadth=sc.nextInt();
		area=length*breadth;
		System.out.println("Area of the rectangle is: " +area);
		
	}
}