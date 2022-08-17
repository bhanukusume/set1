package programs;

import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("enter any character");
		Scanner sc = new Scanner(System.in);
		ch=sc.next().charAt(0);
		int a= ch;
		System.out.println("ASCII  value of a  is " +a);
	}

}

