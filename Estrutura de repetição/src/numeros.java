import java.util.Scanner;

public class numeros {
public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int n,s;
	String resp;
 do {
	System.out.println("Digite dois m�meros");
	s = teclado.nextInt();
	n = teclado.nextInt();
	s = s + n;
	System.out.print("Deseja continuar ? [s/n]");
    resp = teclado.next();
 }  while(resp.equals("s"));
System.out.print("A soma �:" + s );
teclado.close();
}}
 
