package domain;

public class Flower extends Product {
	
	String color;

	public Flower(String nameProduct, float price, int stock, String color) {
		
		super(nameProduct, price, stock);
		this.color=color;


		
	}

}
