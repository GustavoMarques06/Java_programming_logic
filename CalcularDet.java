import java.util.Scanner;

public class CalcularDet {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor 1 x 1: ");
		int M1x1 = entrada.nextInt();

		System.out.print("Digite o valor 1 x 2: ");
		int M1x2 = entrada.nextInt();

		System.out.print("Digite o valor 2 x 1: ");
		int M2x1 = entrada.nextInt();

		System.out.print("Digite o valor 2 x 2: ");
		int M2x2 = entrada.nextInt();

		int[][] Matriz = new int[2][2];
		Matriz[0][0] = M1x1;
		Matriz[0][1] = M1x2;
		Matriz[1][0] = M2x1;
		Matriz[1][1] = M2x2;

		for (int i = 0; i < Matriz.length ; i++) {
			for (int j = 0; j < Matriz[i].length ; j++) {
				System.out.print(Matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
        System.out.println("===============================");
        System.out.println("Calcular Determinante: ");
        int Valor1 = M1x1 * M2x2;
        int Valor2 = M1x2 * M2x1;
        System.out.print("Diagonal 1: " + Valor1);
        System.out.print("\nDiagonal 2: " + Valor2);
        System.out.print("\nDeterminante dessa matriz é: " + (Valor1 - Valor2));
        System.out.println("\n==============================="); 
	}
}   
