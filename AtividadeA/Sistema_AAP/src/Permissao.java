
public class Permissao {
	
	boolean autorizacao = false;
	String descricao;
	String tipo;
	
	void Nova_Descricao(String descreva){
		
		this.descricao = descreva;
		this.autorizacao = true;
	}
	
}
