

import java.util.Scanner;

public class SecondProgram {

	public static void dif(int a, int b)
	{
		int result=a-b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		SecondProgram.dif(a, b);
		
		
		
	}
}
