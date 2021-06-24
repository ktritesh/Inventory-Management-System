/**
 * InventoryDAO -- This class contains all
 * 				   CRED operations
 * 
 * @author Ritesh KT
 */
package inventory.dao;

import java.util.ArrayList;
import java.util.List;
import inventory.model.Inventory;
import inventory.service.InventoryServiceInterface;

public class InventoryDAO implements InventoryServiceInterface {
	
	//ArrayList to store Inventory product
	List<Inventory> inventoryList = new ArrayList<>();
/**
 * This method add Inventory object into ArrayList
 * 
 * @return No return	
 */
	@Override
	public void addInventory(Inventory inventory) {
		
		inventoryList.add(inventory);
	}
/**
 * This method checks if product is 
 * present in inventory / not
 * 
 * @return flag
 * 			-- true if present else false
 */
	@Override
	public boolean checkAvailability(String name) {
		
		boolean flag = false;
		
		for(int i=0; i < inventoryList.size(); i++) {
			//matching product name with ArrayList product names
			if(inventoryList.get(i).getName().equals(name)) {
				
				flag = true;
			}
		}
		return flag;
	}
/**
 * This method matches given product name
 * with ArrayList & assign new value of 
 * product properties
 * 
 * @return No return	
 */
	@Override
	public void editProduct(String name, Inventory inventory) {
				
		for(int i=0; i < inventoryList.size(); i++) {
			//matching product name with ArrayList product names
			if(inventoryList.get(i).getName().equals(name)) {
				
				//setting new values
				inventoryList.get(i).setName(inventory.getName());
				inventoryList.get(i).setWeight(inventory.getWeight());
				inventoryList.get(i).setPrice(inventory.getPrice());
				System.out.println();
				System.out.println("Product Editied Sucessfully...!!!");
			}
		}
	}
/**
 * This method matches given product name
 * with ArrayList & remove that product
 * from ArrayList
 * 
 * @return No return	
 */	
	@Override
	public void deleteProduct(String name) {
		
		for(int i=0; i < inventoryList.size(); i++) {
			
			if(inventoryList.get(i).getName().equals(name)) {
				//removing product from ArrayList
				inventoryList.remove(i);
				System.out.println("Product Remove From Inventory Sucessfully...!!!");
			}
		}
	}
/**
 * This method Print ArrayList
 * Also compute Inventory Value of
 * each individual product	
 */
	@Override
	public void displayInventory() {

		for(int i =0; i < inventoryList.size(); i++) {
			
			System.out.println(inventoryList.get(i));
			//fetching properties value of product
			String name = inventoryList.get(i).getName();
			double weight = inventoryList.get(i).getWeight();
			double price = inventoryList.get(i).getPrice();
			
			//computing Inventory value
			double inventoryValue = weight * price;
			System.out.println("Total Value of "+name+" Inventory : "+inventoryValue);
			System.out.println();
		}
	}
}
