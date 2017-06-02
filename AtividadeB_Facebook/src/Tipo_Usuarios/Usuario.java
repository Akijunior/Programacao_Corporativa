package Tipo_Usuarios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Facebook_BD.Facebook_Database;
import Tipo_Divulgacao.Postagem;
import Tipo_Grupo.Participacao;
import Tipo_Likes.Tipos_de_Likes;
import Tipo_Perfil.Perfil_Usuario;
import Tipo_Resposta.Comentario;

public class Usuario {
	
	public Perfil_Usuario perfil;
	
	public Comentario novo_comentario;
	
	public ArrayList<Amizade> lista_amigos = new ArrayList<Amizade>();
	public ArrayList<Participacao> lista_participacoes = new ArrayList<Participacao>();
	public ArrayList<Postagem> lista_postagens_curtidas = new ArrayList<Postagem>();
	public ArrayList<Postagem> lista_postagens_feitas = new ArrayList<Postagem>();
	
	
	
	public void Pesquisar_no_Facebook(String termo_procurado, Facebook_Database face_bd){
		
		face_bd.Pesquisar_no_Facebook(termo_procurado);
		
	}
	
	
	public void Curtir_Postagem(Usuario user, Postagem postagem){
		
		if(postagem.lista_curtidores.contains(user))
			JOptionPane.showMessageDialog(null, "O usuário já curtiu a publicação!");
		else{
		Tipos_de_Likes like = new Tipos_de_Likes();
		like.Escolher_Tipo_De_Like(postagem);
		
		postagem.lista_curtidores.add(user);
		postagem.Atualizar_Total_Likes();
		this.lista_postagens_curtidas.add(postagem);
		}
	}
	
	public void Solicitar_Amizade(Usuario user, Amizade novo_amigo){
		
		int resposta_solicitacao = novo_amigo.Recebeu_Solicitacao(user);
		
		if(resposta_solicitacao == 0){
			lista_amigos.add(novo_amigo);
			JOptionPane.showMessageDialog(null, novo_amigo.usuario.perfil.getNome()
					+ " foi adicionado a sua lista de amigos.");
		}
		else if(resposta_solicitacao == 1)
			JOptionPane.showMessageDialog
			(null, "A sua solicitação de amizade para " +
			novo_amigo.usuario.perfil.getNome()	+ " foi rejeitada.");
		
		else
			JOptionPane.showMessageDialog
			(null, "Você optou por responder depois. "); 

	}
	
	public Comentario Novo_Comentario(String mensagem){
		
		Comentario comentario = new Comentario(mensagem);
		this.novo_comentario = comentario;
		
		return comentario;
	}
	
	public Postagem Gerar_Postagem(String tipo_postagem, String conteudo){
		
		Postagem postagem = new Postagem(tipo_postagem, conteudo);
		lista_postagens_feitas.add(postagem);
		
		return postagem;
	}
	
	

}
