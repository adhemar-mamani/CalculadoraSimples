import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double valor1, valor2;

		System.out.print("Informe o primeiro valor: ");
		valor1 = teclado.nextDouble();
		System.out.print("Informe o segundo valor: ");
		valor2 = teclado.nextDouble();
		
		somar(valor1, valor2);
		subtrair(valor1, valor2);
		multiplicar(valor1, valor2);
		dividir(valor1, valor2);
		
		teclado.close();
	}

	private static void somar(double valor1, double valor2) {
		double resultado;
		resultado = valor1 + valor2;

		System.out.println(" ");
		System.out.println(valor1 + " + " + valor2 + " = " + resultado);
		System.out.println(" ");
	}

	private static void subtrair(double valor1, double valor2) {
		double resultado;
		resultado = valor1 - valor2;

		System.out.println(" ");
		System.out.println(valor1 + " - " + valor2 + " = " + resultado);
		System.out.println(" ");
		
	}

	private static void multiplicar(double valor1, double valor2) {
		double resultado;
		resultado = valor1 * valor2;

		System.out.println(" ");
		System.out.println(valor1 + " x " + valor2 + " = " + resultado);
		System.out.println(" ");
		
	}

	private static void dividir(double valor1, double valor2) {
		double resultado;
		resultado = valor1 / valor2;

		System.out.println(" ");
		System.out.println(valor1 + " / " + valor2 + " = " + resultado);
		System.out.println(" ");
		
	}

}
