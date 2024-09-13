package Atv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LerTabuada {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 10");
		int numero = leitor.nextInt();		
		String nomeArquivo =  "tabuada_" + numero + ".txt";
		File arquivo = new File(nomeArquivo);

		if (!arquivo.exists()) {
			System.out.println("Arquivo não encontrado!");
		}else {
			
		
		
		try 
			(BufferedReader leitor1 = new BufferedReader( new FileReader(nomeArquivo))){
			System.out.println("Lendo arquivo...");
			String linha;
			while((nomeArquivo = leitor1.readLine()) !=null) {
				System.out.println( nomeArquivo);
			}
			}catch (IOException e) {
				System.out.println("Erro ao ler no arquivo: " + e.getLocalizedMessage() );
			}finally {
				leitor.close();
			}//pa
		}
		} 	// fim else
		
		} 