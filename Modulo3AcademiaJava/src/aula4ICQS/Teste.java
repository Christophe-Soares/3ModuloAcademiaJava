package aula4ICQS;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/*
 * Exercicio solicitado pelo Antonio na 4 aula de Integracao Continua e Qualidade de Software - 3º Modulo da Academia de Java.
 * Fazer um projecto utilizando a extensao .git
 * Criar 2 classes, uma classe Salario e outra class Main.
 * A classe salario vai ter 3 atributos: nome, salario mensal, funcao.
 * Criar getters e setters e respectivos constructores da classe.
 * a classe salario vair ter 2 metodos, 1 calcula salario anual e outro calcula o aumento de salario com base no seguinte:
 * > 3000.00€ +5%
 * > 1000.00€ <= 3000.00€ +15%
 * < 1000.00€ +20%
 * A class Main vai instanciar varios Salarios e apresentar o respectivo salario mensal e o salario anual.
 * Criar testes JUNIT para cada um dos 2 metodos "calcularSalarioMensal" e "calcularSalarioAnual"
 * Criar testes JUNIT para cada um dos diversos atributos
 * Fazer upload das classes para a plataforma GITHUB e enviar o link para o Antonio
 * 
 * Teste commit atraves do terminal
 * 
 * teste feito no branch teste e merge no master atraves do terminal git no eclipse
 * teste branch novoSSSD
 */

public class Teste {

	static Empregado emp = new Empregado("christophe", 1000, "Junior Developer");

	public static void main(String[] args) {

		System.out.println("O salario mensal do " + emp.getNome() + " cuja funcao e " + emp.getFuncao() + " e de "
				+ emp.calcularSalarioMensal());

		System.out.println("O salario anual do " + emp.getNome() + " cuja funcao e " + emp.getFuncao() + " e de "
				+ emp.calcularSalarioAnual());
		
		System.out.println("################################################################################");
		
		System.out.println("\nRelatório do JUNIT depois de completar os testes");

		// teste Runner do Junit
		Result result = JUnitCore.runClasses(ClasseTestesJunit.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
	}

}
