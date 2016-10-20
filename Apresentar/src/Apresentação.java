import java.util.Random;
import java.util.Scanner;

public class Apresenta��o {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int valor = 0, tentativa = 0;
		String nome;
		System.out.print("Digite seu nome: ");
		nome = sc.next();
		int x = rand.nextInt(100);
		while (valor != x ) {
			System.out.print("Tente descobrir o n�mero. Digite um valor: ");
			valor = sc.nextInt();
			if (valor < x ) {
				System.out.println("\nO valor � maior. Tente novamente.");
				tentativa++;
			} else if (valor > x ) {
				System.out.println("\nO valor � menor. Tente novamente.");
				tentativa++;
			} else {
				System.out.println("\nParab�ns!! Voc� acertou.");
				tentativa++;
				System.out.println("Nome: " + nome);
			}
			System.out.println("Tentativas: " + tentativa + "\n");
		}
		System.out.println("Fim da Execu��o.");
		sc.close();

	}

}
