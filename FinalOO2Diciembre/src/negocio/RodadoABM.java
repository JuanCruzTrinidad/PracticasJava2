package negocio;

import dao.RodadoDao;
import datos.Rodado;

public class RodadoABM {

	public RodadoDao rodadoDao = new RodadoDao();
	
	public Rodado traerRodeado(String dominio) {
		return rodadoDao.traerRodado(dominio);
	}
}
