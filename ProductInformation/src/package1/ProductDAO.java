package package1;

import java.util.List;

interface ProductDAO {
	
	void addProduct();
	List<Product> ViewAllProducts();
	void viewProduct(int pid);
	void updateProduct(int pid);
	void deleteProduct(int pid);

}
