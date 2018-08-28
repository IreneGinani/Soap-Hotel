package padrao;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Servidor {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		LocateRegistry.createRegistry(1099);
		
		ReservaHotel hotel = new ReservaHotel();
		
		Naming.rebind("rmi://localhost/ReservaHotel", hotel);
		System.out.println("Servidor pronto e registrado no RMI Registry.");
	}
}
