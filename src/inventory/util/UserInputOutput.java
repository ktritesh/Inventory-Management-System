/**
 * UserInputOutput -- This class contains all the 
 * 					  methods to read data from console 
 * 
 * 
 * @author Ritesh KT
 *
 */
package inventory.util;

import java.util.Scanner;
import inventory.model.Inventory;

public class UserInputOutput {
	
	static Scanner sc = new Scanner(System.in);
/**
 * This method print menu &
 * takes input form user
 * 	
 * @return chosen option
 */
	public static int showMenu() {
		
		System.out.println();
		System.out.println("**** Inventory Management System ****");
		System.out.println("1. Add Product");
		System.out.println("2. Edit Product");
		System.out.println("3. Delete Product");
		System.out.println("4. Display Product");
		System.out.println("5. Exit");
		System.out.println();
		System.out.println("Enter ur option (1-5) : ");
		return sc.nextInt();
	}
/**
 * This method takes product name 
 * from console
 * 	
 * @return product name
 */
	public static String getProductName() {
		
		System.out.println("**** ADD PRODUCT ****");
		System.out.println("Enter Product Name : ");
		return sc.next();
	}
/**
 * This method takes product weight 
 * from console
 * 	
 * @return product weight
 */	
	public static double getProductWeight() {
		
		System.out.println("Enter Product Weight : ");
		return sc.nextDouble();
	}
/**
 * This method takes product price 
 * from console
 * 	
 * @return product price
 */	
	public static double getProductPrice() {
		
		System.out.println("Enter Product Price / kg : ");
		return sc.nextDouble();
	}
/**
 * This method takes name of product 
 * to edit 
 * 	
 * @return product name
 */	
	public static String editProductName() {
		
		System.out.println("Enter Product Name To Edit : ");
		return sc.next();
	}
	
	public static void noInventoryMsg() {
		
		System.out.println("No Such Product in Inventory Store");
	}
/**
 * This method takes values for 
 * all properties of product from
 * console to edit it
 * 	
 * @return Inventory object
 */		
	public static Inventory editProductProperties() {
		
		Inventory inventory = new Inventory();
		
		System.out.println("**** EDIT PRODUCT ****");
		System.out.println("Enter New Name Of Product : ");
		inventory.setName(sc.next());
		
		System.out.println("Enter New Weight of Product : ");
		inventory.setWeight(sc.nextDouble());
		
		System.out.println("Enter New Price of Product : ");
		inventory.setPrice(sc.nextDouble());
		
		return inventory;
	}
/**
 * This method takes name of product 
 * to delete 
 * 	
 * @return product name
 */	
	public static String deleteProductName() {
		
		System.out.println("**** DELETE PRODUCT ****");
		System.out.println("Enter Product Name To Delete : ");
		return sc.next();
	}
}
