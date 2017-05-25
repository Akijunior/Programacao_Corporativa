import java.util.ArrayList;
import java.util.Random;

public class Programa_Fidelidade {
	
	ArrayList<Cliente> lista_clientes = new ArrayList<Cliente>();
	ArrayList<Produto> lista_ofertas_produtos = new ArrayList<Produto>();
	
	void Nova_Oferta(Produto produto){
		this.lista_ofertas_produtos.add(produto);
	}
	
	Cliente Sorteio_Promocional(){
		
		Random sorteador = new Random();
		
		int sorteado = sorteador.nextInt(lista_clientes.size());
		System.out.println("Cliente sorteado: " + lista_clientes.get(sorteado).nome);
		return lista_clientes.get(sorteado);
		
	}

}
