package controller;


import domain.Decoration;
import domain.Flower;
import domain.Tree;
import persistence.Repository;

public class FlowerShop {
	
	private String nameFlowerShop;
	private String address;
	
	public FlowerShop(String nameFlowerShop, String address) {
		this.nameFlowerShop=nameFlowerShop;
		this.address=address;
		}
	
	public static void createTree (String nameProduct, float price, int stock, float heigh) {
		Tree tree= new Tree( nameProduct,  price,  stock,  heigh);
		Repository.items.add(tree);
	}
	public static void createFlower (String nameProduct, float price, int stock, String color) {
		Flower flower= new Flower( nameProduct,  price,  stock,  color);
		Repository.items.add(flower);
		
	}
	public static void createDecoration(String nameProduct, float price, int stock, String material) {
		Decoration decoration=new Decoration( nameProduct,  price,  stock,  material);
		Repository.items.add(decoration);
	
	}
}
