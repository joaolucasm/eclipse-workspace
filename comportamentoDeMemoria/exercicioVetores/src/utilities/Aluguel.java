package utilities;

public class Aluguel {
	
	private String name;
	private String email;
	private int quarto;
	
	public Aluguel(String name, String email, int quarto) {
		this.name = name;
		this.email = email;
		this.quarto = quarto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	
	
	
}
