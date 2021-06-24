/**
 * InventoryMain -- This class calls method according
 * 				    to operation which is selected by user
 * 
 * 
 * @author Ritesh KT
 *
 */
package inventory.controller;

import java.util.Scanner;
import inventory.model.Inventory;
import inventory.service.InventoryService;
import inventory.service.InventoryServiceInterface;
import inventory.util.UserInputOutput;

public class InventoryMain {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		InventoryServiceInterface inventoryService = new InventoryService();
		
		boolean flag = true;
		
		while(flag) {
			
			int choice = UserInputOutput.showMenu();
			
			switch (choice) {
				case 1: {
						
					Inventory inventory = setProductProperties();
					inventoryService.addInventory(inventory);
					break;
				}
				case 2:{
					
					String name = UserInputOutput.editProductName();
					boolean available = inventoryService.checkAvailability(name);
					if(available == true) {
						Inventory inventory = UserInputOutput.editProductProperties();
						inventoryService.editProduct(name, inventory);
					}
					else {
						UserInputOutput.noInventoryMsg();
					}
						 
					break;
				}
				case 3:{
					
					String name = UserInputOutput.deleteProductName();
					boolean available = inventoryService.checkAvailability(name);
					if(available == true) {
						inventoryService.deleteProduct(name);
					}
					else {
						UserInputOutput.noInventoryMsg();
					}
					break;
				}
				case 4:{
					
					inventoryService.displayInventory();
					break;
				}
				case 5:{
		
					flag = false;
					break;
				}
				default:{
					
					System.out.println("Incorrect option");
					break;
				}
			}
		}	
	}
	
	public static Inventory setProductProperties() {
		
		Inventory inventory = new Inventory();
		
		String name = UserInputOutput.getProductName();
		inventory.setName(name);
		
		double weight = UserInputOutput.getProductWeight();
		inventory.setWeight(weight);
		
		double price = UserInputOutput.getProductPrice();
		inventory.setPrice(price);
		
		return inventory;
	}
}
