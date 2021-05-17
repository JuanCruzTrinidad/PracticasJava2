package negocio;

import dao.AbonadoDao;
import datos.Abonado;

public class AbonadoABM {

	AbonadoDao abonadoDao = new AbonadoDao();
	
	public Abonado traerAbonado(long dni) {
		return abonadoDao.traerRodado(dni);
	}
}
