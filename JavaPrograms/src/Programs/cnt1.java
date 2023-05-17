package Programs;

import java.util.Scanner;

public class cnt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the value:");
			String str = sc.nextLine();
			String reverse="";
			for(int i=str.length()-1;i>=0;i--) {
				reverse = reverse + str.charAt(i);
			}
			if(reverse.equals(str)) {
				System.out.println("it's a palindrome buddy");
			}else 
				System.out.println("it's not a palindrome buddy");
			}
			
	}



