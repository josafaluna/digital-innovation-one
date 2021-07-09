package oo.exercicio.funcionarios;

public class Gerente extends Funcionario {

	public Gerente(String nome, Double salario) {
		super(nome, salario);
	}

	@Override
	public Double getImposto() {
		return super.getImposto() * 0.1;
	}

	@Override
	public String toString() {
		return "Gerente [Nome= " + getNome() + ", Salario= " + getSalario() + ", Imposto=" + getImposto() + "]";
	}

}
