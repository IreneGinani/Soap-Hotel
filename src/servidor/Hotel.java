package servidor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Hotel {
	private static ArrayList<Quarto> quartos = new ArrayList<Quarto>();
	
	// os três pontos serve para dizer que o tamanho das variáveis é flexível, podem ser 1 ou 1 milhão de tipos e precos, sendo par a par, 1
	// preco 1 tipo. 2 preco 2 tipo e assim sucessivamente

	public Hotel(String [] tipos, float [] precos, int [] quantidade_por_tipo) { 
		if ((tipos.length == precos.length) && (precos.length == quantidade_por_tipo.length)) {
			for (int i = 0; i < quantidade_por_tipo.length; i++) {
				for (int j = 0; j < quantidade_por_tipo[i]; j++) {
					Quarto quarto = new Quarto(tipos[i], precos[i]);
					quartos.add(quarto);
				}
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public ArrayList<Quarto> getQuartosVagos() {
		ArrayList<Quarto> quartos_vagos = new ArrayList<Quarto>();
		for (int i = 0; i < quartos.size(); i++) {
			if (quartos.get(i).isVago()) {
				quartos_vagos.add( quartos.get(i) );
			}
		}
		
		return quartos_vagos;
	}
	
	public boolean reservarQuarto(int tipo_quarto, String nome_cliente) {
		
		List<Quarto> busca_quartos = quartos.stream().filter(q -> q.getTipo().equals(tipo_quarto) && q.isVago()).collect(Collectors.toList());
		
		if ( busca_quartos.size() > 0) {
			
			try {
				
				busca_quartos.get(0).reservarQuarto(nome_cliente);
				
			} catch (IllegalArgumentException e) {
				System.out.println("Quarto inválido");
			} catch (IllegalAccessError e) {
				System.out.println("Quarto já está ocupado");
			}
		}
		
		
		
		
		return true;
	}
	
}
