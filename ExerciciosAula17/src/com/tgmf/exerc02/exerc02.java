package com.tgmf.exerc02;

import java.util.Scanner;

public class exerc02 {

	public static void main(String[] args) {
		var scan = new Scanner(System.in);
		
		var nome = "";		
		System.out.print("Informe o nome do usuário: ");
		nome = scan.nextLine();
		
		var senha = "";
		do {
			System.out.print("\r\nInforme a senha: ");
			senha = scan.nextLine();

			if (nome.equals(senha)) {
				System.out.println("A senha não pode ser igual ao nome do usuário, favor escolha outra senha!");
			}
		} while (nome.equals(senha));
		
		scan.close();
	}
}
