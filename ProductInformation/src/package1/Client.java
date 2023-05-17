package package1;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) 
		{
			System.out.println("-----Welcome To Digital Products-----");
			System.out.println("1.Product");
			System.out.println("2.Exit");
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter ur choice:");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:ProductDetails.details();
			       break;
			case 2:System.out.println("Thankyou and  visit again!!");
				System.exit(0);
		   	
			}

	}

}
}
