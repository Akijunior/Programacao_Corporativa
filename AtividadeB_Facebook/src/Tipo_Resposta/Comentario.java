package Tipo_Resposta;

import java.util.ArrayList;

import Tipo_Usuarios.Usuario;

public class Comentario {
	
	public String mensagem;
	public ArrayList<Usuario> usuario_marcado = new ArrayList<Usuario>();
	public int conta_likes;
	ArrayList<Resposta> respostas = new ArrayList<Resposta>();
	
	
	public Comentario(String mensagem) {

		this.mensagem = mensagem;
	}
	
	public void Novo_Comentario(String mensagem) {

		this.mensagem = mensagem;
	}
	
	

}
