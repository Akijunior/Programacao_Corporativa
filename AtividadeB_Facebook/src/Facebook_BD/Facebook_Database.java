package Facebook_BD;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import Tipo_Grupo.Grupo;
import Tipo_Perfil.Perfil_Usuario;
import Tipo_Usuarios.Empresa;
import Tipo_Usuarios.Usuario;

public class Facebook_Database {
	
	ArrayList<Usuario> lista_usuarios = new ArrayList<Usuario>();
	ArrayList<Empresa> lista_empresas = new ArrayList<Empresa>();
	ArrayList<Grupo> lista_grupos = new ArrayList<Grupo>();
	
	double banco_financeiro = 0;
	
	
	public Perfil_Usuario Nova_Conta(){
		
		String nome = JOptionPane.
				showInputDialog("Nome: ");
		String sobrenome = JOptionPane.
				showInputDialog("Sobrenome: ");
		String cel_ou_email = JOptionPane.
				showInputDialog("Celular ou email: ");
		String data_de_nascimento = JOptionPane.
				showInputDialog("Data de nascimento: ");
		String sexo = JOptionPane.
				showInputDialog("Sexo (Masculino/Feminino/Outro): ");
		Perfil_Usuario novo_perfil_usuario = new Perfil_Usuario
				(nome, sobrenome, cel_ou_email, data_de_nascimento, sexo);
		
		return novo_perfil_usuario;
	}
	
	public void Cadastra_Usuario(){
		
		Usuario user = new Usuario();
		Perfil_Usuario novo_perfil_usuario = Nova_Conta();
		user.perfil = novo_perfil_usuario;
		lista_usuarios.add(user);
		System.out.println("O usuário " + user.perfil.getNome() +
				" foi adicionado com sucesso!");
	}
	
	public void Cadastra_Empresa(Empresa empresa){
		lista_empresas.add(empresa);
		System.out.println("O usuário " + empresa.perfil.getNome() +
				" foi adicionado com sucesso!");
	}
	
	
	

}
