package Tipo_Divulgacao;

import java.util.ArrayList;

import Tipo_Resposta.Comentario;
import Tipo_Usuarios.Amizade;
import Tipo_Usuarios.Usuario;

public class Postagem {
	
	public String tipo;
	public String conteudo;
	private Usuario criador_da_postagem;
	private String data_postagem;
	
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
	
	
	public void Marcar_Amigos(){
		
		for(Amizade amigo : criador_da_postagem.lista_amigos){
			if(conteudo.contains(amigo.usuario.perfil.getNome()))
				amigo.usuario.lista_notificacoes.add(criador_da_postagem.perfil.getNome() + " " + criador_da_postagem.perfil.getSobrenome()
				+ " marcou você em uma publicação sobre " + this.tipo + " em " + this.data_postagem + ".");
		}
	}
	
	
	public void Adicionar_Curtidor(Usuario user) {
			
			lista_curtidores.add(user);
			String mensagem = 
					user.perfil.getNome() + " acaba de curtir sua postagem sobre " 
					+ this.tipo + ".";
			criador_da_postagem.lista_notificacoes.add(mensagem);
			
		}
	
	
	
	public void Carregar_Comentario(Usuario user){
		
		lista_comentarios.add(user.novo_comentario);
		for(Usuario usuario : lista_curtidores){
			usuario.lista_notificacoes.add("O usuário " + user.perfil.getNome() + " " + user.perfil.getSobrenome()
			+ " também comentou na postagem sobre " + this.tipo + " de " + this.criador_da_postagem + ".");
		}
	}
	
}
