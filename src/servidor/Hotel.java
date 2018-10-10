package servidor;

import java.util.ArrayList;

public class Hotel {

	private ArrayList<Quarto> quartos = new ArrayList<Quarto>();
	
	// os três pontos serve para dizer que o tamanho das variáveis é flexível, podem ser 1 ou 1 milhão de tipos e precos, sendo par a par, 1
	// preco 1 tipo. 2 preco 2 tipo e assim sucessivamente

	public Hotel(String [] tipos, float [] precos, int [] quantidade_por_tipo) { 
		
		if ((tipos.length == precos.length) && (precos.length == quantidade_por_tipo.length)) {
			for (int i = 0; i < quantidade_por_tipo.length; i++) {
				for (int j = 0; j < quantidade_por_tipo[i]; j++) {
					Quarto quarto = new Quarto(tipos[i], quantidade_por_tipo[i]);
					quartos.add(quarto);
				}
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
