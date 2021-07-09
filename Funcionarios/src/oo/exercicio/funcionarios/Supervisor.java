package oo.exercicio.funcionarios;

public class Supervisor extends Funcionario {

	public Supervisor(String nome, Double salario) {
		super(nome, salario);
	}

	@Override
	public Double getImposto() {
		return super.getImposto() * 0.05;
	}

	@Override
	public String toString() {
		return "Supervisor [Nome= " + getNome() + ", Salario= " + getSalario() + ", Imposto=" + getImposto() + "]";
	}

}
