package package1;

import java.util.Scanner;

public class ProductDetails extends ProductDAOImpl{
	
	static ProductDetails p;
	
	public static void details()
	{
		p=new ProductDetails();
		
		boolean running = true;
		while(running) 
		{
			System.out.println("-----Product Menu-----");
			System.out.println("1.AddProduct");
			System.out.println("2.ViewAllProducts");
			System.out.println("3.ViewProduct");
			System.out.println("4.updateProduct");
			System.out.println("5.DeleteProduct");
			System.out.println("6.Back");
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter ur choice:");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:p.addProduct();
			       break;
			case 2:System.out.println(p.ViewAllProducts());
		       break;
			case 3:p.viewProduct(pid1);
		       break;
		       case 4:p.updateProduct(pid1);
		       break;
		       case 5:p.deleteProduct(pid1);
		       break;  
			  case 6:
				running=false;
			}

	}
		
		
	}

}
