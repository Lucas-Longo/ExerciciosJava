package sistemaCalculadora;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) throws Exception {
		Scanner leitor = new Scanner(System.in);
		System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Exponenciação\n6 - Fatorial");
		int tipo = leitor.nextInt();
		
		Operacao operacao;
		switch (tipo) {
		case 1:
			operacao = new Adicao(); break;
		case 2:
			operacao = new Subtracao(); break;
		case 3:
			operacao = new Multiplicacao(); break;
		case 4:
			operacao = new Divisao(); break;
		case 5:
			operacao = new Exponenciacao(); break;
		case 6:
			operacao = new Fatorial(); break;
		default:
			operacao = null;
			System.out.println("Não foi possível identificar a operação desejada!");
			leitor.close();
			throw new Exception("Operação desconhecida");
		}
		
		System.out.println("Digite o valor 1:");
		int valor1 = leitor.nextInt();
		
		int valor2 = 0;
		
		if (tipo != 6) {
			System.out.println("Digite o valor 2:");
			valor2 = leitor.nextInt();
		}
		
		leitor.close();
		
		System.out.println(operacao.calcular(valor1, valor2));
		
	}

}
