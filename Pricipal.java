package Aulaa;

import java.util.Scanner;

public class Pricipal {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		String nomeArquivo =  "contatinhos.txt";
		
		agenda.addContatinho(new Contatinho("Ana Silva", "ana@exemplo.com", "1234", "arquiteta"));
		agenda.addContatinho(new Contatinho("Ane Silva", "ana@exemplo.com", "1234", "arquiteta"));
		agenda.addContatinho(new Contatinho("Ani Silva", "ana@exemplo.com", "1234", "arquiteta"));
		agenda.addContatinho(new Contatinho("Any Silva", "ana@exemplo.com", "1234", "arquiteta"));
// salvar contatos no arquivo
		agenda.salvarLista("nomeArquivo.txt");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Favor informar um nome para procurar: ");
		String nome = scanner.nextLine();
		Contatinho contatinho = agenda.lerContatinhoPorNome(nome, nomeArquivo);
		
		//System.out.println(contatinho);
		if(contatinho != null) {
			System.out.println("Oba! achei o contatinho: ");
			System.out.println("Nome: " + contatinho.getNome());
			System.out.println("Email: " + contatinho.getEmail());
			System.out.println("Telefone: " + contatinho.getTelefone());
			System.out.println("Categoria: " + contatinho.getCategoria());
		}else {
			System.out.println("Contatinho nao encontrado!");
		}

	}

}
