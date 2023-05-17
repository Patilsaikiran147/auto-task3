package Jpl;

public class NinthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=Integer.parseInt(args[0]);
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

}
