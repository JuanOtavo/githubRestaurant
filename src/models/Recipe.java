package models;

public class Recipe {
	
	/// Attributes
	private String name;
	private int price;
	private int time;
	
	/// Constructor
	public Recipe(String name, int price, int time) {
		super();
		this.name = name;
		this.price = price;
		this.time = time;
	}
	
	/// Methods
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	
	

}
