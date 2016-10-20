import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		
		int op;
		Cliente cli1 = new Cliente();
		Produto prod1 = new Produto();
		NFe notaFiscal = new NFe();
		DetalheNotaFiscal detalheNF = new DetalheNotaFiscal();
		Scanner in = new Scanner (System.in);
		
		do {
		System.out.println("1. Cadastrar Cliente");
		System.out.println("2. Cadastrar Produto");
		System.out.println("3. Registrar NFe");
		System.out.println("4. Ver Nota Fiscal Eletronica");
		System.out.println("5. Sair");
		op = in.nextInt();
		
			switch (op) {
				case 1:
					System.out.println("===Cadastro de Cliente===");
					System.out.println("\nDigite Codigo do Cliente");
					cli1.codigo_cliente = in.next();
					System.out.println("Digite Nome do Cliente");
					cli1.nome_cliente = in.next();
					System.out.println("Digite Endereço do Cliente");
					cli1.endereco_cliente = in.next();
					break;
				case 2:
					System.out.println("===Cadastro do Produto===");
					System.out.println("\nDigite Codigo do Produto");
					prod1.codigo_produto = in.next();
					System.out.println("Digite Nome do Produto");
					prod1.nome_produto = in.next();
					break;
				case 3:
					System.out.println("===Cadastro da Nota Fiscal===");
					System.out.println("\nDigite Número da Nota Fiscal");
					notaFiscal.numero_nfe = in.next();
					System.out.println("Digite a Data da Nota Fiscal");
					notaFiscal.data_nfe = in.next();
					System.out.println("Digite o Valor da Nota Fiscal");
					notaFiscal.valor= in.next();
					notaFiscal.clienteDaNota = cli1;
					
					System.out.println("===Detalhe da NFe===");
					detalheNF.nFiscalE = notaFiscal;
					detalheNF.produto = prod1;
					System.out.println("Para : " + prod1.codigo_produto + " " + prod1.nome_produto + " ");
					System.out.println("Digite Quantidade: ");
					detalheNF.quantidade = in.nextInt();
					System.out.println("Digite preco unitario: ");
					detalheNF.preco_unitario = in.nextInt();
					break;
				case 4:
					System.out.println("===NFe===");
					System.out.println("Numero: " + notaFiscal.numero_nfe);
					System.out.println("Data: " + notaFiscal.data_nfe);
					System.out.println("Cliente Codigo: " + notaFiscal.clienteDaNota.codigo_cliente);
					System.out.println("Cliente Nome: " + notaFiscal.clienteDaNota.nome_cliente);
					System.out.println("Cliente Endereço: " + notaFiscal.clienteDaNota.endereco_cliente);
					System.out.println("=== = ===");
					System.out.println(detalheNF.produto.codigo_produto +" "+ detalheNF.produto.nome_produto + " "+ detalheNF.quantidade +"\n");
					break;
				default:
					break;
			}
		} while (op != 5);
		System.out.println("Fim da Execução!");
		in.close();
	}

}
