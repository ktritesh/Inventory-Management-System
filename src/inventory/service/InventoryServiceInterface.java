package inventory.service;

import inventory.model.Inventory;

public interface InventoryServiceInterface {
	
	public abstract void addInventory(Inventory inventory);
	
	public abstract boolean checkAvailability(String name);
	
	public abstract void editProduct(String name, Inventory inventory);
	
	public abstract void deleteProduct(String name);
	
	public abstract void displayInventory();
}
