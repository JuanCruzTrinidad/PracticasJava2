package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.PeajeDao;
import datos.Abonado;
import datos.Manual;
import datos.Rodado;
import datos.Telepeaje;

public class PeajeABM {

	PeajeDao peajeDao = new PeajeDao();
	
	public List<Manual> traerManual(){
		return peajeDao.traerManual();
	}
	
	public List<Telepeaje> traerTelepeaje(){
		return peajeDao.traerTelepeaje();
	}
	
	public List<Manual> traerManual(LocalDate fecha ){
		return peajeDao.traerManual(fecha);
	}
	
	public double  cerrarCaja(LocalDate fecha ){
		List<Manual> manuales =  peajeDao.traerManual(fecha);
		double total = 0;
		for(Manual m: manuales) {
			total = total + m.getPrecio();
		}
		return total;
	}
	
	public List<Telepeaje> traerTelepeaje(Rodado rodado){
		return peajeDao.traerTelepeaje(rodado);
	}
	
	public List<Telepeaje> traerTelepeaje(Abonado abonado){
		return peajeDao.traerTelepeaje(abonado);
	}
}
