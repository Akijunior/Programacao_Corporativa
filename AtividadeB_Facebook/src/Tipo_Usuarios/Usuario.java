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
	public ArrayList<String> lista_notificacoes = new ArrayList<String>();
	
	
	
	public void Pesquisar_no_Facebook(String termo_procurado, Facebook_Database face_bd){
		
		face_bd.Pesquisar_no_Facebook(termo_procurado);
		
	}
	
	
	public void Curtir_Postagem(Postagem postagem){
		
		if(postagem.lista_curtidores.contains(this))
			JOptionPane.showMessageDialog(null, "O usuário já curtiu a publicação!");
		else{
		Tipos_de_Likes like = new Tipos_de_Likes();
		like.Escolher_Tipo_De_Like(postagem);
		
		postagem.lista_curtidores.add(this);
		postagem.Atualizar_Total_Likes();
		this.lista_postagens_curtidas.add(postagem);
		}
	}
	
	public void Solicitar_Amizade(Amizade novo_amigo){
		
		int resposta_solicitacao = novo_amigo.Recebeu_Solicitacao(this);
		String mensagem;
		
		if(resposta_solicitacao == 0){
			lista_amigos.add(novo_amigo);
			mensagem = novo_amigo.usuario.perfil.getNome()
					+ " foi adicionado a sua lista de amigos.";
			
			JOptionPane.showMessageDialog(null, mensagem);
			lista_notificacoes.add(mensagem);
		}
		else if(resposta_solicitacao == 1){
			mensagem = "A sua solicitação de amizade para " +
					novo_amigo.usuario.perfil.getNome()	+ " foi rejeitada.";
			
			JOptionPane.showMessageDialog(null, mensagem);
			lista_notificacoes.add(mensagem);
		}
		
		else
			JOptionPane.showMessageDialog
			(null, "Você optou por responder depois. "); 
	}
	
	public void Desfazer_Amizade(Amizade amigo) {
		
		int resposta_solicitacao = JOptionPane.showConfirmDialog(null, "Deseja realmente remover"
				+ amigo.usuario.perfil.getNome() + " da sua lista de amigos?");
		
		if(resposta_solicitacao == 0){
			for(Amizade friend : lista_amigos){
				if(amigo.equals(friend)){
					
					lista_amigos.remove(friend); 
					amigo.Remover_Amizade(this);
					String mensagem = "A amizade com " + amigo.usuario.perfil.getNome()
					+ " acaba de ser desfeita.";
					System.out.println(mensagem);
					lista_notificacoes.add(mensagem);
					
				}
			}	
		}
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
