package Atv1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscreverTabuada {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 10");
		int numero = leitor.nextInt();		
		String nomeArquivo =  "tabuada_" + numero + ".txt";
		
		
		
		
		try 
			(BufferedWriter escrita = new BufferedWriter( new FileWriter(nomeArquivo))){
				for (int i = 1; i<= 10; i++) {
					escrita.write(numero + " X " + i  + "=" + (numero * i));
					escrita.newLine();
					
				}
				System.out.println("LerTabuada salva no arquivo: " + nomeArquivo);
				
			}
			catch (IOException e) {
				System.out.println("Erro ao escrever no arquivo: " + e.getLocalizedMessage() );
			}finally {
				leitor.close();
			}
	
		} 		

	}

