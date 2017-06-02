package Tipo_Usuarios;

import java.util.ArrayList;

import Facebook_BD.Facebook_Database;
import Tipo_Divulgacao.Anuncio;
import Tipo_Perfil.Perfil_Empresa;
import Tipo_Resposta.Comentario;

public class Empresa {
	
	public Perfil_Empresa perfil;
	
	
	public Anuncio Montar_Propaganda(String meu_titulo, String meu_tipo, String meu_corpo_msg,
			double meu_preco_div, Facebook_Database face_bd){
		
		Anuncio anuncio = new Anuncio(meu_titulo, meu_tipo, meu_corpo_msg, meu_preco_div);
		face_bd.Adicionar_Anuncio(anuncio);
		face_bd.Incremento_Banco_Financeiro(this, meu_preco_div);
		
		return anuncio;
	}
}
