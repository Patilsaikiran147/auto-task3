package Programs;

import java.util.Scanner;

public class PrimeNumber {
	//int Count=0;
	public static void prime(int num)
	{
		int Count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
			Count++;
			}
		}
		if(Count==2)
		{
			System.out.println("prime Number");
		}
		else
		{
			System.out.println("  not Prime Number");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=sc.nextInt();
		
		PrimeNumber.prime(num);
		
		

	}

}
