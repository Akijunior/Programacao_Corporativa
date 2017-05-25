
public class Funcionario extends Pessoa{
	
	boolean em_servico = false;
	double salario;
	String cargo;
	String hora_chegada;
	String hora_saida;
	
	void Dirigido_a_servico(){
		this.em_servico = true;
	}

}
