import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("=============================");
		System.out.println("Conversor de idade para dias");
		System.out.println("=============================");
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o Dia de nascimento: ");
		int diaPessoa = entrada.nextInt();
		System.out.print("\nDigite o mes de nascimento: ");
		int mesPessoa = entrada.nextInt();
		System.out.print("\nDigite o ano de nascimento: ");
		int anoPessoa = entrada.nextInt();
		entrada.close();
		
		int idadeAno = ((2025 - anoPessoa)* 12) * 30;
		int idadeMes = mesPessoa * 30;
		int diasTotais = idadeMes + idadeAno + diaPessoa;
		System.out.println("\nSua data de nascimento é: "+ diaPessoa + "/" + mesPessoa + "/" + anoPessoa);
		System.out.println("E você tem: " + diasTotais + " dias de vida");
	}
}
