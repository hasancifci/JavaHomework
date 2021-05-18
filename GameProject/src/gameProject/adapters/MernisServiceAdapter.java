package gameProject.adapters;

import gameProject.abstracts.GamerCheckService;
import gameProject.entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean chechIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		try 
		{
			result =client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(),
					gamer.getDateOfBirth().getYear());

		}catch (Exception e) {
		
			e.printStackTrace();
		}
	    return result;
	}

}
