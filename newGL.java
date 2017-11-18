/*
Java Program
New Version of
Greatest Common Devisor , Lowest Common Multiple
Created by James Chee 2017.11.18
*/

import java.util.Scanner;

class newGL{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] in = new int[2];

		System.out.println("gcd: "+gcd(in));
		System.out.println("lcm: "+lcm(in));
	}

	public static int gcd(int[] in){ //Using Euclid's Algorithm
		while(in[1]>0){
			int temp = in[1];
			in[1] = in[0]%in[1];
			in[0] = temp;
		}
		return in[0];
	}

	public static int lcm(int[] in){
		int res = in[0]*(in[1]/gcd(in));
		return res;
	}
}