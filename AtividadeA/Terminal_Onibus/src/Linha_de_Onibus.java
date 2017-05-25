import java.util.ArrayList;

public class Linha_de_Onibus {
	
	String posto_atendimento;
	String garagem;
	int ID_linha;
	ArrayList<Funcionario> lista_funcionarios = new ArrayList<Funcionario>();
	ArrayList<Paradas> linha_circulacao = new ArrayList<Paradas>();
	ArrayList<Onibus> lista_onibus = new ArrayList<Onibus>();
	
	void Chegada_trabalhador(Funcionario funcionario){
		lista_funcionarios.add(funcionario);
		Iniciar_Expediente();
	}
	
	boolean Iniciar_Expediente(){
		
		if(lista_funcionarios.size() >= 2)
			return true;
		
		else
			return false;
	}
	
	
	
	

}
