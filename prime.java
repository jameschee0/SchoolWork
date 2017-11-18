import java.util.Scanner;

public class prime{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in); // Make Scanner Object : scan
		int input=0; // Int variable for storing input value
		boolean result;
		input = scan.nextInt(); // get an input
		result = prime(input);
		System.out.println(result);
	}

	public static boolean prime(int n){
		int i = 0;
		int check = 0;
		for(i=2;i*i<=n;i++){
			if(n%i==0){
				check=1;
				break;
			}
		}
		if(check!=1){
			return true;
		}else{
			return false;
		}
	}
}