package inventory.model;
/**
 * Inventory -- This class defines properties
 * 				of Inventory Product
 * 
 * 
 * @author Ritesh KT
 *
 */
public class Inventory {
	//properties of product
	private String name;
	private double weight;
	private double price;
	
	public Inventory() {
		
	}
	
	public Inventory(String name, double weight, double price) {
		this.name = name;
		this.weight = weight;
		this.price = price;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
/**
 * Inventory object print format	
 */
	@Override
	public String toString() {
		return "Inventory [Product Name = " + name + ", Product Weight = " + weight + ", Product Price = " + price + "]";
	}
}
