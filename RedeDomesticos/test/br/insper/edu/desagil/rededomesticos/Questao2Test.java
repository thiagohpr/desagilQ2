package br.insper.edu.desagil.rededomesticos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.insper.desagil.rededomesticos.Testador;



class Questao2Test {
	private Testador t;
	private static double DELTA = 0.00;
	@BeforeEach
	private void setUp() {
	    t = new Testador();
	}
	@Test
	void testeZero(){
		   assertEquals(0,t.testeZero(),DELTA);
	}
	@Test
	void testeUmaAvaliacao(){
		   assertEquals(3,t.testeUmaAvaliacao(),DELTA);
	}
	@Test
	void testeDuasAvaliacoesArrenCima(){
		   assertEquals(3,t.testeDuasAvaliacoesArrenCima(),DELTA);
	}
	@Test
	void testeTresAvaliacoesArrenBaixo(){
		   assertEquals(2,t.testeTresAvaliacoesArrenBaixo(),DELTA);
	}
	@Test
	void testeDoisVideos(){
		   assertEquals(5,t.testeDoisVideos(),DELTA);
	}


}
