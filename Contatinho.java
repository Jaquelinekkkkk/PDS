package Aulaa;

public class Contatinho {
	private String nome;
	private String email;
	private String telefone;
	private String categoria;
	
	public Contatinho(String nome1, String email1, String telefone1, String categoria1) {
		this.nome = nome1;
		this.email = email1;
		this.telefone = telefone1;
		this.categoria = categoria1;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	} 
	@Override
	public String toString() {
		return nome + "#" + email + "#" + telefone + "#" + categoria;
	}
	

}
