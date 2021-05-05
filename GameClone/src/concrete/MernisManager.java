package concrete;


import java.rmi.RemoteException;

import abstracts.IGamerCheckService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManager implements IGamerCheckService{

	@Override
	public boolean check(Gamer gamer) {
		boolean result; 
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy(); 
		try { 
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					gamer.getNationalityId(),					
					gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(),
					gamer.getDateOfBirth()
					); 
		}
	    catch (RemoteException e) { 
			result = false; 
			e.printStackTrace(); 
		}
		
		return result;
	}
}