package programs;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;// char is a datatype ,ch is the variable
		System.out.println("Enter any character");
		Scanner scan= new Scanner(System.in);
		ch=scan.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
		System.out.println("vowel");	
		}
		else {
		System.out.println("consonants");	
		}
		

	}

}
