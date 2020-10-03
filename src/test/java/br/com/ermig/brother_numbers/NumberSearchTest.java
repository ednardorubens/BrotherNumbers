package br.com.ermig.brother_numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberSearchTest {

//	Dois números inteiros não negativos são chamados de irmãos se eles podem ser
//	obtidos uns dos outros, apenas reorganizando os dígitos de suas representações
//	decimais. Por exemplo, 123 e 213 são irmãos. 535 e 355 também são irmãos.
//	Um conjunto que consiste em um inteiro não negativo N e todos os seus irmãos é
//	chamado de família de N. Por exemplo, a família de 553 é composta por três números:
//	355, 535 e 553.
//	Escreva um algoritmo de contenha uma função com as seguintes entradas e saídas:
//	- entrada: N (inteiro)
//	- saída: inteiro
//	Dado um número inteiro não negativo N, a função deve retornar o maior número na
//	família de N. Ela deve retornar -1 se o resultado exceder 100.000.000.
//	Exemplo, uma resposta para este exercício pode ter o seguinte formato:
//	 solution int(int N);
//	A inserção de N=213 nesta função deve retornar 321. Para N=553, a função deve
//	retornar 553.

	@Test
	@DisplayName("Dado um número inteiro não negativo N, a função deve retornar o maior número na família de N")
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
	@DisplayName("A função deve retornar -1 se o resultado exceder 100.000.000")
	void testNumeroExcedeLimite() {
		assertEquals(-1, NumberSearch.getMaxBrother(0));
		assertEquals(-1, NumberSearch.getMaxBrother(100000000));
	}

}
