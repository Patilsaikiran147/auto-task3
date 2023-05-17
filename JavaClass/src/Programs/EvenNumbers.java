package Programs;

import java.util.Scanner;

public class EvenNumbers {
	
	public static void even(int n1, int n2)
	{
		for(int i=n1;i<=n2;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" even numbers");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the range");
 int n1=sc.nextInt();
 int n2=sc.nextInt();
 EvenNumbers.even(n1, n2);
 

	}

}
