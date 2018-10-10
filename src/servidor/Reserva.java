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
		String[] tipos = {"1", "2", "3", "4", "5"};
		float[] precos = {23.0f, 43.0f, 100.0f, 59.50f, 69.99f};
		int[] quantidade_por_tipo = {5, 5, 5, 5, 5};
		hotel = new Hotel( tipos, precos, quantidade_por_tipo) ;
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
 