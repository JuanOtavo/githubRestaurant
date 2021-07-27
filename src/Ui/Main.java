package Ui;

import models.Client;
import models.Product;
import models.Recipe;
import models.Table;

public class Main {

	public static void main(String[] args) {
		System.out.println("inicio el programa");

		/// CLIENTS:

		Client NewClient = new Client("Diego", "Molina", "1111", "3213213", true);
		System.out.println("El nuevo cliente es: " + NewClient.getName() + " " + NewClient.getLastName() + ", "
				+ "El numero de identificaion es: " + NewClient.getnId() + ", " + "El numero de telefono es: "
				+ NewClient.getPhoneNumber() + " " + "¿Tiene hijos?" + " " + NewClient.isHasChildren());

		NewClient.setName("Juan");

		NewClient.setLastName("Otavo");

		NewClient.setnId("1568416545");

		NewClient.setPhoneNumber("321941584");
		System.out.println("El nuevo cliente es: " + NewClient.getName() + " " + NewClient.getLastName() + ", "
				+ "El numero de identificaion es: " + NewClient.getnId() + ", " + "El numero de telefono es: "
				+ NewClient.getPhoneNumber() + " " + "¿Tiene hijos?" + " " + NewClient.isHasChildren());

		/// PRODUCTS:

		Product NewProduct = new Product("Papas de paquete", "Margarita", 3, 2500);
		System.out.println("El nuevo producto es: " + NewProduct.getName() + ", " + "La marca es: "
				+ NewProduct.getBrand() + ", " + "La cantidad es: " + NewProduct.getQuantity() + ", "
				+ "El precio es: $" + NewProduct.getPrice());

		NewProduct.setName("Frijoles");

		NewProduct.setBrand("Mercacentro");

		NewProduct.setPrice(1800);

		System.out.println("El nuevo producto es: " + NewProduct.getName() + ", " + "La marca es: "
				+ NewProduct.getBrand() + ", " + "La cantidad es: " + NewProduct.getQuantity() + ", "
				+ "El precio es: $" + NewProduct.getPrice());

		/// RECIPE

		Recipe NewRecipe = new Recipe("Bandeja paisa", 18000, 15);
		System.out.println("El plato es: " + NewRecipe.getName() + ", " + "El precio es: $" + NewRecipe.getPrice()
				+ ", " + "Su plato estara listo en: " + NewRecipe.getTime() + " minutos");
		NewRecipe.setName("Sancocho de gallina");

		NewRecipe.setPrice(20000);

		NewRecipe.setTime(20);

		System.out.println("El plato es: " + NewRecipe.getName() + ", " + "El precio es: $" + NewRecipe.getPrice()
				+ ", " + "Su plato estara listo en: " + NewRecipe.getTime() + " minutos");

		/// Table

		Table NewTable = new Table("10", 4, "primer piso");
		System.out.println("Su mesa es la numero: " + NewTable.getNumber() + ", " + "La mesa tiene una capacidad de: "
				+ NewTable.getCapacity() + " personas" + ", " + "Su mesa esta ubicada en el " + NewTable.getLocation());

		NewTable.setNumber("20");
		
		NewTable.setCapacity(6);
		
		NewTable.setLocation("segundo piso");
		
		System.out.println("Su mesa es la numero: " + NewTable.getNumber() + ", " + "La mesa tiene una capacidad de: "
				+ NewTable.getCapacity() + " personas" + ", " + "Su mesa esta ubicada en el " + NewTable.getLocation());

	}

}
