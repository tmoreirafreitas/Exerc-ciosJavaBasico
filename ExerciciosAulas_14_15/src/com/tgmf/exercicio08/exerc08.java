package com.tgmf.exercicio08;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class exerc08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		double maior = 0;
		double menor = 0;
		
		System.out.println("Digite o primeiro pre�o: ");
		menor = scan.nextDouble();
		maior = menor;
		
		System.out.println("Digite o segundo pre�o: ");
		var segundo = scan.nextDouble();
		if(segundo > maior) {
			menor = maior;
			maior = segundo;			
		}else {
			menor = segundo;
		}
		
		System.out.println("Digite o terceiro pre�o: ");
		var terceiro = scan.nextDouble();
		if(terceiro < menor)
			menor = terceiro;
		
		if(terceiro > maior) {
			maior = terceiro;
		}			
		
		DecimalFormat numeroFormat = new DecimalFormat("#.00");
		System.out.println("Voc� deve comprar o produto de pre�o: R$ " + numeroFormat.format(menor));
		scan.close();
	}
}
