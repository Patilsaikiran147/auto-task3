package Programs;

import java.util.Scanner;

public class Swap1 {
	
	static int a, b;

	public static void hello() {	
		a = a + b;
		b = a - b;
		a = a - b;
	}

	public static void main(String[] args) {
		System.out.println("enter the values:");
		Scanner sc = new Scanner(System.in);
		System.out.print("a:");
		a = sc.nextInt();
		System.out.print("b:");
		b = sc.nextInt();
		hello();
		System.out.println("after swapping: a is " +a + " "+"b is "+ b);


	}

}
