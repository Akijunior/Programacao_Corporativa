package Simulador_Testes;

import Facebook_BD.Facebook_Database;
import Tipo_Divulgacao.Postagem;
import Tipo_Perfil.Perfil_Usuario;
import Tipo_Usuarios.Amizade;
import Tipo_Usuarios.Usuario;

public class Testes_Gerais {
	
	public static void main(String[] args) {
		
		Perfil_Usuario perfil = new Perfil_Usuario
				("Carlos", "Rodriguez", "25", "28/04/2015", "Masculino");
		
		Perfil_Usuario perfil_amigo = new Perfil_Usuario
				("Carol", "Rodriguez", "25", "28/04/2015", "Masculino");
		
		Usuario user = new Usuario();
		user.perfil = perfil;
		
		Usuario user_amigo = new Usuario();
		user_amigo.perfil = perfil_amigo;
		
		Amizade amigo = new Amizade();
		amigo.usuario = user_amigo;
		
		
		user.Solicitar_Amizade(user, amigo);
		System.out.println
		("Amigos na minha Yuujinchou atual: " + user.lista_amigos.get(0).usuario.perfil.getNome());
		
	}

}
