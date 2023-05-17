package Patterns;

public class Pattern6 {
//out put;
//	1 3 5 7 9
//	11 13 14 15 16---upto 100
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(k);
				k=k+2;
			}
			System.out.println();
		}

	}

}
