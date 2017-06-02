package Tipo_Perfil;

import java.util.ArrayList;

import Facebook_BD.Facebook_Database;
import Tipo_Divulgacao.Anuncio;
import Tipo_Usuarios.Usuario;

public class Perfil_Empresa {
	
	private String nome;
	private String telefone;
	private String tipo;
	private String localizacao;
	private String gerente;
	private String descricao;
	
	private ArrayList<Usuario> lista_funcionarios = new ArrayList<Usuario>();
	private ArrayList<Anuncio> lista_propagandas = new ArrayList<Anuncio>();
	
	
	public Perfil_Empresa(String nome, String tipo, String gerente) {

		this.nome = nome;
		this.tipo = tipo;
		this.gerente = gerente;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public ArrayList<Anuncio> getLista_propagandas() {
		return lista_propagandas;
	}

	public ArrayList<Usuario> getLista_funcionarios() {
		return lista_funcionarios;
	}
	
	public void Adicionar_Funcionario(Usuario user){
		lista_funcionarios.add(user);
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getGerente() {
		return gerente;
	}
	
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

}
