package com.tgmf.exerc03;

import java.util.Locale;
import java.util.Scanner;

public class exerc03 {

	public static void main(String[] args) {
		var scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		String nome;		
		do
		{
			System.out.println("Favor informe o seu nome: ");
			nome = scan.nextLine();
			
			if(nome.length() <= 3) {
				System.out.println("Error ao preencher o nome.\nO nome precisa ter mais de 3 caracteres!");
			}
		}while(nome.length() <= 3);
		
		int idade;
		do
		{
			System.out.println("Favor informe a sua idade: ");
			idade = scan.nextInt();
			
			if(!(idade > 0 && idade < 150)) {
				System.out.println("Error ao informar a idade.\nSua idade tem que ser maior que 0 e menor que 150!");
			}
		}while(!(idade > 0 && idade < 150));
		
		double salario;		
		do
		{
			System.out.println("Favor informe seu sal�rio: ");
			salario = scan.nextDouble();
			
			if(salario <= 0) {
				System.out.println("Error ao informar o sal�rio.\nSeu sal�rio tem de ser positivo!");
			}
		}while(salario <= 0);
		
		char sexo;		
		do
		{
			System.out.println("Favor informe seu sexo (F-feminino ou M-masculino): ");
			sexo = scan.next().toLowerCase().charAt(0);
			
			if(sexo != 'm' && sexo != 'f') {
				System.out.println("Error ao informar o sexo.\nSexo tem de ser uma das duas op��es: (F-feminino ou M-masculino)");
			}
		}while(sexo != 'm' && sexo != 'f');
		
		char estadoCivil;
		do
		{
			System.out.println("Favor informe seu estado civil: (S-solteiro; C-casado; V-vi�vo; D-divorciado): ");
			estadoCivil = scan.next().toLowerCase().charAt(0);
			
			if(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
				System.out.println("Error ao informar o estado civil.\nEstado civil tem de ser uma das op��es: (S-solteiro; C-casado; V-vi�vo; D-divorciado)");
			}
		}while(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');
		
		scan.close();
	}
}