import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		System.out.println("========================");
		System.out.println("Detector de PAR / IMPAR");
		System.out.println("========================");
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o Número desejado: ");
		int Valor = entrada.nextInt();
		entrada.close();
		if (Valor % 2 == 0) {
			System.out.println("O número: " + Valor + " é par!");
		}
		else {
			System.out.println("O número: " + Valor + " é Impar!");
		}
	}
}
