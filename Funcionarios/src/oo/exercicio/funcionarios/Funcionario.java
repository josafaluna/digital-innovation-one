package oo.exercicio.funcionarios;

public class Funcionario {

	private String nome;
	private Double salario;

	public Funcionario(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}

	public Double getImposto() {
		return this.salario;
	}

	@Override
	public String toString() {
		return "Funcionario [Nome= " + getNome() + ", Salario= " + getSalario() + "]";
	}

}
