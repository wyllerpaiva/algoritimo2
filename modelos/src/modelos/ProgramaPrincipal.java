package modelos;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Disciplina a = new Disciplina();
		a.nome = "AOO";
		Disciplina b = new Disciplina();
		b.nome = "UML";
		a.pre_req = b;
		System.out.println("Qual seu nome: ");
		a.pre_req.nome = "Fisica";
	}
}
