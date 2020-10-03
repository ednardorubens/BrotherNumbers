package br.com.ermig.brother_numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberSearchTest {

//	Dois n�meros inteiros n�o negativos s�o chamados de irm�os se eles podem ser
//	obtidos uns dos outros, apenas reorganizando os d�gitos de suas representa��es
//	decimais. Por exemplo, 123 e 213 s�o irm�os. 535 e 355 tamb�m s�o irm�os.
//	Um conjunto que consiste em um inteiro n�o negativo N e todos os seus irm�os �
//	chamado de fam�lia de N. Por exemplo, a fam�lia de 553 � composta por tr�s n�meros:
//	355, 535 e 553.
//	Escreva um algoritmo de contenha uma fun��o com as seguintes entradas e sa�das:
//	- entrada: N (inteiro)
//	- sa�da: inteiro
//	Dado um n�mero inteiro n�o negativo N, a fun��o deve retornar o maior n�mero na
//	fam�lia de N. Ela deve retornar -1 se o resultado exceder 100.000.000.
//	Exemplo, uma resposta para este exerc�cio pode ter o seguinte formato:
//	 solution int(int N);
//	A inser��o de N=213 nesta fun��o deve retornar 321. Para N=553, a fun��o deve
//	retornar 553.

	@Test
	@DisplayName("Dado um n�mero inteiro n�o negativo N, a fun��o deve retornar o maior n�mero na fam�lia de N")
	void testBrotherNumbers() {
		assertEquals(321, NumberSearch.getMaxBrother(213));
		assertEquals(553, NumberSearch.getMaxBrother(553));
		assertEquals(100, NumberSearch.getMaxBrother(100));
		assertEquals(222, NumberSearch.getMaxBrother(222));
		assertEquals(731, NumberSearch.getMaxBrother(173));
		assertEquals(920, NumberSearch.getMaxBrother(209));
		assertEquals(543, NumberSearch.getMaxBrother(345));
		assertEquals(983, NumberSearch.getMaxBrother(398));
		assertEquals(775, NumberSearch.getMaxBrother(577));
	}

	@Test
	@DisplayName("A fun��o deve retornar -1 se o resultado exceder 100.000.000")
	void testNumeroExcedeLimite() {
		assertEquals(-1, NumberSearch.getMaxBrother(0));
		assertEquals(-1, NumberSearch.getMaxBrother(100000000));
	}

}
