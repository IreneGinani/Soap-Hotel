/*
 ===============================================================================
 ARQUIVO............: ReservaHotel.java
 DESCRICAO..........: Codigo-fonte correspondente a definicao de uma interface 
 					  remota, que especifica os metodos a serem providos do lado
 					  servidor.
 AUTOR..............: João Emmanuel e Irene Ginani
 ===============================================================================
*/

package servidor;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "service.IReserva")
public class Reserva implements IReserva {
	private Hotel hotel;
	protected Reserva() { 
		super();
		
		hotel = new Hotel(5, 10);
	}
	
	@Override
	public ArrayList<ArrayList<Quarto>> listarQuartosDisponiveis() {
		return hotel;
	}

	@Override
	public boolean reservarQuarto(int tipo_quarto, String nome_cliente) {
		boolean a = true;
		
		//ALGO
		
		return a;
	}
}
 