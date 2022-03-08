package com.tgmf.exercicio22;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exerc22 {

	public static void main(String[] args) {
		var scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Informe a quantidade de morango a ser comprado (kg): ");
		var precoMorangoKg = 0.0;
		var qtdMorango = scan.nextDouble();
		if(qtdMorango < 0) {
			System.out.println("Valor inválido, saindo do sistema...");
			System.exit(-1);
		}else if(qtdMorango > 5) {
			precoMorangoKg = 2.20;
		}else {
			precoMorangoKg = 2.50;
		}
		
		System.out.println("Informe a quantidade de maçã a ser comprada (kg): ");
		var precoMacaKg = 0.0;
		var qtdMaca = scan.nextDouble();		
		if(qtdMaca < 0) {
			System.out.println("Valor inválido, saindo do sistema...");
			System.exit(-1);
		}else if(qtdMorango > 5) {
			precoMacaKg = 1.50;
		}else {
			precoMacaKg = 1.80;
		}
		
		var pesoTotal = qtdMorango + qtdMaca;
		var valorComprado = (precoMacaKg * qtdMaca) + (precoMorangoKg * qtdMorango);
		var valorASerPago = 0.0;
		
		if(pesoTotal > 8 || valorComprado > 25) {
			valorASerPago = valorComprado - (valorComprado * 0.10);
		}else {
			valorASerPago = valorComprado;
		}
		
		var numeroFormat = new DecimalFormat("#.00");
		System.out.println("Valor total a ser pago: R$ " + numeroFormat.format(valorASerPago));
		
		scan.close();
	}
}