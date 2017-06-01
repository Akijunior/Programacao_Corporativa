package Tipo_Divulgacao;

import java.util.ArrayList;

import Tipo_Resposta.Comentario;
import Tipo_Usuarios.Usuario;

public class Postagem {
	
	String tipo;
	String conteudo;
	ArrayList<Comentario> lista_comentarios = new ArrayList<Comentario>();
	
	public Postagem(String tipo, String conteudo) {
		
		this.tipo = tipo;
		this.conteudo = conteudo;
	}
	
	public void Carregar_Comentario(Usuario user){
		
		lista_comentarios.add(user.novo_comentario);
	}
	
}
