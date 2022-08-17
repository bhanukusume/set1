package programs;
//Write a program to identify if the character is an alphabet or not
public class CharorAlphabet {

	public static void main(String[] args) {     
		// TODO Auto-generated method stub
		char c='A';
		System.out.println("Enter any character:");
		if((c>='a' && c<='z') || (c>='A' && c<='Z')){
			System.out.println(c+ " is an alphabet");
		}
		else {
			System.out.println(c+ " it is not an alphabet");
		}
	}
}