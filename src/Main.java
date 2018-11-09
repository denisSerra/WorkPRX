import java.sql.SQLException;
import java.util.ArrayList;

import dao.ConnessioneJDBC;
import dao.ImpiegatoDao;
import dao.RuoloDao;
import dao.StoricoDao;
import model.Impiegato;
import model.Ruolo;
import model.Storico;

public class Main {
	public static void main(String[]args) throws SQLException  {
//		ImpiegatoDao impiegatoDao = new ImpiegatoDao();
		
//		Impiegato impiegato1 = new Impiegato();
//		impiegato1.setNome("Denis");
//		impiegato1.setCognome("Serra");
//		impiegato1.setCodFisc("JHGFJOS12RH9293");
//		impiegato1.setId(1);
		
//		Impiegato impiegato2 = new Impiegato();
//		impiegato2.setNome("Bruno");
//		impiegato2.setCognome("Fino");
//		impiegato2.setCodFisc("BRFI213FEFGH890");
//		impiegato2.setId(2);
		
//		Impiegato impiegato3 = new Impiegato();
//		impiegato3.setNome("Pino");
//		impiegato3.setCognome("Lino");
//		impiegato3.setCodFisc("LPINO4543GDH409");
//		impiegato3.setId(3);
		
		
//		System.out.println(impiegato1);
//		System.out.println(impiegato2);
//		System.out.println(impiegato3);
//		System.out.println(impiegatoDao.creaImpiegato(impiegato1));
//		System.out.println(impiegatoDao.creaImpiegato(impiegato2));
//		System.out.println(impiegatoDao.creaImpiegato(impiegato3));
//		System.out.println(impiegatoDao.modificaImpiegato(1, "Sandro"));
//		System.out.println(impiegatoDao.leggiImpiegato(2));
		
//		RuoloDao ruoloDao = new RuoloDao();
		
//		Ruolo ruolo = new Ruolo();
//		ruolo.setId_impiegato(1);
//		ruolo.setStipendio(1500);
		
//		ruoloDao.creaRuolo(ruolo);
//		System.out.println(ruoloDao.creaRuolo(ruolo));
//		System.out.println(ruoloDao.modificaRuolo(1, 1600));
		
//		StoricoDao storicoDao = new StoricoDao();
//		
//		Storico storico = new Storico();
//		storico.setId_ruolo(1);
//		storico.setData_inizio("1/1/2017");
//		storico.setData_fine("1/1/2018");
//		
//		System.out.println(storicoDao.creaStorico(storico));
//		System.out.println(storicoDao.leggiStorico(1));
//		System.out.println(storicoDao.modificaStorico(1, "1/2/2018"));
		
//		JDBCHelloWorld.query();
//		JDBCHelloWorld.update("Cristoforo", 2);
		
//		ArrayList<Impiegato> arrayListImpiegato= Read.ottieniImpiegati();
//		System.out.println("Tabella impiegato");
//		for(Impiegato i: arrayListImpiegato) {
//		System.out.println(i);
//		System.out.println("-----------------------------------------------------------");
//		}
//		
//		ArrayList<Ruolo> arrayListRuolo = Read.ottieniRuolo();
//		System.out.println("Tabella ruolo");
//		for(Ruolo r:arrayListRuolo) {
//			System.out.println(r);
//			System.out.println("-----------------------------------------------------------");
//		}
		
//		ArrayList<Storico> arrayListStorico= Read.ottieniStorico();
//		System.out.println("Tabella storico");
//		for(Storico s: arrayListStorico) {
//		System.out.println(s);
//		System.out.println("-----------------------------------------------------------");
//		}
		
//		ConnessioneJDBC.updateImpiegato(1, "Nino","Carcio","NNCRO435RP342");
//		ConnessioneJDBC.updateRuolo(2, 2000);
//		ConnessioneJDBC.updateStorico(1, "1/1/2016", "1/1/2017");
		
//		Update.updateImpiegato(1, "Marco","Nappi","MRNPI34R56H502");
//		Update.updateRuolo(3, 3000);
//		Update.updateStorico(3, "3/3/2015", "3/3/2016");
//		Insert.insertImpiegato(1,"Mario","Monco","MROMNO123HPPH505");
//		Insert.insertRuolo(4, 5000);
//		Insert.insertStorico(4, "1/3/2011", "in attività");
		
//		Delete.deleteImpiegato(1);
//		Delete.deleteRuolo(5000);
//		Delete.deleteStorico("in attività");		
	}
}
