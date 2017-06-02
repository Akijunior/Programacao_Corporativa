package Tipo_Perfil;

import javax.swing.JOptionPane;

public class Perfil_Usuario {
	
	private String nome;
	private String sobrenome;
	private String cel_ou_email;
	private String data_de_nascimento;
	private String sexo;
	
	private String estado_civil;
	
	public Perfil_Usuario(String nome, String sobrenome, String cel_ou_email, String data_de_nascimento, String sexo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cel_ou_email = cel_ou_email;
		this.data_de_nascimento = data_de_nascimento;
		this.sexo = sexo;
	}

	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado_civil() {
		return estado_civil;
	}
	
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	
	

}
