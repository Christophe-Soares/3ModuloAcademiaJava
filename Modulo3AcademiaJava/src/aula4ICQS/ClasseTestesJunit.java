package aula4ICQS;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClasseTestesJunit extends Teste {

	// teste para verificar o valor extra pago ao funcionario
	@Test
	public void testeCalcularSalarioMensal() {

		assertEquals(1200, emp.calcularSalarioMensal(), 0.0);
	}

	// teste para verificar o valor do salario anual do funcionario
	@Test
	public void testeCalcularSalarioAnual() {

		assertEquals(16800, emp.calcularSalarioAnual(), 0.0);
	}

	@Test
	public void testeNome() {
		// coloquei este a dar erro... o 'C' esta em letra Maiscula
		assertEquals("Christophe", emp.getNome());

	}

	@Test
	public void testeFuncao() {
		// coloquei este a dar erro.. o 'Senior' em vez de Junior
		// Inverti tambem o tipo de teste, ou seja aquilo que tenho e aquilo que espero.
		assertEquals(emp.getFuncao(), "Senior Developer");

	}

}
