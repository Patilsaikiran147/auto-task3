package Programs;

public class PrimeNumbers {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int count=0;
		for(int i=1;i<=10;i++)
		{
			
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
				
				
			}
			if(count==2)
			{
				System.out.println(i);
			}
			
		}
		
	}

}
