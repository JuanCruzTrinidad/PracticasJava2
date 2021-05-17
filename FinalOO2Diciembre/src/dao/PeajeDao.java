package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Abonado;
import datos.Manual;
import datos.Rodado;
import datos.Telepeaje;

public class PeajeDao {
	
	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}
	
	public List<Manual> traerManual(){
		List<Manual> lista = new ArrayList<Manual>();
		try {
			iniciaOperacion();
			String hQL = "from Manual m";
			lista = session.createQuery(hQL).list();
		} finally {
			session.close();
		}
		return lista;
	}
	
	public List<Manual> traerManual(LocalDate fecha ){
		List<Manual> lista = new ArrayList<Manual>();
		try {
			iniciaOperacion();
			String hQL = "from Manual m WHERE m.fecha = :fecha";
			lista = session.createQuery(hQL).setParameter("fecha", fecha).list();
		} finally {
			session.close();
		}
		return lista;
	}
	
	public List<Telepeaje> traerTelepeaje(){
		List<Telepeaje> lista = new ArrayList<Telepeaje>();
		try {
			iniciaOperacion();
			String hQL = "from Telepeaje t";
			lista = session.createQuery(hQL).list();
		} finally {
			session.close();
		}
		return lista;
	}
	
	public List<Telepeaje> traerTelepeaje(Rodado rodado){
		List<Telepeaje> lista = new ArrayList<Telepeaje>();
		try {
			iniciaOperacion();
			String hQL = "SELECT t from Telepeaje t JOIN t.rodado r WHERE r.idRodado ="+rodado.getIdRodado();
			lista = session.createQuery(hQL).list();
		} finally {
			session.close();
		}
		return lista;
	}
	
	public List<Telepeaje> traerTelepeaje(Abonado abonado){
		List<Telepeaje> listaTelepeajes = new ArrayList<Telepeaje>();
		try {
			iniciaOperacion();
				Hibernate.initialize(abonado.getRodados());
				for(Rodado r: abonado.getRodados()) {
					String hQL = "SELECT t from Telepeaje t JOIN t.rodado r WHERE r.idRodado ="+r.getIdRodado();
					listaTelepeajes = session.createQuery(hQL).list();
				}
		} finally {
			session.close();
		}
		return listaTelepeajes;
	}
}
