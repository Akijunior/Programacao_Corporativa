package Facebook_BD;

import java.util.ArrayList;

import Tipo_Usuarios.Empresa;
import Tipo_Usuarios.Usuario;

public class Facebook_Database {
	
	ArrayList<Usuario> lista_usuarios = new ArrayList<Usuario>();
	ArrayList<Empresa> lista_empresas = new ArrayList<Empresa>();
	
	double banco_financeiro = 0;
	
	public void Cadastra_Usuario(Usuario user){
		lista_usuarios.add(user);
		System.out.println("O usuário " + user.perfil.getNome() + " foi adicionado com sucesso!");
	}
	
	public void Cadastra_Empresa(Empresa empresa){
		lista_empresas.add(empresa);
		System.out.println("O usuário " + empresa.perfil.getNome() + " foi adicionado com sucesso!");
	}
	
	
	

}
