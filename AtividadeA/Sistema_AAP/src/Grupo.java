import java.util.ArrayList;

public class Grupo {
	
	ArrayList<Funcionario> lista_funcionarios = new ArrayList<Funcionario>();
	ArrayList<Permissao> lista_permissoes = new ArrayList<Permissao>();
	ArrayList<Usuario_Comum> lista_usuarios_comuns = new ArrayList<Usuario_Comum>();
	
	
	void Nova_Permissao(Permissao permissao){
		
		lista_permissoes.add(permissao);
		
	}

}
