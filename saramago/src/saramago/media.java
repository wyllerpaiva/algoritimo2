package saramago;

import java.util.Scanner;

public class media {
public static void main(String[] args) {
Scanner in = new Scanner (System.in);
	
int n1=0,n2=0,media=0;

do {

System.out.println("Digite um número negativo para sair");
	
System.out.println("Digite a nota 1");
n1 = in.nextInt();
System.out.println("Digite a nota 2");
n2 = in.nextInt();


} while ((n2>0) || (n1>0));

media=(n1+n2)/2;

System.out.println("A média é "+media);


in.close();
}
}