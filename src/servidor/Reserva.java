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
		
		hotel = new Hotel();
	}
	
	@Override
	public ArrayList<Quarto> listarQuartosDisponiveis() {
		return hotel.getQuartosVagos();
	}

	@Override
	public boolean reservarQuarto(int tipo_quarto, String nome_cliente) {
		return hotel.reservarQuarto(tipo_quarto, nome_cliente);
	}
}
 