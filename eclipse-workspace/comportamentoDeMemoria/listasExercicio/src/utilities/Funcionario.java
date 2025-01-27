package utilities;

public class Funcionario {
	
	private Integer id;
	private String name;
	private Double salario;
	
	public Funcionario(Integer id, String name, Double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalario() {
		return salario;
	}
	
	public void aumento(double valor) {
		salario += salario * (valor/100);	
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salario);
	}
}
