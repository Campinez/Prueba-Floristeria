package persistence;

import java.util.ArrayList;

import domain.Product;

public class Repository {
	public static ArrayList <Product> items= new ArrayList<Product>();
	
	public Repository() {
		
	}

	public void addItem (Product item) {
		items.add(item);
	}
}
