import java.util.Scanner; 

public class Calculadora {
  public static void main(String [] args) {
    System.out.println("=============================");
	System.out.println("Calculadora Top");
    System.out.println("=============================");
    
    
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o primeiro numero: ");
    double Valor1 = entrada.nextDouble();
    System.out.print("\nDigite o segundo numero: ");
    double Valor2 = entrada.nextDouble();
    System.out.println("\n=============================");
    
    System.out.println("Digite (1) para Soma");
    System.out.println("Digite (2) para Subtração");
    System.out.println("Digite (3) para Multiplicação");
    System.out.println("Digite (4) para Divisão");
    System.out.println("=============================");
	
    System.out.print("Digite a Operação Desejada: ");
    int Operacao = entrada.nextInt();
    entrada.close();
    
    switch(Operacao){
        case 1:
            double Add = Valor1 + Valor2;
            System.out.println(Valor1 + " + " + Valor2 + " = " + (Add));
            break;
    
        case 2:
            double Sub = Valor1 - Valor2;
            System.out.println(Valor1 + " - " + Valor2 + " = " + (Sub));
            break;
        case 3:
            double Mult = Valor1 * Valor2;
            System.out.println(Valor1 + " X " + Valor2 + " = " + (Mult));
            break;
    
        case 4:
            double Div = Valor1 / Valor2;
            System.out.println(Valor1 + " / " + Valor2 + " = " + (Div));
            break;

    }
    System.out.println("=============================");
    
  }
}
