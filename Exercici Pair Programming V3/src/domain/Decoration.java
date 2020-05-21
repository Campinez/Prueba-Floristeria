package domain;

public class Decoration extends Product  {
	
	String material;

	public Decoration(String nameProduct, float price, int stock, String material) {
		super(nameProduct, price, stock);
		this.material=material;
	}
	

}
