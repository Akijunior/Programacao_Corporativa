package Tipo_Usuarios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Tipo_Resposta.Comentario;

public class Amizade {
	
	public Usuario usuario;
	
	String[] acoes_com_amigos_perfil =
		{"Receber notificações", "Sugira amigos...", "Desfazer amizade"};
	
	String[] tipos_de_amigos =
		{"Melhores Amigos", "Conhecidos", "Adicionar a outra lista..."};
	
	String status;
	String data;
	String classificacao;
	
	ArrayList<Usuario> lista_usuarios = new ArrayList<Usuario>();

	
	public int Recebeu_Solicitacao(Usuario user) {
		
		int resposta_solicitacao = JOptionPane.showConfirmDialog
				(null, "Deseja aceitar a solicitação"
				+ "de amizade de " + user.perfil.getNome() + "?");
		
		if(resposta_solicitacao == 0){
			lista_usuarios.add(user); 
		}
		
		return resposta_solicitacao;
		
	}

}
