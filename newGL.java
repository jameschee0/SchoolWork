/*
Java Program
New Version of
Greatest Common Devisor , Lowest Common Multiple
Created by James Chee 2017.11.18
*/

import java.util.Scanner;

class newGL{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);//Scanner Object
		int[] in = new int[2];//integer variable
		int[] primary = new int[2];//primary input values

		for(int i=0;i<in.length;i++){
			primary[i] = scan.nextInt();//getting inputs
			in[i] = primary[i];
		}

		System.out.println("gcd: "+gcd(in));//printing gcd
		System.out.println("lcm: "+lcm(primary,in));//printing lcm
	}

	public static int gcd(int[] in){ //Using Euclid's Algorithm
		while(in[1]>0){
			int temp = in[1];
			in[1] = in[0]%in[1];
			in[0] = temp;
		}
		return in[0];
	}

	public static int lcm(int[] primary,int[] in){//Using GCD to get LCM
		int res = primary[0]*(primary[1]/gcd(in));
		return res;
	}
}