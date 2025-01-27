package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) { //Sobrecarga de declaração de construtor
		this.name = name;
		this.price = price;
	}
	
	public Product() { //Sobrecarga com declaração do construtor padrão
		name = "";
		price = 0.0;
		quantity = 0;
	}	
	
	public double totalValueInStock(){
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		if (this.quantity == 0) {
			System.out.println("Não há itens em estoque");
		}else if(quantity > this.quantity) {
			this.quantity = 0;
		}else {
			this.quantity -= quantity;
		}
	}
	
	public String toString() {
		return (name + ", $" + String.format("%.2f", price) + ", " + quantity + " units" + ", Total: $" + String.format("%.2f", totalValueInStock()));
	}
}
