/**
 * InventoryService -- This class contains defination
 * 					   of methods
 * 
 * 
 * @author Ritesh KT
 *
 */
package inventory.service;

import inventory.dao.InventoryDAO;
import inventory.model.Inventory;

public class InventoryService implements InventoryServiceInterface {

	InventoryDAO inventoryDAO = new InventoryDAO();
	
	public void addInventory(Inventory inventory) {
		
		inventoryDAO.addInventory(inventory);	
	}

	@Override
	public boolean checkAvailability(String name) {
		
		return inventoryDAO.checkAvailability(name);
	}
	
	@Override
	public void editProduct(String name, Inventory inventory) {
		
		inventoryDAO.editProduct(name, inventory);
	}

	@Override
	public void deleteProduct(String name) {
		
		inventoryDAO.deleteProduct(name);
	}
	
	public void displayInventory() {
		
		inventoryDAO.displayInventory();
	}
}
