package programs;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=875678;
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
			System.out.println("num :"+num);
			System.out.println("count :"+count);
		}
      System.out.println("digit is :" +count);
	}

}
