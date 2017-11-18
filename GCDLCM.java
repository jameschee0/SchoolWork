/*
Java Program
Greatest Common Devisor , Lowest Common Multiple
Created by James Chee 2017.11.18
*/

import java.util.Scanner;

public class GCDLCM{
	public static void main(String[] args){
		int[] in = new int[3];//in: array to get input of two integers

		Scanner scan = new Scanner(System.in);//scan: Scanner Object

		in[0] = 1;
		in[1] = scan.nextInt();//get the input of integer 1 -> in[0]
		in[2] = scan.nextInt();//get the input of integer 2 -> in[1]

		System.out.println(GCD(in)[0]);//print GCD
		System.out.println(LCM(in));//print LCM
	}

	public static int[] GCD(int[] in){
		int[] res = new int[3];
		int i = 1;
		for(i=1;i<=in[0]||i<=in[1];i++){
			if(i==in[1]){
				if(in[2]%i==0&&i!=1){
					res[0] = i*in[0];
					res[1] = in[1]/i;
					res[2] = in[2]/i;
					return GCD(res);
				}else{
					return in;
				}
			}else if(i==in[2]){
				if(in[1]%i==0&&i!=1){
					res[0] = i*in[0];
					res[1] = in[1]/i;
					res[2] = in[2]/i;
					return GCD(res);
				}else{
					return in;
				}
			}else{
				if(i!=1){
					if(in[1]%i==0&&in[2]%i==0){
						res[0] = i*in[0];
						res[1] = in[1]/i;
						res[2] = in[2]/i;
						return GCD(res);
					}
				}
			}
		}
		return res;
	}

	public static int LCM(int[] in){
		int[] res = new int[3];
		res = GCD(in);
		int answer = res[0]*res[1]*res[2];
		return answer;
	}
}