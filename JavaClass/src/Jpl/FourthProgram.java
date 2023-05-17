package Jpl;

import com.google.errorprone.annotations.FormatString;

public class FourthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=args[0];
		System.out.println(s);
		StringBuilder sc=new StringBuilder(s);
		String f=sc.reverse().toString();
		if(s.equals(f))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
		

	}

}
