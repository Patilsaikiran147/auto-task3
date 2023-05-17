package Jpl;

public class SixttenthProgram {
	
	public static void iseven(String[] ar)
	{
		try
		{
		int fno=Integer.parseInt(ar[0]);
		int lno=Integer.parseInt(ar[1]);
		int temp;
		
		if(fno>lno)
		{
			
			fno=fno+lno;
			lno=fno-lno;
			fno=fno-lno;
			
				
		}
		System.out.println(fno);
		System.out.println(lno);
		for(int i=fno;i<=lno;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+ " ");
			}
			else if(i>0)
			{
				System.out.println("error");
			}
		
		}
		}
		catch(NumberFormatException e)
		{
			System.out.println("error");
		}
		
		
		
	}
	
	
		
		
		
		
				
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SixttenthProgram.iseven(args);

		
		
	}

}
