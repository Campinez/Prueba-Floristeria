package domain;

public class Product {
	
	
	
	private static int IdSiguiente;
	private int id; 
	String nameProduct;
	float price;
	int currentStock;
	
	public Product (String nameProduct, float price, int stock) {
		
		this.nameProduct=nameProduct;
		this.price=price;
		this.currentStock=currentStock;
		++IdSiguiente;
		id=IdSiguiente;
		
	}
	
	public void sales() {
		
		
		
	}
	public void restocking(int newStock) {
		
	}

}
