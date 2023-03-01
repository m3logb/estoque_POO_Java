package Apllication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name");
		product.name = sc.next();
		System.out.print("Price:");
		product.Price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		
		System.out.println("Insira a quantidade de novos produtos:");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println(product);
		
		System.out.println("Insira a quantidade de produtos que deseja remover:");
		quantity = sc.nextInt();
		
		product.removeProducts(quantity);
		
		
		System.out.println(product);
		
		
		sc.close();
		
		

	}

}
