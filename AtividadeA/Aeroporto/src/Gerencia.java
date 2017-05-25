import java.util.ArrayList;

public class Gerencia {
	
	ArrayList<Funcionario> lista_funcionarios = new ArrayList<Funcionario>();
	ArrayList<Aviao> lista_avioes = new ArrayList<Aviao>();
	
	void Novo_Funcionario(Funcionario novo_funcionario){
		lista_funcionarios.add(novo_funcionario);
	}
	
	void Novo_Aviao(Aviao novo_aviao){
		lista_avioes.add(novo_aviao);
	}

}
