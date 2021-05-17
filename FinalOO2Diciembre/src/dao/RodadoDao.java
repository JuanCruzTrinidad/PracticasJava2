package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Rodado;

public class RodadoDao {

	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}
	
	public Rodado traerRodado(String dominio) {
		Rodado objeto = null;
			try {
				iniciaOperacion();
				String strHQL = " from Rodado r where r.dominio = '" + dominio + "'";
				objeto = (Rodado)session.createQuery(strHQL).uniqueResult();
			} finally {
				session.close();
			}
			return objeto;
		}
}
