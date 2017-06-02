package Tipo_Perfil;

import javax.swing.JOptionPane;

public class Perfil_Usuario {
	
	private String nome;
	private String sobrenome;
	private String cel_ou_email;
	private String data_de_nascimento;
	private String sexo;
	
	private String local_de_trabalho;
	private String habilidade_profissional;
	private String faculdade;
	private String instituicao_de_ensino;
	private String estado_civil;
	
	public Perfil_Usuario(String nome, String sobrenome,
			String cel_ou_email, String data_de_nascimento, String sexo) {
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
	
	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getCel_ou_email() {
		return cel_ou_email;
	}


	public void setCel_ou_email(String cel_ou_email) {
		this.cel_ou_email = cel_ou_email;
	}


	public String getData_de_nascimento() {
		return data_de_nascimento;
	}


	public void setData_de_nascimento(String data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getLocal_de_trabalho() {
		return local_de_trabalho;
	}


	public void setLocal_de_trabalho(String local_de_trabalho) {
		this.local_de_trabalho = local_de_trabalho;
	}


	public String getHabilidade_profissional() {
		return habilidade_profissional;
	}


	public void setHabilidade_profissional(String habilidade_profissional) {
		this.habilidade_profissional = habilidade_profissional;
	}


	public String getFaculdade() {
		return faculdade;
	}


	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}


	public String getInstituicao_de_ensino() {
		return instituicao_de_ensino;
	}


	public void setInstituicao_de_ensino(String instituicao_de_ensino) {
		this.instituicao_de_ensino = instituicao_de_ensino;
	}
	
	

}
