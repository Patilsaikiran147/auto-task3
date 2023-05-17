package Jpl;

public class ThirteenProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int num=Integer.parseInt(args[0]);
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
				sum=sum+i;
			}
			
			
		}
		System.out.println();
		System.out.println(sum);
		if(num<=0)
			System.out.println("error");
		}
		catch(NumberFormatException e)
		{
			System.out.println("error");
		}



	}

}
