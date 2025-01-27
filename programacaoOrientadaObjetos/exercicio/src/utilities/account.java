package utilities;

public class account {
	private int number;
	private String holder;
	private double value = 0;
	
	
	public account(int number, String holder, double value) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(value);
	}
	
	public account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
		this.value = 0;
	}

	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getValue() {
		return value;
	}

	public int getNumber() {
		return number;
	}
	
	public void deposit(double value) {
		this.value += value;
	}

	public void withdraw(double value) {
		this.value -= (value + 5.0) ;
	}
	
	public String toString() {
		return ("Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", value) + "\n");
	}
	
}
