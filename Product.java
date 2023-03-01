package Entities;

public class Product {
	
	public String name;
	public double Price;
	public int quantity;
	
	

	public double totalValueInStock() {
		
		return Price * quantity;	
			
		
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", $"
				+ Price
				+ ","
				+ quantity
				+ "units, Total: $"
				+ totalValueInStock();
	}

}