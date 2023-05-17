package Jpl;

public class TwelthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int num=Integer.parseInt(args[0]);
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
			
			
		}
		if(num>=0)
			System.out.println("error");
		}
		catch(NumberFormatException e)
		{
			System.out.println("error");
		}

	}
}


