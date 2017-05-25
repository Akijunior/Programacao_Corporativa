import java.util.ArrayList;

public class Onibus {
	
	String modelo;
	int ID;
	ArrayList<Passageiro> lista_passageiros = new ArrayList<Passageiro>();
	ArrayList<Paradas> lista_rotas = new ArrayList<Paradas>();
	Cobrador cobrador;
	Motorista motorista;
	boolean em_servico;
	
	void Onibus_Em_Trafego(){
		this.em_servico = true;
	}
	
	void Adicionar_Rota(Paradas parada){
		lista_rotas.add(parada);
		
	}

}
