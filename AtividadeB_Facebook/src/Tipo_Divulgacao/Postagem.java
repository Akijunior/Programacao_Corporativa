package Tipo_Divulgacao;

import java.util.ArrayList;

import Tipo_Resposta.Comentario;
import Tipo_Usuarios.Usuario;

public class Postagem {
	
	public String tipo;
	public String conteudo;
	
	public ArrayList<Usuario> lista_curtidores = new ArrayList<Usuario>();
	public ArrayList<Comentario> lista_comentarios = new ArrayList<Comentario>();
	public int qtd_total_likes = 0;
	
	public int qtd_likes_curtir = 0;
	public int qtd_likes_amei = 0;
	public int qtd_likes_haha = 0;
	public int qtd_likes_uau = 0;
	public int qtd_likes_triste = 0;
	public int qtd_likes_grr = 0;
	
	public void Atualizar_Total_Likes(){
		this.qtd_total_likes = lista_curtidores.size();
	}
	
	
	public Postagem(String tipo, String conteudo) {
		
		this.tipo = tipo;
		this.conteudo = conteudo;
	}
	
	public void Adicionar_Curtidor(Usuario user) {
			
			lista_curtidores.add(user);
		}
	
	
	
	public void Carregar_Comentario(Usuario user){
		
		lista_comentarios.add(user.novo_comentario);
	}
	
}
