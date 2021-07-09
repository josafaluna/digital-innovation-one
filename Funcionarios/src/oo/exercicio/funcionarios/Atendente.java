package oo.exercicio.funcionarios;

public class Atendente extends Funcionario {

	public Atendente(String nome, Double salario) {
		super(nome, salario);
	}

	@Override
	public Double getImposto() {
		return super.getImposto() * 0.01;
	}

	@Override
	public String toString() {
		return "Atendente [Nome= " + getNome() + ", Salario= " + getSalario() + ", Imposto=" + getImposto() + "]";
	}

}
