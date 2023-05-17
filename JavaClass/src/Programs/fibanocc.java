package Programs;

import java.util.Scanner;

public class fibanocc {
	public static void fibo(int num)
	{
		int a=0,b=1,c;
		for(int i=1;i<=num;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int num=sc.nextInt();
fibanocc.fibo(num);
	}

}
