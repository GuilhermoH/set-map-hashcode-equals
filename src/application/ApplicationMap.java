package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class ApplicationMap {

	public static void main(String[] args) {

		final Map<Product, String> stock = new HashMap<>();

		final Product productOne = new Product("Iphone", 3000.00);
		final Product productTwo = new Product("Galaxy", 1000.00);
		final Product productThree = new Product("Motorola", 2000.00);

		stock.put(productOne, "Out of stock");
		stock.put(productTwo, "To sell");
		stock.put(productThree, "Sold");

		System.out.println("Stock contais productOne- " + stock.containsKey(productOne));
		
		System.out.println("ALL PRODUCTS- ");
		
		for (Product key : stock.keySet()) {
			System.out.println(key + ": " + stock.get(key));
		}

	}

}
