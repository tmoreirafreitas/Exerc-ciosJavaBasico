package com.tgmf.exercicio20;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
		var respostas = new ArrayList<Character>();
		var scan = new Scanner(System.in);
		
		System.out.println("Responda com S - (Sim) ou N - (N�o) as 5 perguntas abaixo: ");
		
		System.out.println("a) Telefonou para a v�tima? ");
		respostas.add(scan.next().charAt(0));
		
		System.out.println("b) Esteve no local do crime? ");
		respostas.add(scan.next().charAt(0));
		
		System.out.println("c) Mora perto da v�tima? ");
		respostas.add(scan.next().charAt(0));
		
		System.out.println("d) Devia para a v�tima? ");
		respostas.add(scan.next().charAt(0));
		
		System.out.println("e) J� trabalhou com a v�tima? ");
		respostas.add(scan.next().charAt(0));
		
		var classificadoComo = "";
		var respostaPositiva = respostas.stream().filter(c->c.charValue() == 'S' || c.charValue() == 's').count();
		
		if(respostaPositiva == 2) {
			classificadoComo = "Suspeito";
		}else if(respostaPositiva >= 3 && respostaPositiva <= 4) {
			classificadoComo = "C�mplice";
		}else if(respostaPositiva == 5) {
			classificadoComo = "Assassino";
		}else {
			classificadoComo = "Inocente";
		}
		
		System.out.println("\n\nVoc� �: " + classificadoComo);
		
		scan.close();
	}
}
