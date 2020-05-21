package main;

import controller.FlowerShop;

public class MainFlowerShop {

	public static void main(String[] args) {


		FlowerShop flowerShop1= new FlowerShop("La Floristeria","Calle El Jarrón, 21");
		
		FlowerShop.createFlower("Margarita", 20, 5, "Amarillas");
		FlowerShop.createTree("Roble", 300, 2, 280);
		FlowerShop.createDecoration("Fuente", 300, 5, "Piedra basáltica");
		
		

	}

}
