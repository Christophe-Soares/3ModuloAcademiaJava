package aula4ICQS;

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
 * teste feito no branch teste e merge no master atraves do terminal git no eclipse
 * teste branch novoSSSD
 */

public class Empregado {

	private String nome;
	private double salario;
	private String funcao;

	public double calcularSalarioMensal() {
		double salarioMensal = getSalario();
		if (salarioMensal > 3000) {
			return salarioMensal *= 1.05;
		} else if (salarioMensal > 1000 && salarioMensal <= 3000) {
			return salarioMensal *= 1.15;
		} else {
			return salarioMensal *= 1.2;
		}
	}

	public double calcularSalarioAnual() {
		double salarioAnual = calcularSalarioMensal() * 14;
		return salarioAnual;
	}

	public Empregado(String nome, double salario, String funcao) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.funcao = funcao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
