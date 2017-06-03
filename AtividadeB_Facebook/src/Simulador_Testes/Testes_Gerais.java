package Simulador_Testes;

import Facebook_BD.Facebook_Database;
import Tipo_Divulgacao.Postagem;
import Tipo_Perfil.Perfil_Empresa;
import Tipo_Perfil.Perfil_Usuario;
import Tipo_Usuarios.Amizade;
import Tipo_Usuarios.Empresa;
import Tipo_Usuarios.Usuario;

public class Testes_Gerais {
	
	public static void main(String[] args) {
		
		Usuario user = new Usuario();
		Usuario user2 = new Usuario();
		
		Perfil_Usuario pu = new Perfil_Usuario("Ao", "Hikari", "32", "25", "M");
		user.perfil = pu;
		Perfil_Usuario pu2 = new Perfil_Usuario("Ano", "Hana", "23", "25", "F");
		user2.perfil = pu2;
		
		Amizade novo_amigo = new Amizade();
		novo_amigo.usuario = user2;
		
		user.Solicitar_Amizade(novo_amigo);
		System.out.println(user.lista_amigos.get(0).usuario.perfil.getNome());
		
		user.Desfazer_Amizade(novo_amigo);
		if(user.lista_amigos.size() > 0)
			System.out.println(user.lista_amigos.get(0).usuario.perfil.getNome());
		System.out.println("O usuario atualmente nao conta com nenhum amigo...");
		
	}
}
