package Jpl;

public class FifteenthProgram {

	public static  void isprime(String[] ar)
	{
	//
		try
		{
		int num=Integer.parseInt(ar[0]);
		int n=Integer.parseInt(ar[0]);
		int Count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			Count++;
			}
		}
		if(Count==2)
		{
			System.out.println("true");
		}
		else if(n<=0)
		{
			System.out.println(" error");
		}
		else
		{
			System.out.println("false");
		}
		}
		catch(NumberFormatException e)
		{
			System.out.println("error");
		}
		
	}

		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FifteenthProgram.isprime(args);	
	}

}
