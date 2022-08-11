package com.tgmf.exerc04;

import java.text.DecimalFormat;

public class exerc04 {

	static int anos = 0;
	public static void main(String[] args) {
		var populacaoA = 0.0;
		var populacaoB = 0.0;
		do
		{
			++anos;
			populacaoA = obterPopulacaoA();
			populacaoB = obterPopulacaoB();			
		}while(populacaoA < populacaoB);
		
		DecimalFormat numeroFormat = new DecimalFormat("#");
		System.out.println("Foram necess�rios " + anos + " anos para a popula��o A ultrapassar ou igualar a popula��o B");
		System.out.println("Popula��o A: " + numeroFormat.format(populacaoA));
		System.out.println("Popula��o B: " + numeroFormat.format(populacaoB));
	}
	
	static double obterPopulacaoA() {
		return 80000 * (Math.pow(1 + 0.03, anos));
	}
	
	static double obterPopulacaoB() {
		return 200000 * (Math.pow(1 + 0.015, anos));
	}
}
