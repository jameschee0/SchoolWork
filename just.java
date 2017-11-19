import java.util.Scanner;

public class just{
	public static void main(String[] args){

		Person p1 = new Person();
		Person p2 = new Person();

		p1.height = 165;
		p2.height = 180;

		p1.print();
	}
}

class Person{
	int height;

	public void print(){
		System.out.println(height);
	}
}