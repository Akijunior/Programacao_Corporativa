
public class Funcionario {
	
	String horario_chegada;
	String horario_saida;
	int ID;
	double salario;
	Cargo_Profissional cargo;
	boolean em_servico = false;
	
	void Encaminhado_a_Servico(){
		this.em_servico = true;
	}

}
