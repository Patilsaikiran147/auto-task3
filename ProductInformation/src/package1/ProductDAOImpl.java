package package1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProductDAOImpl implements ProductDAO {
	Product p;
	List<Product> list;
	static int pid1;
	static Product addProduct[] = null;

	public void addProduct() {
		System.out.println("How Many Products Do You Want to Add");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		addProduct = new Product[size];
		for (int i = 0; i < size; ++i) {
			System.out.println("please enter product details:");
			System.out.println("Enter product Id:");
			int pid = sc.nextInt();
			System.out.println("Enter product Name:");
			String pname = sc.next();
			System.out.println("Enter product quantity:");
			int qua = sc.nextInt();
			System.out.println("Enter product price:");
			double price = sc.nextInt();
			p = new Product(pid, pname, qua, price);
			addProduct[i] = p;
			System.out.println("product added");

		}
	}

	public List<Product> ViewAllProducts() {
		// TODO Auto-generated method stub

		System.out.println("-----The products are-----");
		return Arrays.asList(addProduct);
	}

	public void viewProduct(int pid) {
	
		List l = Arrays.asList(addProduct);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product Id:");
		pid1 = sc.nextInt();
		if (addProduct != null) {
			for (Product p : addProduct) {

				if (pid1 == p.getPid()) {
					System.out.println("------The Product is:-----");
					System.out.println(p);

				}

			}
		} else {
			System.out.println("Product is not available");
		}

	}

	public void updateProduct(int pid) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter product Id:");
		pid1 = sc1.nextInt();
		if (addProduct != null) {
			for (Product p : addProduct) {
				if (pid1 == p.getPid()) {
					System.out.println("Enter product Name:");
					String pname = sc1.next();
					p.setPname(pname);
					System.out.println("-----Product updated-----");
					System.out.println("The Updated Product is:" + p);
				}

			}
		} else {

			System.out.println("Product is not available");

		}
	}

	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter product Id:");
		pid1 = sc1.nextInt();
		int i = 0;
		int k = 0;
		for (Product p : addProduct) {
			if (pid1 == p.getPid()) {
				addProduct[i] = null;
				System.out.println("-----Product deleted-----");
				++k;
				++i;
				break;
			} else {
				++i;
			}
		}

		if (k == 0)
			System.out.println("Given Record is not Exist");

	}

}
