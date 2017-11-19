

import java.util.Scanner;


class prime2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int i=0;

		int a;
		a = scan.nextInt();
		boolean res = prime(a);

		System.out.println(res);		
	}

	public static boolean prime(int a){
		boolean check = true;
		for(int i=2;i<(a-1);i++){
			if(a%i==0){
				check = false;
			}
		}
		return check;
	}
}