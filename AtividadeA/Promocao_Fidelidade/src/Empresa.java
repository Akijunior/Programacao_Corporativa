import java.util.ArrayList;

public class Empresa {
	
	Programa_Fidelidade novo_programa_fidelidade;
	ArrayList<Cliente> lista_clientes = new ArrayList<Cliente>();
	ArrayList<Funcionario> lista_funcionarios = new ArrayList<Funcionario>();
	
	
	void Novo_Programa_Fidelidade(Programa_Fidelidade novo_programa){
		
		this.novo_programa_fidelidade = novo_programa;
	}
	
	
	void Novo_Cliente(Cliente cliente){
			
			this.lista_clientes.add(cliente);
		}
	
	
	void Novo_Funcionario(Funcionario funcionario){
		
		this.lista_funcionarios.add(funcionario);
	}

}
