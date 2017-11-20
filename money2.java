/*
This program outputs lowest number of coins needed to add up to a certain number
Created by James Chee 2017.11.18
*/

import java.util.Scanner;

class money2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int result = coin(input);

		System.out.println(result);
	}
	public static int coin(int input){
		int[] coins = {500,100,50,10,1};
		int a;
		int b = 0;
		a = input;
		for(int i=0;i<5;i++){
			b = b+(a / coins[i]);
			a %= coins[i];
		}
		return b;
	}
}