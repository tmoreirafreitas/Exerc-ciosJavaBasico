package com.tgmf.exercicio10;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.print("Informe a temperatura Celsius para ser convertido em Fahrenheit: ");
		double fahrenheit = scan.nextDouble();

		double celsius = converterCelsiusParaFahrenheit(fahrenheit);
		DecimalFormat numeroFormat = new DecimalFormat("#.00");
		System.out.println("\r\nTemperatura em Celsius: " + numeroFormat.format(celsius) + "F");

		scan.close();
	}

	private static double converterCelsiusParaFahrenheit(double celsius) {
		double fahrenheit = celsius * (9 / 5.0) + 32;
		return fahrenheit;
	}

}
