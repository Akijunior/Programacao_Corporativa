package Facebook_BD;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import Tipo_Divulgacao.Postagem;
import Tipo_Divulgacao.Anuncio;
import Tipo_Grupo.Grupo;
import Tipo_Perfil.Perfil_Usuario;
import Tipo_Usuarios.Empresa;
import Tipo_Usuarios.Usuario;

public class Facebook_Database {
	
	ArrayList<Usuario> lista_usuarios = new ArrayList<Usuario>();
	ArrayList<Empresa> lista_empresas = new ArrayList<Empresa>();
	ArrayList<Postagem> lista_postagens = new ArrayList<Postagem>();
	ArrayList<Anuncio> lista_anuncios = new ArrayList<Anuncio>();
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
	
	public void Adicionar_Usuario(Usuario user){
		
		lista_usuarios.add(user);
	}
	
	public void Adicionar_Postagem(Postagem postagem){
		
		lista_postagens.add(postagem);
	}
	
	public void Adicionar_Anuncio(Anuncio anuncio){
			
		lista_anuncios.add(anuncio);
	}
	
	public void Adicionar_Empresa(Empresa empresa){
		
		lista_empresas.add(empresa);
	}
	
	public void Adicionar_Grupo(Grupo grupo){
		
		lista_grupos.add(grupo);
	}
	
	public void Incremento_Banco_Financeiro(Empresa empresa, double valor){
		
		banco_financeiro += valor;
	}
	
	public void Cadastra_Usuario(){
		
		Usuario user = new Usuario();
		Perfil_Usuario novo_perfil_usuario = Nova_Conta();
		user.perfil = novo_perfil_usuario;
		Adicionar_Usuario(user);
		System.out.println("O usuário " + user.perfil.getNome() +
				" foi adicionado com sucesso!");
	}
	
	public void Cadastra_Empresa(Empresa empresa){
		lista_empresas.add(empresa);
		System.out.println("O usuário " + empresa.perfil.getNome() +
				" foi adicionado com sucesso!");
	}
	
	public void Pesquisar_no_Facebook(String alvo_consulta){
		
		System.out.println("Pessoas:\n");
		for(Usuario user : lista_usuarios){
			if(user.perfil.getNome().contains(alvo_consulta) || 
					user.perfil.getSobrenome().contains(alvo_consulta))
				System.out.println(user.perfil.getNome() + " " + user.perfil.getSobrenome());
		}
		
		System.out.println("\nGrupos:\n");
		for(Grupo grupo : lista_grupos){
			if(grupo.getNome().contains(alvo_consulta))
				System.out.println(grupo.getNome());
		}
		
		System.out.println("\nEmpresas:\n");
		for(Empresa empresa : lista_empresas){
			if(empresa.perfil.getNome().contains(alvo_consulta))
				System.out.println(empresa.perfil.getNome());
		}
		
		System.out.println("\nAnúncios:\n");
		for(Anuncio anuncio : lista_anuncios){
			if(anuncio.getTitulo().contains(alvo_consulta))
				System.out.println(anuncio.getTitulo());
		}
		
		System.out.println("\nPostagens: \n");
		for(Postagem postagem : lista_postagens){
			if(postagem.tipo.contains(alvo_consulta))
				System.out.println(postagem.tipo);
		}
	}
	
	public ArrayList<Usuario> getLista_usuarios() {
		return lista_usuarios;
	}

	public ArrayList<Empresa> getLista_empresas() {
		return lista_empresas;
	}

	public ArrayList<Postagem> getLista_postagens() {
		return lista_postagens;
	}

	public ArrayList<Grupo> getLista_grupos() {
		return lista_grupos;
	}

	public double getBanco_financeiro() {
		return banco_financeiro;
	}


}
