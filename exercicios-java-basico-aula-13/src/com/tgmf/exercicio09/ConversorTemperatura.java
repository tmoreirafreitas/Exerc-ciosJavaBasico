package com.tgmf.exercicio09;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.print("Informe a temperatura Farenheit para ser convertido em Celsius: ");
		double fahrenheit = scan.nextDouble();

		double celsius = converterFahrenheitParaCelsius(fahrenheit);
		DecimalFormat numeroFormat = new DecimalFormat("#.00");
		System.out.println("\r\nTemperatura em Celsius: " + numeroFormat.format(celsius) + "°C");

		scan.close();
	}

	private static double converterFahrenheitParaCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * (5 / 9.0);
		return celsius;
	}
}