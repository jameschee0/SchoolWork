import java.util.Scanner;

public class test{
	public static void main(String[] args){
		int result = f(3);
		System.out.println(result);
		/*
		Scanner scan = new Scanner(System.in);//make a scanner object
		String message;//message variable to store String value
		message = scan.next();//store message using next() method
		System.out.println(message);//print message
		*/
	}

	public static int f(int x){
		int y = 3*x+5;
		return y;
	}
}