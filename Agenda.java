package Aulaa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Agenda {
	private List<Contatinho> contatinhos;
	public Agenda() {
		this.contatinhos = new ArrayList<>();
	}
	// metodo para adicionar contatos por nome
	public void addContatinho(Contatinho contatinho) {
		this.contatinhos.add(contatinho);
	}
	//metodo para adicionar lista de contatos por nome
	public void ordenarLista() {
		Collections.sort(contatinhos, Comparator.comparing(Contatinho::getNome));
	}
	//METODO PARA SALVAR LISTA ORDENADA EM UMA ARQUIVO TEXTO
	public void salvarLista(String nomeArquivo) {
		ordenarLista();
		try (BufferedWriter wr = new BufferedWriter( new FileWriter(nomeArquivo))){
			for(Contatinho ct: contatinhos){
				wr.write(ct.toString(   ));
			wr.newLine();
		}
			System.out.println("Lista salva no arquivo: " + nomeArquivo);
			
		}catch(Exception e) {
			System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
		}
		
	}
	public Contatinho lerContatinhoPorNome(String nome, String nomeArquivo) {
		try (BufferedReader reader = new BufferedReader( new FileReader(nomeArquivo))){
			String linha;
			while((linha = reader.readLine()) !=null){
				String[] partes = linha.split("#");
				if(partes.length == 4 && partes[0].equalsIgnoreCase(nome)) {
					return new Contatinho(partes[0], partes[1], partes[2], partes[3]);
				}
			}
			
		}catch(IOException e) {
			System.out.println("Erro ao ler arquivo: " + e.getMessage());
		}
		
		return null;
	}
	

}
