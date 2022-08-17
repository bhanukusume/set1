package programs;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='a';
		System.out.println("Enter any character");
		Scanner sc= new Scanner(System.in);
		if(Character.isAlphabetic(c)){
			System.out.println(c+ " is an alphabet");
		}
		else {
			System.out.println(c+ " it is not an alphabet");
		}
		

	}

}
