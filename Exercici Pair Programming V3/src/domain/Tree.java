package domain;

public class Tree extends Product {
	
	float heigh;
	
	public Tree (String nameProduct, float price, int stock, float heigh) {
		
		super  ( nameProduct,  price,  stock);
		this.heigh=heigh;
		
	}

}
