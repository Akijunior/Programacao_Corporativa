package Tipo_Likes;

import javax.swing.JOptionPane;

import Tipo_Divulgacao.Postagem;

public class Tipos_de_Likes {
	
	String[] todos_os_tipos = {"curtir", "amei", "haha", "uau", "triste", "grr"};
	
	public void Escolher_Tipo_De_Like(Postagem postagem){
		
		int escolha_de_like = Integer.parseInt(JOptionPane
				.showInputDialog("Digite um numero correspondente a sua reação"
						+ "(1 - Curtir/ 2 - Amei/ 3 - Haha/ 4 - Uau/ 5 - Triste/ 6 - Grr: "));
		if(escolha_de_like == 1)
			postagem.qtd_likes_curtir ++;
		else if(escolha_de_like == 2)
			postagem.qtd_likes_amei ++;
		else if(escolha_de_like == 3)
			postagem.qtd_likes_haha ++;
		else if(escolha_de_like == 4)
			postagem.qtd_likes_uau ++;
		else if(escolha_de_like == 5)
			postagem.qtd_likes_triste ++;
		else if(escolha_de_like == 6)
			postagem.qtd_likes_grr ++;
		
	}

}
