import java.util.Scanner;

public class ProductServices {
	private Scanner scan = new Scanner(System.in);
	private Product products[] = new Product[10];
	private int index = 0;
	private int pid = 10000001;
	
	
	private void insertProduct() {
		if(index>=10) {
			System.out.println("Sorry our inventory was filled...");
		}
		else {
			System.out.println("Enter Product Name ");
			String name = scan.next();
			System.out.println("Enter Company Name ");
			String cname = scan.next();
			System.out.println("Enter Product Cost ");
			double cost = scan.nextDouble();
			
			//Add all these details to a new product object.
			Product pro = new Product(pid, name, cname, cost);
			
			//Add the product object to the products array
			products[index] = pro;
			pid++;
			index++;
		}
	}
	
	private void displayAllProducts() {
		if(index==0) {
			System.out.println("Sorry.... No products are available ");
		}
		else {
			 for(int i=0;i<index;i++) {
				Product p = products[i];
				p.displayDetails();
			}
		}
	}
	
	private void editProduct() {
		
	}
	
	private void deleteProduct() {
		
	}
	
	public void menu() {
		
		while(true) {
			System.out.println("=================INVENTORY SYSTEM=============");
			System.out.println("\n\tPress 1 for Adding a New Product");
			System.out.println("\tPress 2 for Display All Available Products");
			System.out.println("\tPress 3 for Update a Product");
			System.out.println("\tPress 4 for Delete an Existing Product");
			System.out.println("\tPress 9 for Exit from the App");
			System.out.println("\n\tPlease Enter your Choice..");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1 : insertProduct(); break;
			case 2 : displayAllProducts();break;
			case 3 : editProduct();break;
			case 4 : deleteProduct(); break;
			case 5 : getProductByProductId();break;
			case 9 : System.exit(choice);
			default : System.out.println("Please choose your option between 1 and 4");
			}
		}
	}

	private void getProductByProductId() {
		// TODO Auto-generated method stub
		
	}
}
