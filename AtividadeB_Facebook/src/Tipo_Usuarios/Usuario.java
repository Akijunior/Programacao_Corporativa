package Tipo_Usuarios;

import java.util.ArrayList;

import Tipo_Divulgacao.Postagem;
import Tipo_Perfil.Perfil_Usuario;
import Tipo_Resposta.Comentario;

public class Usuario {
	

	public Perfil_Usuario perfil;
	public Comentario novo_comentario;
	
	ArrayList<Postagem> lista_postagens = new ArrayList<Postagem>();
	
	public void Nova_Amizade(){

	}
	
	public Comentario Novo_Comentario(String mensagem){
		
		Comentario comentario = new Comentario(mensagem);
		this.novo_comentario = comentario;
		
		return comentario;
	}
	
	public Postagem Gerar_Postagem(String tipo_postagem, String conteudo){
		
		Postagem postagem = new Postagem(tipo_postagem, conteudo);
		lista_postagens.add(postagem);
		
		return postagem;
	}
	
	

}
