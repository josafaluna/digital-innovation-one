package oo.exercicio.funcionarios;

public class TestaImpostoFuncionarios {

	public static void main(String[] args) {

		// funcion�rio
		Funcionario func = new Funcionario("Fulano de Tal", 1500.00);
		System.out.println(func);

		// gerente
		Gerente gerente = new Gerente("Jos� da Silva", 3500.00);
		System.out.println(gerente);

		// supervidor
		Supervisor supervisor = new Supervisor("Joaozinho", 2500.00);
		System.out.println(supervisor);

		// atendente
		Atendente atendente = new Atendente("Z� da Silva", 1500.00);
		System.out.println(atendente);

	}

}
