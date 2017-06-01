package Tipo_Grupo;

import java.util.ArrayList;

import Tipo_Usuarios.Usuario;

public class Grupo {
	
	private ArrayList<Usuario> lista_usuarios = new ArrayList<Usuario>();
	
	private String ID;
	
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	private String tipo;
	

}
