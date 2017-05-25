import java.util.ArrayList;

public class Aviao {
	
	String nome;
	String local_de_destino;
	String horario_ida;
	String horario_chegada;
	String marca;
	ArrayList<Passageiro> lista_passageiros = new ArrayList<Passageiro>();
	Funcionario piloto;
	
	boolean Adicionar_Piloto(Funcionario novo_piloto){
		this.piloto = novo_piloto;
		return true;
	}
	
	boolean Pronto_Para_Partir(){
		if(piloto != null && local_de_destino != null && lista_passageiros.size() >= 20){
			System.out.println("Pronto para partir!");
			return true;
		}
		else{
			System.out.println("Nem todas as condições de voo estão nos conformes."
					+ " Favor, aguardar mais um pouco.");
			return false;
		}
	}
	
	void Adicionar_Passageiro(Passageiro novo_passageiro){
		lista_passageiros.add(novo_passageiro);
	}

}
