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
		
		Facebook_Database face_bd = new Facebook_Database();
		
		Empresa empresa = new Empresa();
		Perfil_Empresa perfil = new Perfil_Empresa("Supermercon", "Comércio", "Eu");
		empresa.perfil = perfil;
		face_bd.Adicionar_Empresa(empresa);
		empresa.Montar_Propaganda("A chave para um tempo melhor gasto!", 
				"Anúncio", "Em breve, site", 2.55, face_bd);
		
		System.out.println("Valor atual no banco do Face: " + face_bd.getBanco_financeiro());
		face_bd.Pesquisar_no_Facebook("mer");
		face_bd.Pesquisar_no_Facebook("em");
		
		
	}
}
