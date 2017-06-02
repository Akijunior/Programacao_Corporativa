package Tipo_Divulgacao;

public class Anuncio {
	
	private String titulo;
	private String tipo;
	private String corpo_mensagem;
	private double preco_divulgacao;
	
	
	public Anuncio(String titulo, String tipo, String corpo_mensagem, double preco_divulgacao) {
		
		this.titulo = titulo;
		this.tipo = tipo;
		this.corpo_mensagem = corpo_mensagem;
		this.preco_divulgacao = preco_divulgacao;
	}
	
	
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCorpo_mensagem() {
		return corpo_mensagem;
	}
	public void setCorpo_mensagem(String corpo_mensagem) {
		this.corpo_mensagem = corpo_mensagem;
	}
	public double getPreco_divulgacao() {
		return preco_divulgacao;
	}
	public void setPreco_divulgacao(double preco_divulgacao) {
		this.preco_divulgacao = preco_divulgacao;
	}
	
	

}
