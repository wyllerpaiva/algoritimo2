package treino;

import java.util.Scanner;

public class CP {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int sexo,idade,cont=0,contm=0,contf=0,conti=0;
	while(cont<=10) {
		
		System.out.println("Digite idade homem=1|mulher=2");
		sexo=in.nextInt();
		if (sexo==1) {
		contm++;
		}
		if (sexo==2) {
			contf++;
		}
		if ((sexo!=1) && (sexo!=2)) {
		System.out.println("idade inv�lida");
		}
		System.out.println("Digite a sua idade");
		idade=in.nextInt();
		if (idade<18) {
			System.out.println("Idade inv�lida");
		}
		if (idade>=18) {
			conti++;
		}
	}
	System.out.println("O numero de homens s�o "+contm);
	System.out.println("O n�mero de mulheres s�o "+contf);
}
}
