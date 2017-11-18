/*
Java Program
Drawing Triangle
Created by James Chee 2017.11.18
*/

import java.util.Scanner;

public class triangle{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int in;
		in = scan.nextInt();
		if(in%2==0){
			in -= 1;
		}
		for(int i=1;(2*i-1)<=in;i++){
			for(int j=1;j<=(in-i);j++)space();
			for(int j=1;j<=(2*i-1);j++)star();
			next();
		}
	}

	public static void space(){
		System.out.print(" ");
	}

	public static void star(){
		System.out.print("*");
	}

	public static void next(){
		System.out.println();
	}
}