package Programs;

import java.util.Scanner;

public class EvenNumber {
	
	public static void even(int num) {
		if(num%2==0)
		{
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("not even");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers");
int num=sc.nextInt();
EvenNumber.even(num);

	}

}
